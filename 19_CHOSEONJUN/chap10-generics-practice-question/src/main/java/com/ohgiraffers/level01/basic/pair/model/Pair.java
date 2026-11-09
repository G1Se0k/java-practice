package com.ohgiraffers.level01.basic.pair.model;

public class Pair<K, V> {

    private K key;
    private V value;   // 값

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }
    public String toString() {
        return "Pair[" +
                "key=" + key +
                ", value=" + value +
                ']';
    }
}


