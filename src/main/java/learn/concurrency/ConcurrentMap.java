package learn.concurrency;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMap {
    public static void main(String[] args) {
        String str = "AB ABC ABCD ABED";
        Map<Character, Integer> output = new Hashtable<>();
        for(Character temp : str.toCharArray()){
            Integer value = output.get(temp);
            if(value != null){
                output.put(temp,value+1);
            }else{
                output.put(temp,1);
            }
        }
        System.out.println(output);


        String Atostr = "AB ABC ABCD ABED";
        Map<Character, LongAdder> AtoOutput = new Hashtable<>();
        for(Character temp : str.toCharArray()){
            LongAdder laValue = AtoOutput.get(temp);
            if(laValue == null){
                laValue = new LongAdder();
            }
            laValue.increment();
            AtoOutput.put(temp, laValue);
        }
        System.out.println(AtoOutput);


        ConcurrentHashMap<Character,LongAdder> conOutput = new ConcurrentHashMap<>();
        for(Character temp : str.toCharArray()){
            conOutput.computeIfAbsent( temp, e -> new LongAdder()).increment();
        }
        System.out.println(AtoOutput);
    }
}
