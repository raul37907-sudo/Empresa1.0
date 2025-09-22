	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.Paths;

	public class Crud {

	    public static void reemplazar(String rutaArchivo) {
	      //  String rutaArchivo = "ruta/a/tu/archivo.txt"; // Reemplaza con la ruta de tu archivo
	        String palabraVieja = " MANUEL"; // Reemplaza con la palabra a reemplazar
	        String palabraNueva = " MANUELA"; // Reemplaza con la nueva palabra

	        try {
	            Path temp = Files.createTempFile("temp", ".txt"); // Crear archivo temporal
	            try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
	                 BufferedWriter writer = new BufferedWriter(new FileWriter(temp.toFile()))) {

	                String linea;
	                while ((linea = reader.readLine()) != null) {
	                    String nuevaLinea = linea.replace(palabraVieja, palabraNueva);
	                    writer.write(nuevaLinea + System.lineSeparator());
	                }
	            }
	            // Reemplazar el archivo original con el temporal
	            Files.move(temp, Paths.get(rutaArchivo), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
	            System.out.println("Archivo modificado exitosamente.");

	        } catch (IOException e) {
	            System.err.println("Error al modificar el archivo: " + e.getMessage());
	        }
	    
	}
	
}
