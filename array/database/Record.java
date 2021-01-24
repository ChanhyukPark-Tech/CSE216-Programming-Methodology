
public class Record {
	//the names of the fields describe their contents:
	
	private Key catalog_number;
	private String title;
	private String author;
	private int publication_date;
	private boolean is_borrowed_by_someone;
	
	
	public Record(Key num, String a , String t , int data) {
		catalog_number = num;
		title = a;
		author = t;
		publication_date = data;
		is_borrowed_by_someone = false;
	}
	
	public Key getKey() { return catalog_number;}
	public Key keyOf() { return catalog_number;}
	
	public String getTitle() {
		return title;
	}
	public String getauthor() {
		return author;
	}
	public int getData() {
		return publication_date;
		}
	
	public String toString() { 
		return catalog_number.toString() + " " + getTitle();
		}
	
	
	}
	

