package com.hemanth.problemsolving.arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingRuleLeetcode1773 {

    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();

        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "phone"));
        items.add(List.of("phone", "gold", "iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";


        System.out.println(countMatches(items, ruleKey, ruleValue));


    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (int i = 0; i < items.size(); i++) {

            List<String> item = items.get(i);

            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);

            if (ruleKey.equals("type") && type.equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && color.equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && name.equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
