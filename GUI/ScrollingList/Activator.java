package ScrollingList;

public class Activator {

	public static void main(String[] args) {
		  { int how_many_counters = 8;
		    Counter2[] counters = new Counter2[how_many_counters];  // the model
		    for ( int i = 0;  i != how_many_counters;  i = i+1 )
		        { counters[i] = new Counter2(0, i); }               // see below
		    new ListFrame(counters);                                // the view
		  }
		
	}

}
