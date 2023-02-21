import java.util.*;

public class Arrays {
    public static void main(String[] args) {
//        ArrayList<String> d = new ArrayList<String>();
//        d.add("ram");
//        d.add("tom");
//        d.add("ravi");
//        d.add("tanvi");
//        d.add("vikas");
//        ArrayList<String> e = new ArrayList<String>();
//        e.add("jhon");
//        e.add("ravi");
//        e.add("abhi");
//        e.add("vikas");
//        e.add("faisal");
//        for(String i:d){
//            for(String j:e){
//                if(i == j){
//                    System.out.println(i);
//                }
//            }
//        }
//        List<Integer> linked = new LinkedList<Integer>();
//        ArrayList<Integer> c= new ArrayList<Integer>();
//        linked.add(1);
//        linked.add(2);
//        Integer x = linked.get(0);
//        System.out.println(x);

       Set<Integer> st = new LinkedHashSet<>();
       ArrayList<Integer> d = new ArrayList<Integer>();
       d.addAll(List.of(new Integer[]{8,1, 2, 1, 2, 1}));
       for(Integer i=0;i<d.size();i++){
           st.add(d.get(i));
       }
        System.out.println(st);
    }
}
