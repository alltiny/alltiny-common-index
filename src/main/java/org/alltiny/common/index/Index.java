package org.alltiny.common.index;

import java.util.*;

/**
 * An index helps to find elements without searching for them. Other than a map
 * in which each key points to exactly one value, in an index a key may contain
 * more than one values.
 * @param <Key> type of the key objects to use
 * @param <Value> type of the value object to store
 */
public class Index<Key,Value> {

    private Map<Key,List<Value>> index = new HashMap<>();

    public void put(Key key, Value value) {
        List<Value> list = index.get(key);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(value);
        index.put(key, list);
    }

    public List<Value> get(Key key) {
        return index.get(key);
    }

    public List<Value> removeAllFor(Key key) {
        return index.remove(key);
    }

    public void remove(Key key, Value value) {
        List<Value> list = index.get(key);
        if (list != null) {
            list.remove(value);
            if (list.isEmpty()) {
                index.remove(key);
            }
        }
    }

    public void clear() {
        index.clear();
    }

    public int size() {
        return index.size();
    }

    public boolean isEmpty() {
        return index.isEmpty();
    }

    public boolean containsKey(Key key) {
        return index.containsKey(key);
    }

    public Set<Key> keySet() {
        return index.keySet();
    }

    public Set<Map.Entry<Key, List<Value>>> entrySet() {
        return index.entrySet();
    }

    public boolean equals(Object o) {
        return index.equals(o);
    }

    public int hashCode() {
        return index.hashCode();
    }
}
