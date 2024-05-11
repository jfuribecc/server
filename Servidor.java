import java.io.*;

public class Servidor extends Conexion{

	String mensaje;
	public Servidor() throws IOException{
		super("servidor");
	}
	public void iniciarServidor(){
		try{
			System.out.println("FUNCIONA, que alegria");
			socketCliente = socketServidor.accept();
			System.out.println("Se han conectado al servidor");
			mensajeAEnviar = new DataOutputStream(socketCliente.getOutputStream());
			mensajeAEnviar.writeUTF("Hola");
			BufferedReader mensajeEntrante = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
			while((mensaje = mensajeEntrante.readLine()) !=null){
				System.out.println(mensaje);
			}
			System.out.println("La comunicacion ha acabado satisfactoriamente");
			socketServidor.close();
		}catch(Exception e){
			System.out.println("Se rompio todo. Recapacita");
		}
	}
}