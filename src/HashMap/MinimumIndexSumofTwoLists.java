package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumofTwoLists {

    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        System.out.println(Arrays.toString(findRestaurant(list1, list2)));
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        int minSumIndex = Integer.MAX_VALUE;
        String[] str = null;
        Map<String, Integer> map = new HashMap();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                if (map.get(list2[i]) + i < minSumIndex) {
                    list.clear();
                    list.add(list2[i]);
                    minSumIndex=map.get(list2[i]) + i;
                }else if (map.get(list2[i]) + i == minSumIndex) {
                    // We found a tie with the current minimum sum. Add it to the list.
                    list.add(list2[i]);
                }
            }
        }
        str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            str[i] = list.get(i);
        }

        return str;

    }
}
