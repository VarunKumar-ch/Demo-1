public class one {
    public static void main(String[] args) {
                ArrayList<Integer> d = new ArrayList<Integer>();
        d.addAll(List.of(new Integer[]{3,2,4}));
        Scanner sc =new Scanner(System.in);
        System.out.println(d.getClass().getName());
        int n = sc.nextInt();
        Collections.sort(d);
        d.remove(0);
        d.remove(0);
        System.out.println(d);
        Integer j =d.size()-1;
        Integer i=0;
        d.get(i);
       while(i<j){
           int a = d.get(i);
           int b = d.get(j);
           if((a+b) == n){
               System.out.println(i+" "+j);
               break;
           }else if((a+b)>n){
               j--;
           }else if((a+b)<n){
               i++;
           }
       }

        System.out.println("Not found");
        for(Integer i=0;i<d.size();i++){
               int sum =0;
            for(Integer j =i+1;j<d.size();j++){
                sum = d.get(i)+d.get(j);
                if(sum == n){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
