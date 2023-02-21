import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> d = new ArrayList<Student>();
        Student s1 = new Student(1,"Varun");
        Student s2 = new Student(2,"Varu");
        d.add(s1);
        d.add(s2);
        for(Student i:d){
            System.out.println(i.getName()+" "+i.getRollno());
        }



    }
}