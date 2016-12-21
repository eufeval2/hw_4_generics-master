import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CollectionUtils {
    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {

        destination.addAll(source);

    }


    public static <T> List<T> newArrayList() {
        return new ArrayList<>();
    }


    public static <T> int indexOf(List<? extends T> source, T o) {
        return source.indexOf(o);
    }


    public static <T> List limit(List<? extends T> source, int size) {
        return source.subList(0, size);
    }


    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }


    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }


    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }


    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        boolean check = false;
        Iterator iterator = c2.iterator();
        while (!check && iterator.hasNext()) {
            if (c1.contains(iterator.next())) check = true;
        }
        return check;
    }


    public static <T extends Comparable<T>> List range(List<? extends T> list, T min, T max) {
        List<T> resultList = newArrayList();
        for (T value : list) {
            if ((value.compareTo(min) >= 0) && (value.compareTo(max) <= 0)) {

                resultList.add(value);

            }
        }
        return resultList;
    }


    public static <T> List range(List<? extends T> list, T min, T max, Comparator<T> comparator) {
        List<T> resultList = newArrayList();
        for (T value :
                list) {
            if ((comparator.compare(value, min) >= 0) && (comparator.compare(value, max) <= 0)){
                resultList.add(value);
            }
        }
        return resultList;
    }
}
