package pair;

import java.util.ArrayList;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static <__ extends Comparable>  Pair<__> firstLast(ArrayList<__> a) {

        return new Pair<__>(a.get(0), a.get(a.size() - 1));
    }

    public static<T extends Comparable> T min(ArrayList<T> list) {
        return list.stream()
                .reduce((item1, item2)-> new Pair<T>(item1, item2).min()).orElse(null);
    }

    public static <T  extends Comparable> T max(ArrayList<T> list) {
        return list.stream()
                .reduce((item1, item2)-> new Pair<T>(item1, item2).max()).orElse(null);
    }

    public static <T extends Comparable> Pair<T> minMax(ArrayList<T> list) {

        T min = min(list);
        T max = max(list);
        return new Pair<T>(min,max);
    }
}
