package tablenested;

import table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<table.Entry<K,V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K key) {

        table.Entry entryRetrieved = getEntry(key);
        return (entryRetrieved != null) ? (V)entryRetrieved.getValue() : null;
    }

    public void put(K key, V value) {
        remove(key);
        table.Entry<K,V> entry = new table.Entry<>(key, value);

        entries.add(entry);
    }

    public void remove(K key) {
        table.Entry entryRetrieved = getEntry(key);
        if(entryRetrieved != null)
            entries.remove(entryRetrieved);
    }

    private table.Entry<K,V> getEntry(K key){
        return entries.stream()
                .filter(entry -> entry.getKey().equals(key))
                .findFirst().orElse(null);
    }
    private class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}
