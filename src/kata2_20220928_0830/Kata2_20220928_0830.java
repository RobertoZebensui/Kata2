package kata2_20220928_0830;

import java.util.HashMap;
import java.util.Map;

public class Kata2_20220928_0830 {

    public static void main(String[] args) {
        int [] data = {1, 4, 2 ,7, 4, 5, 4, 6, 3, 4, 2, 4, 8, 7, 0};
        
        
        Map<Integer, Integer> histogram = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i])+1:1);
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        
        
    }
    
}
