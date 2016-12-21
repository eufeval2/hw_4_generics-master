import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {
    private Map<T, Integer> map = new HashMap<>();

    public void add(T o, Integer n) {
        Integer value = map.get(o);
        if (value != null) map.put(o, value + n);
        else map.put(o, n);
    }

    @Override
    public void add(T o) {
        add(o, 1);
    }

    @Override
    public int getCount(T o) {
        return map.get(o);
    }

    @Override
    public int remove(T o) {
        return map.remove(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        for (Map.Entry pair :
                source.toMap().entrySet()) {
            add((T) pair.getKey(), (Integer) pair.getValue());
        }
    }

    @Override
    public  Map<T, Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination = this.toMap();
    }

}
