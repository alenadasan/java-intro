package c02.variables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> uninitializedList = new ArrayList<String>();
        List<String> initializedList = Arrays.asList("foo", "bar");

        uninitializedList.add("foo");
        uninitializedList.add("bar");
        uninitializedList.add(0, "car");
        uninitializedList.remove(0);
        uninitializedList.remove(uninitializedList.size() - 1 );
        uninitializedList.remove("car");

        System.out.println(uninitializedList.get(0));
        System.out.println("List size: " + uninitializedList.size());
        System.out.println("Is list empty: " + uninitializedList.isEmpty());
        System.out.println("Index of bar item: " + uninitializedList.indexOf("bar"));
        System.out.println("List contains item foo? " + uninitializedList.contains("foo"));

        for (String s : initializedList) {
            System.out.println(s);
        }



    }
}
