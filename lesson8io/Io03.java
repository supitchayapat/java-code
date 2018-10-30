package lesson8io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Io03 {

	public static void main(String[] args) {

		try {
			InputStreamReader inReader = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(inReader);

			System.out.println("Enter line: ");
			while (true) {
				String line = buffer.readLine();

				if (line.equals("bye")) 
					break;
				
				System.out.println("-----> " + line);
			}			
		}
		catch (IOException e){
			System.err.println("Error reading from user");
		}		

	}
}
