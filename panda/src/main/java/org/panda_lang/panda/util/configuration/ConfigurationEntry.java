package org.panda_lang.panda.util.configuration;

public class ConfigurationEntry<K, V> {

    private K key;
    private V value;

    public ConfigurationEntry() {
    }

    public ConfigurationEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
