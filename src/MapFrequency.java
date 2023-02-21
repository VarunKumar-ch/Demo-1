import java.util.HashMap;
import java.util.Map;

public class MapFrequency {
    public static void main(String[] args) {
        String str ="aabsbvegbevsdcwdcacxwcxwdfvevccwdy";
        Map<Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(mp.containsKey(str.charAt(i))){
                Integer value = mp.get(str.charAt(i));
                value+=1;
                mp.replace(str.charAt(i),value);
            }else{
                mp.put(str.charAt(i),1);
            }
        }
        for(Map.Entry m: mp.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
        String bina ="";
        for(int i=0;i<str.length();i++){
            int freq = mp.get(str.charAt(i));
            if(freq%2 == 1){
                bina+=str.charAt(i);
            }
        }

        System.out.println(bina);

    }
}
