package ChuyenDuLieu;

import java.io.*;
import java.net.*;

public class Client {

	public static void main(String[] args) throws  IOException {
		String sfile = "D:\\Nhac Duy tri che do\\2Diem danh.wav";
		int port = 12345;
		String ip = "127.0.0.1";
		
		Socket socket = new Socket(ip, port);
		
		OutputStream out = socket.getOutputStream();
		
		File file = new File(sfile);
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		int c;
		while ((c = bis.read()) != -1) {
			out.write(c);
		}
			bis.close();
			socket.close();
		System.out.println("xong");
	}
}
