import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
class ex1{
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<>();
        x.add("Alekhya");
        x.add("Honey");
        x.add("Bangton");
        x.add("Ghost");
        System.out.println("ARRAY LIST");
        Iterator<String> it = x.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(x);
        System.out.println("QUEUE");
        Queue<Integer> y=new ArrayDeque<>();
        y.add(1);
        y.add(2);
        y.add(3);
        y.peek();
        System.out.println(y.peek());
        y.remove();
        y.remove();
        System.out.println(y.peek());

        HashSet<String> z = new HashSet<>();
        z.add("k");
        z.add("r");
        z.add("i");
        z.add("s");
        z.add("h");
        z.add("n");
        z.add("a");
        if(z.contains("k")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
