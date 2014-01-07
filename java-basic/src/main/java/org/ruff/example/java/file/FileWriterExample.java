package org.ruff.example.java.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterExample {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("D:/out7.txt");
		for (int i = 0; i < 11; i++) {
			
			String data = i + "번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
		
		PrintWriter pw = new PrintWriter("d:\\out8.txt");
		for (int i = 0; i < 10; i++) {
			pw.println( i + "번째 줄입니다.");
		}
		pw.close();
		
	}

}
