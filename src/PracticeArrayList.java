import java.util.*;

public class PracticeArrayList {
    public static void main(String[] args) {
   //1)
    //     1)
//        ArrayList<Integer> d = new ArrayList<Integer>();
//        d.addAll(List.of(new Integer[]{3,2,4}));
//        Scanner sc =new Scanner(System.in);
//        System.out.println(d.getClass().getName());
//        int n = sc.nextInt();
//        Collections.sort(d);
//        d.remove(0);
//        d.remove(0);
//        System.out.println(d);
//        Integer j =d.size()-1;
//        Integer i=0;
//        d.get(i);
//       while(i<j){
//           int a = d.get(i);
//           int b = d.get(j);
//           if((a+b) == n){
//               System.out.println(i+" "+j);
//               break;
//           }else if((a+b)>n){
//               j--;
//           }else if((a+b)<n){
//               i++;
//           }
//       }
//
//        System.out.println("Not found");
//        for(Integer i=0;i<d.size();i++){
//               int sum =0;
//            for(Integer j =i+1;j<d.size();j++){
//                sum = d.get(i)+d.get(j);
//                if(sum == n){
//                    System.out.println(i+" "+j);
//                }
//            }
//        }

      //2)
//        LinkedList<Integer> temp = new LinkedList<Integer>();
//        temp.add(1);
//        temp.add(2);
//        temp.add(3);
//        temp.addFirst(4);
//        temp.addLast(8);
//        temp.pollLast();
//        temp.pollFirst();
//        temp.remove(2);
//        System.out.println(temp);
//        List<Integer> retemp = addFunction(temp,1);
//        System.out.println(retemp);
//
//    }
//    private static List<Integer> addFunction(List<Integer> temp,Integer y){
//        temp.add(y);
//        return temp;
//    }


        //3)
//        Integer nums[] = {1,2,33};
//        ArrayList<Integer> d = new ArrayList<Integer>();
//        d.addAll(List.of(new Integer[]{4,1,4,0,3,5}));
//
//        //Collections.addAll(d,nums);
//        Collections.sort(d);
//        System.out.println(d);
//
//        HashSet<Float> st = new HashSet<Float>();
//        int i =0;
//        int j= d.size()-1;
//        while(i<j){
//            float f = (d.get(i)+d.get(j));
//            f/=2;
//            System.out.println(f);
//            st.add(f);
//            i++;
//            j--;
//        }
//        System.out.println(st.size());

       //4)
//        HashSet<Integer> st = new HashSet<Integer>();
//        st.addAll(List.of(new Integer[]{1, 2, 3}));
//        for(Integer x:st){
//            System.out.println(x);
//        }


        //5)
//        TreeSet<Integer> tst = new TreeSet<Integer>();
//        tst.addAll(List.of(new Integer[]{999, 111, 22, 1332, 12}));
//        System.out.println(tst);


        //6)
//        HashMap<Integer,Integer> mp= new HashMap<Integer,Integer>();
//        ArrayList<Integer> d =new ArrayList<Integer>();
//        d.addAll(List.of(new Integer[]{1, 2, 3}));
//        for(int i=0;i<d.size();i++){
//            mp.put(d.get(i),i);
//        }
//       for(Map.Entry it:mp.entrySet()){
//           System.out.println(it.getKey()+" "+it.getValue());
//       }

        //7)
//        HashSet<Integer> Hst = new HashSet<Integer>();
//        ArrayList<Integer> e = new ArrayList<Integer>();
//        e.addAll(List.of(new Integer[]{1, 2, 3, 4}));
//        for(Integer i:e){
//            Hst.add(i);
//        }
//       if(Hst.size() == e.size()){
//           System.out.println(1);
//       }else{
//           System.out.println(0);
//       }

        //8)
//        ArrayList<Integer> a =new ArrayList<Integer>();
//        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//        for(int i=0;i<n;i++){
//            int j=sc.nextInt();
//            a.add(j);
//        }
//        System.out.println(a);


        //9)
        ArrayList<String> str = new ArrayList<String>();
        str.addAll(List.of(new String[]{"Mary", "John", "Emma"}));
        ArrayList<Integer> heights = new ArrayList<Integer>();
        heights.addAll(List.of(new Integer[]{180, 165, 170}));
        HashMap<Integer,String> Hmp = new HashMap<Integer,String >();
        for(int i=0;i<str.size();i++){
            Hmp.put(heights.get(i),str.get(i));
        }
        Collections.sort(heights,Collections.reverseOrder());
        String[] res = new String[3];
        for(int i=0;i<heights.size();i++){
            res[i]= Hmp.get(heights.get(i));
        }
        for(String i:res){
            System.out.println(i);
        }
        //Mary,Emma,John

    }
}
