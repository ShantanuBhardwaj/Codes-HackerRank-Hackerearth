
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.*;
public class DateSorter{
public static void main(String args[])
{
    List<Date> listDates = new ArrayList<Date>();
    SimpleDateFormat dateFormatter = new SimpleDateFormat("dd MMMM yyyy");
   try {
    listDates.add(dateFormatter.parse("03 July 2000"));
    listDates.add(dateFormatter.parse("19 August 1993"));
    listDates.add(dateFormatter.parse("01 July 1954"));
} catch (ParseException ex) {
    System.err.print(ex);
}
System.out.println("Before sorting: " + listDates);
 
Collections.sort(listDates);
 
System.out.println("After sorting: " + listDates);
}
}