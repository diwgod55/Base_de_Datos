import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.TreeMap;
import java.util.Map;

public class AnalizarCodigosPostales {
    public static void main(String[] args) {
       
        String ruta = "codigos_postales_hmo.csv";

       
        Map<String, Integer> conteo = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
             
                linea = linea.trim();

                if (linea.isEmpty()) continue;

             
                String[] columnas = linea.split(",");

                if (columnas.length >= 1) {
                   
                    String cp = columnas[0].replace("\uFEFF", "").trim();

                    if (!cp.isEmpty()) {
                        conteo.put(cp, conteo.getOrDefault(cp, 0) + 1);
                    }
                }
            }

            System.out.println(" RESULTADOS DEL ANÁLISIS (HERMOSILLO) ");
           

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
