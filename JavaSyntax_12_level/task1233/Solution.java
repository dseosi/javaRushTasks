package com.javarush.task.task12.task1233;

/* 
Изоморфы наступают
*/

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //напишите тут ваш код
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int min = Collections.min(list);
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == min)
                index = i;
        }
        return new Pair<Integer, Integer>(min, index);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
