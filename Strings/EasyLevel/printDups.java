import java.util.Map; 
import java.util.HashMap; 

class PrintDups{
    public static void main(String[] args) {
        String s = "absaddabkdba";
        dupCount(s);
    }
    static void dupCount(String s){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch, 1);
            }
        }
        for(Map.Entry<Character, Integer> entry : hm.entrySet()){
            int val = entry.getValue();
            if(val > 1){
                System.out.println(entry.getKey()+" "+val);
            }
        }
    }
}