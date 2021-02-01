package Library;

public class Record {
	
	private Key catalog_numbers;
	private String author;
	private int price;
	
	public Record(Key k , String author , int price ) {
		catalog_numbers = k;
		this.author = author;
		this.price = price ;
	}
	
	public Key getKey() {
		return catalog_numbers;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return catalog_numbers.toString() + author +" " +  price;
}
	
}
	