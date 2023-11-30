package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> numericList = new LinkedList<>();
        for (int i = 0; i < numberOfDishes; i++) {
            numericList.add(i + 1);
        }

        List<Integer> list = new ArrayList<>();
        int i = everyDishNumberToEat - 1;
        if (numericList.isEmpty()){
            return list;
        }
        list.add(numericList.remove(i--));
        while (!numericList.isEmpty()){
            i = (i + everyDishNumberToEat) % numericList.size();
            list.add(numericList.remove(i--));
        }
        return list;
    }
}
