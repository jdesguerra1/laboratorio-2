import java.io.*;

public class GestorArchivo {
    private String rutaClientes = "clientes.csv";

    public void guardarCliente(Cliente cliente) {
        // El 'true' en FileWriter permite que se agregue al final (append)
        try (FileWriter fw = new FileWriter(rutaClientes, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            
            String linea = cliente.getId() + "," + 
                           cliente.getNombre() + "," + 
                           cliente.getApellido() + "," + 
                           cliente.getTelefono() + "," + 
                           cliente.getActivo();
            
            out.println(linea);
            System.out.println("¡Cliente guardado con éxito en el archivo!");
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}