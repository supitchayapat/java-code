package lesson8io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Io07 {

	public static void main(String[] args) {

		//อ่านไฟล์
		String filename = "restaurant.txt";
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		try {
			FileReader fileReader = new FileReader(filename);
			BufferedReader buffer = new BufferedReader(fileReader);

			String line;
			for (line = buffer.readLine(); line != null; line = buffer.readLine()) {
				String[] data = line.split(",");
				String name = data[0].trim();
				String type = data[1].trim();
				String area = data[2].trim();
				int rating = Integer.parseInt(data[3].trim());

				Restaurant r = new Restaurant(name, type, area);
				r.setRating(rating);
				restaurants.add(r);
			}	
		}
		catch (FileNotFoundException e){
			System.err.println("Cannot read file "+filename);
		}		
		catch (IOException e){
			System.err.println("Error reading from file");
		}		

	}
}
