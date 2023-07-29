package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();

    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }
    }

    public static void task2() {
        Set<Integer> uniqueNum = new HashSet<>();
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 534, -5, 474, 97, 895));
        for (int i = 0; i < nums.size(); i++) {
            uniqueNum.add(nums.get(i));
        }
        List<Integer> num = new ArrayList<>(uniqueNum);
        Collections.sort(num);
        System.out.println("uniqueNum = " + num);
    }

    public static void task3() {
        List<String> nums = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Set<String> uniqueNum = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            uniqueNum.add(nums.get(i));
        }
        System.out.println("uniqueNum = " + uniqueNum);
    }

    public static void task4() {
        List<String> nums = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три","три","три"));
        Map<String, Integer> maps = new HashMap<>();
//        Set<String> uniqueNum = new HashSet<>();
//        for (int i = 0; i < nums.size(); i++) {
//            uniqueNum.add(nums.get(i));
//        }
//        List<String> numUnique = new ArrayList<>(uniqueNum);
        System.out.println("nums.size() = " + nums.size());

        for (int i = 0; i < nums.size(); i++) {
            Integer count = 0;
            for (int i1 = 0; i1 < nums.size(); i1++) {
                if(nums.get(i1).equals(nums.get(i))) {
                count = count+1;
                }
            }
            maps.put(nums.get(i),count );
        }
        System.out.println(maps);
    }

}
