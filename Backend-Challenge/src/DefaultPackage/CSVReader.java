package DefaultPackage;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List;

public class CSVReader {
	public static void main(String... args) 
	{ 
		List<Book> books = readBooksFromCSV("books.csv"); 
		
		for(Book b : books) 
		{
			System.out.println(b);
		}
	}
	
	private static List<Book> readBooksFromCSV(String fileName)
	{
		List<Book> books = new ArrayList<Book>();
		Path pathToFile = Paths.get(fileName);
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile, 
				StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
			
			while(line != null)
			{
				String[] attributes = line.split(",");
				
				Book book = createBook(attributes);
				books.add(book);
				
				line = br.readLine();
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return books;
	}
	
	private static Book createBook(String[] metadata)
	{
		String name = metadata[0];
		int price = Integer.parseInt(metadata[1]);
		String author = metadata[2];
		
		return new Book(name, price, author);
	}
	
}
