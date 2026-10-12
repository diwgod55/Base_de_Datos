Análisis de Códigos Postales de Hermosillo

Proyecto desarrollado en Java para analizar un archivo CSV con información de códigos postales y asentamientos de Hermosillo, Sonora, México.

El programa procesa los datos, cuenta cuántas veces aparece cada código postal y presenta los resultados ordenados para facilitar la consulta y el análisis de la información.

Objetivo del proyecto

Aplicar conceptos de programación en Java para procesar archivos CSV, organizar información mediante estructuras de datos y generar estadísticas básicas a partir de un conjunto de registros geográficos.

Tecnologías utilizadas
Java: lenguaje utilizado para desarrollar el programa.
Java Collections Framework: uso de Map y TreeMap para almacenar y ordenar los resultados.
Java I/O: lectura del archivo CSV mediante BufferedReader y FileReader.
CSV: formato utilizado para almacenar los datos de entrada.

Estructura del proyecto
Base_de_Datos/
├── AnalizarCodigosPostales.java
├── codigos_postales_hmo.csv
└── README.md

Funcionamiento

El programa realiza las siguientes operaciones:

Lectura del archivo: abre codigos_postales_hmo.csv y procesa sus líneas.
Limpieza de datos: elimina espacios innecesarios y el carácter BOM cuando está presente.
Extracción de códigos postales: obtiene el primer campo de cada registro.
Conteo de registros: utiliza un TreeMap para contar cuántas veces aparece cada código postal.
Presentación de resultados: imprime los códigos postales y sus respectivos conteos en orden ascendente.
Resumen final: muestra la cantidad de códigos postales únicos encontrados.
Resultados del análisis

De acuerdo con el análisis realizado sobre el archivo CSV, se obtuvieron los siguientes resultados:

Métrica	Resultado
Registros procesados	2,133
Códigos postales únicos	156
Registros asociados al código postal 83303	215
Registros asociados al código postal 83300	202
Registros asociados al código postal 83334	160

Nota: el número de apariciones representa la cantidad de registros asociados a cada código postal en el archivo, no necesariamente el número de colonias únicas.

Conceptos aplicados
Lectura de archivos de texto.
Procesamiento de cadenas de caracteres.
Uso de colecciones en Java.
Conteo de frecuencias mediante mapas.
Ordenamiento de claves con TreeMap.
Manejo de excepciones mediante try-catch.
Limpieza y validación básica de datos.
Requisitos

Para ejecutar el proyecto se necesita:

Tener instalado el JDK de Java.
Contar con el archivo codigos_postales_hmo.csv.
Disponer de una terminal o un entorno de desarrollo compatible con Java.
Instrucciones de ejecución
1. Clonar el repositorio
git clone https://github.com/diwgod55/Base_de_Datos.git
cd Base_de_Datos
2. Compilar el programa

Si el archivo Java se encuentra en el directorio actual, ejecuta:

javac AnalizarCodigosPostales.java
3. Ejecutar el programa
java AnalizarCodigosPostales

El archivo CSV debe encontrarse en el directorio de trabajo desde el que se ejecuta el programa, ya que se utiliza una ruta relativa.
Ejemplo de salida
RESULTADOS DEL ANÁLISIS (HERMOSILLO)

Código postal: 83000 - Número de asentamientos: 1
Código postal: 83010 - Número de asentamientos: ...
Total de códigos postales únicos: 156

Los resultados completos dependen del contenido del archivo CSV utilizado durante la ejecución.

Autor

Diego Torres

Estudiante de Ingeniería en Sistemas de Información.

GitHub: @diwgod55

Propósito académico

Este proyecto forma parte de las prácticas de programación y análisis de datos, con énfasis en el procesamiento de archivos y la aplicación de estructuras de datos para obtener información útil.
