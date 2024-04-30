import java.util.HashMap;
import java.util.Map;

public class mapInterface {
    public static void main(String[] args) {
        Map<String,Integer> obj=new HashMap<String,Integer>();
        obj.put("hello", 1);
        obj.put("Bye", 2);
        obj.put("hiii", 3);
        obj.put("boom", 4);
        for(Map.Entry<String,Integer> m:obj.entrySet()){
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
