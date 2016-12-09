package collections;

import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAccessor;
import java.util.EnumSet;
import java.util.Locale;

public class EnumSetEX {

	public static void main(String[] args ) {
		// Create an EnumSet that contains all months of the year.
		EnumSet year = EnumSet.allOf(Month.class);
		System.out.println("Months of the year is ::" + year.size());
				for (Month c : Month.values())
					System.out.println(c);    		
		
		
		
		
	}

}
