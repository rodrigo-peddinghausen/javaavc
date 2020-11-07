package javachat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) {
		//TCP/IP -> porta => socket
		try {
			ServerSocket server = new ServerSocket(10000);
			System.out.println("Porta 10000 aberta. Aguardando conexao do cliente...");
			
			Socket client = server.accept();
			System.out.println("Conexão do cliente " + client.getInetAddress().getHostAddress());
			
			Scanner s = new Scanner(client.getInputStream());
			while(s.hasNextLine()) {
				System.out.println(s.nextLine());
			}
			
			s.close();
			client.close();
			server.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
