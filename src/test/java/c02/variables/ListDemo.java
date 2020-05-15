package c02.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

//        ARRAYS DEMO
        String[] uninitializedArray = new String[10];
        String[] initializedArray = {"foo", "bar"};

        uninitializedArray[0] = "foo";
        uninitializedArray[1] = "bar";


//          ARRAYLISTS DEMO
        List<String> uninitializedList = new ArrayList<String>(); //empty list

        List<String> initializedList = Arrays.asList("foo", "bar");  //populated list

        uninitializedList.add("foo");
        uninitializedList.add("bar");
        uninitializedList.add(0, "car");
        uninitializedList.remove(0);
        uninitializedList.remove(uninitializedList.size() - 1);
        uninitializedList.remove("car");

        System.out.println(uninitializedList.get(0));
        System.out.println("List size: " + uninitializedList.size());
        System.out.println("Is list empty: " + uninitializedList.isEmpty());
        System.out.println("Index of bar item: " + uninitializedList.indexOf("bar"));
        System.out.println("List contains item foo? " + uninitializedList.contains("foo"));

//        car foo bar
//         0   1   2

        for (int i = 0; i < initializedArray.length; i++) {
            System.out.println(initializedArray[i]);
        }

        for (int i = 0; i < uninitializedList.size(); i++) { // similar to: for(int i = 0; i < 3; i++)
            System.out.println(uninitializedList.get(i));
        }

        for (String s : uninitializedList) {
            System.out.println(s);
        }

        List<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        List<Integer> ints2 = new LinkedList<Integer>(Arrays.asList(1, 2, 3));

        List<Integer> updatedList = removeSecondItemFromList(ints);
        List<Integer> updatedList2 = removeSecondItemFromList(ints2);

        System.out.println("Ints1 arraylist after removing the second element");
        for (Integer anInt : updatedList) {
            System.out.println(anInt);
        }

        System.out.println("Ints2 arraylist after removing the second element");
        for (Integer anInt : updatedList2) {
            System.out.println(anInt);
        }
    }

    public static List<Integer> removeSecondItemFromList(List<Integer> list) {
        list.remove(1);
        return list;
    }
}