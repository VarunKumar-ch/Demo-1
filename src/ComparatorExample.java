import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {

        StudentComparator s1 = new StudentComparator("Connect",101);
        StudentComparator s2 = new StudentComparator("Connected",201);
        StudentComparator s3 = new StudentComparator("Connectedw",211);
        ArrayList<StudentComparator> e = new ArrayList<StudentComparator>();
        e.add(s1);
        e.add(s2);
        e.add(s3);
       Collections.sort(e, new SortComparator());
       for(StudentComparator i:e){
           System.out.println(i.getName() +" "+ i.getMarks());
       }

    }
}

     class SortComparator implements Comparator{

         @Override
         public int compare(Object o1, Object o2) {
           StudentComparator a = (StudentComparator) o1;
           StudentComparator b = (StudentComparator) o2;
           if(a.getMarks()< b.getMarks()){
               return 1;
           }else{
               return -1;
           }

         }
     }
