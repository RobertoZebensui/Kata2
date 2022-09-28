package kata2_20220928_0830;

import java.util.HashMap;
import java.util.Map;

public class Kata2_20220928_0830 {

    public static void main(String[] args) {
        // Integer [] data = {1, 4, 2 ,7, 4, 5, 4, 6, 3, 4, 2, 4, 8, 7, 0};
        String [] data = {"Maria", "José", "José", "Zacarías", "Maria","Zacarías", "Maria","Maria","Zacarías"};
        
        HistogramGenerator<String> histo = new HistogramGenerator(data);
        Map<String, Integer> histogr = histo.getHistogram();
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        
        
    }
    
}
