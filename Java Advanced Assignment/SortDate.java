
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class SortDate {
	public static void main(String[] args) {
        
		List<Date> myList = new ArrayList<>();
		myList.add(new Date(2012-1900, 10, 01));
        myList.add(new Date(2012-1900, 11, 01));
        myList.add(new Date(2015-1900, 01, 10));
        myList.add(new Date(2015-1900, 01, 01));
        myList.add(new Date(2013-1900, 01, 01));
        myList.add(new Date(2013-1900, 01, 02));
        
         
        Collections.sort(myList, new Comparator<Date>(){
 
            @Override
            public int compare(Date o1, Date o2) {
                return o1.compareTo(o2);
            }
        });
         
        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i).toString());
        }
 
    }

}
