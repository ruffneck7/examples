package org.ruff.example.java.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileStreamExample {

	public static void main(String[] args) throws IOException {
		
		//TODO 적을 때 encoding은??

		FileOutputStream outputStream = new FileOutputStream("d:\\out4.txt"); //either d:/ or d:\\
		for(int i=0; i<11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			outputStream.write(data.getBytes());
		}
		outputStream.close();

		outputStream = new FileOutputStream("..\\out6.txt"); //either d:/ or d:\\
		outputStream.write(1);
		outputStream.close();
		
		
		FileInputStream is = new FileInputStream("d:/out4.txt");
		byte[] arrByte = new byte[1024];
		is.read(arrByte);

		System.out.println(new String(arrByte));
		
		
		
		FileReader fr = new FileReader("d:/out4.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String readLine = br.readLine();
			if(readLine == null) break;
			System.out.println(readLine);
		}
		br.close();
		
		
		
		
		System.out.println("done");


	}

}
