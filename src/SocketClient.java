import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class SocketClient {

	private final String HOST = "192.168.20.6";
	private final int PUERTO = 9000;

	public void Initialize() {
		try {
			
			int contador = 0;
			while (contador <= 2) {
				Socket sc = new Socket(HOST, PUERTO);
				
				String telefono = getDataUser();
				DataOutputStream out = new DataOutputStream(sc.getOutputStream());
				out.writeUTF(telefono);
				out.flush();	
				
				ObjectInputStream in = new ObjectInputStream(sc.getInputStream());
				Ciudad_Persona mensaje_recibido = (Ciudad_Persona)in.readObject();
				
				
				if(mensaje_recibido.getMensaje_error() != null &&  mensaje_recibido.getMensaje_error().length() > 0) {
					System.out.println(mensaje_recibido.getMensaje_error());												
				}else {
					System.out.println("Ciudad: " + mensaje_recibido.getCiud_nombre());
					System.out.println("direccion: " + mensaje_recibido.getDir_direccion());
					System.out.println("nombre: " + mensaje_recibido.getDir_nombre());
					System.out.println("telefono: " + mensaje_recibido.getDir_tel());
				}
				
				contador++;
				sc.close();	
			}
			
			

		} catch (IOException ex) {
			Logger.getLogger(SocketClient.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String getDataUser() {
		
		Scanner scanner = new Scanner(System.in);
		String telefono = null;

		System.out.print(
				"Ingrese el numero de telefono que desea consultar: ");
		telefono = scanner.next();

		return telefono;
	}


}
