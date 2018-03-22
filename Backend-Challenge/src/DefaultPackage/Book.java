package DefaultPackage;

public class Book {
	private String name, author;
	private int price;
	
	public Book(String name, int price, String author)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	public String getName() 
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	@Override
	public String toString()
	{
		return "Book [name=" + name + ", price=" + 
			   price + ", author=" + author + "]";
	}
}
