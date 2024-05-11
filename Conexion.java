import java.io.*;
import java.net.*;


public class Conexion{
		
	final String host="localhost";
	final int port = 1234;
	protected Socket socketCliente;
	protected ServerSocket socketServidor;
	protected DataOutputStream mensajeAEnviar;
	protected DataOutputStream salidaEnviar;
	public Conexion(String tipo) throws IOException{
		if(tipo =="servidor"){	
			socketServidor=new ServerSocket(port);
			socketCliente= new Socket();	
		}else{
			socketCliente = new Socket(host,port);
		
		}
	
	}


}