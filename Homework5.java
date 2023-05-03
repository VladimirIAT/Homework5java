/* Создать множество, ключь и значение строки. 
Добавить шесть элементов. 
Вывести в консоль значения. 
Добавить ко всем значениям символ "!".*/

import java.util.*;

public class Homework5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(2, "7, 2");
        map1.put(4, "5, 6");
        map1.put(6, "8, 3");
        map1.put(1, "1, 7");
        map1.put(3, "7, 6");
        map1.put(5, "6, 8");

        Set <Integer> keys = map1.keySet();

        for (int i=0; i< keys.size();i++) {
            map1.compute(i+1, (k, v) -> v+="!");
            System.out.println(map1.get(keys.toArray()[i]));
        }

/*Создать второе множество с таким же обобщением. 
Ключи второго множества частично совпадают с ключеми первого. 
Объеденить значания во втором множестве и первом если ключи совподают. 
Вывести результат в консоль. */
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(2, "18, 11");
        map2.put(4, "++, --");
        map2.put(7, "8, 14");

        System.out.println("--------");
        System.out.println("task 2");        

        HashMap<Integer, String> map3 = new HashMap<>();
        map3 = new HashMap<>(map1);
        for (Map.Entry<Integer, String> e : map2.entrySet())
            map3.merge(e.getKey(), e.getValue(), String::concat);

        Set <Integer> keys3 = map3.keySet();
        for (int i=0; i< keys3.size();i++){
            System.out.println(map3.get(keys3.toArray()[i]));
        }
    }
}