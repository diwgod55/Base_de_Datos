import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.TreeMap;
import java.util.Map;

public class AnalizarCodigosPostales {
    public static void main(String[] args) {
        // Asegúrate de que esta ruta sea la correcta en tu Linux
        String ruta = "codigos_postales_hmo.csv";

        // Usamos TreeMap para que los resultados salgan ordenados por número de CP
        Map<String, Integer> conteo = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                // 1. Limpiar espacios y caracteres invisibles de Windows (\r)
                linea = linea.trim();

                if (linea.isEmpty()) continue;

                // 2. Separar por coma
                String[] columnas = linea.split(",");

                if (columnas.length >= 1) {
                    // 3. Extraer el CP y limpiar caracteres raros al inicio (UTF-8 BOM)
                    String cp = columnas[0].replace("\uFEFF", "").trim();

                    if (!cp.isEmpty()) {
                        conteo.put(cp, conteo.getOrDefault(cp, 0) + 1);
                    }
                }
            }

            // 4. Imprimir de forma elegante
            System.out.println("==========================================");
            System.out.println(" RESULTADOS DEL ANÁLISIS (HERMOSILLO) ");
            System.out.println("==========================================");

            for (Map.Entry<String, Integer> entrada : conteo.entrySet()) {
                System.out.printf("Código postal: %s - Número de asentamientos: %d%n",
                        entrada.getKey(), entrada.getValue());
            }

            System.out.println("==========================================");
            System.out.println("Total de códigos postales únicos: " + conteo.size());

        } catch (Exception e) {
            System.out.println("Hubo un error al leer el archivo. Verifica que la ruta sea correcta.");
            e.printStackTrace();
        }
    }
}