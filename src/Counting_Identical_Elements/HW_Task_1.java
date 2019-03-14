package Counting_Identical_Elements;
import java.util.*;

public class HW_Task_1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,-6,4,5,3,4,2,4,5,7));
        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> uniqueSet = new HashSet<>(list);
        for (Integer key : uniqueSet) {
            map.put(key, Collections.frequency(list, key));
        }
        System.out.println(map);
    }
}
