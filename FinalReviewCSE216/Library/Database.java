package Library;

public class Database {
	
	Record[] base;	
	int initial_size ;
	
	public Database(int initial_size) {
		
		if(initial_size <= 0 ) {
			initial_size = 1;
		}
		base = new Record[initial_size];
		this.initial_size = initial_size;
	}
	
	public Record find(Key k) {
		for (int i = 0; i < base.length; i++) {
			if (base[i] != null && base[i].getKey().equals(k)) {
				return base[i];
			} 	// 
		}
		return null;
	}
	
	public boolean delete(Key k) {
		for(int i=0; i<initial_size ; i++) {
			if(base[i].getKey().equals(k)) {
				base[i] = null;
				return true;
			}
		}
				return false;
	}
	
	public boolean insert(Record r) {
		if(find(r.getKey()) ==null) {
			for(int i=0 ; i <initial_size ; i++) {
				if(base[i] == null) {
					base[i] = r;
					return true;
				}
			}	 
					Record[] new_base = new Record[initial_size *2];
					for(int  j= 0 ; j< initial_size ; j++)
					{
						new_base[j] = base[j];
						
					}
					base = new_base;         		//
					base[initial_size] = r;
					return true;
				}
				
		
		return false;
		
	} 			
	public Record[] getBase() {
		return base;
	}

	public static void main(String[] args) {
			Database db = new Database(100);
//			Record[] base1 = db.getBase();
			Record r1 = new Record(new Key("QA" , 13) , "작가" ,130000    );
			Record r2 = new Record(new Key("SDA" , 54) , "개복치" ,15235000    );
			db.insert(r1);
			db.insert(r2);
			System.out.println(db.delete(r2.getKey()));
			
			System.out.println(r1);
			System.out.println(r2);
			System.out.println(db.base[1]);
			System.out.println(db.base[0]);
			
	}

}
