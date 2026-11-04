package com.ohgiraffers.level01.basic.pair.model;

public class Pair<K, V> {

    private K key;      // 키
    private V value;    // 값

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
