package edu.kh.network.client.model.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientService {

	// TCP Socket 프로그래밍
	
	public void serverStart() {
		
		// 1. 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
		
		String serverIP = "137.0.0.1"; // loop back IP(현재 컴퓨터를 나타내는 IP)
		int port = 8500;
		
		
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		
		try {
			
			clientSocket = new Socket(serverIP, port);
			// UnknownHostException : IP가 잘못 되었을 때 발생하는 예외
			
			// 2. 서버와의 입출력 스트림 오픈
			if(clientSocket != null) { // 서버가 연결이 성공한 경우
				
				is = clientSocket.getInputStream();
				os = clientSocket.getOutputStream();
				
			}
			
			// 3. 보조 스트림을 통해 성능 개선
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			
			// 4. 스트림을 통해 읽고 쓰기
			String serverMessage = br.readLine();
			// 서버 -> 클라이언트에게 보낸 메세지를 저장
			System.out.println(serverMessage);
 			
		
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			// 5. 통신 종료
			
		}
	
	}
	
	
}
