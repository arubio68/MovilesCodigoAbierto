package com.cice.javatutorial.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fs = System.getProperty("file.separator");
		
		File file = new File("src"+fs+"com"+fs+"cice"+fs+"javatutorial"+fs+"ArrayTest.java");
		if(file.exists()){
			/*
			try(
				InputStream in = new FileInputStream(file);
				OutputStream out =  new FileOutputStream("copy.test");
				)
			{
				int byteLeido;
				while ((byteLeido=in.read())!=-1){
					out.write(byteLeido);	
				}
			} catch (FileNotFoundException e){
				e.printStackTrace();
			} catch (IOException e){
					e.printStackTrace();
			}
			*/
			
			try(
					InputStream in = new FileInputStream(file);
					OutputStream out =  new FileOutputStream("copy.test");
					)
				{
					int bytesLeidos = 0;
					byte[] buffer = new byte[1024];
					
					do {
						bytesLeidos = in.read(buffer);
						if (bytesLeidos>0){
							out.write(buffer,0,bytesLeidos);
						}
						
					} while (bytesLeidos == buffer.length);
					
				} catch (FileNotFoundException e){
					e.printStackTrace();
				} catch (IOException e){
						e.printStackTrace();
				}
			
		}
	}

}
