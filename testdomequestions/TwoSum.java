package assessments;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
//        throw new UnsupportedOperationException("Waiting to be implemented.");
        Map<Integer , Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < list.length ; i++){
            int complemet = sum - list[i];
            if (numMap.containsKey(complemet)){
                return new int[] {numMap.get(complemet) , i };
            }else {
                numMap.put(list[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 3, 5, 5, 3, 2, 8 }, 10);
        if(indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        } 
    }
}