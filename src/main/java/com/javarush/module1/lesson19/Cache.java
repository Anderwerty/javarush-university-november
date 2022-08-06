package com.javarush.module1.lesson19;

import java.util.LinkedHashMap;
import java.util.Map;

public interface Cache<K, V> {

    void put(K key, V value);

    V get(K key);
}


class CacheImpl<K, V> implements Cache<K, V> {
    private final Map<K, V> map = new LinkedHashMap<>(){
        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return map.size()> maxCacheSize;
        }
    };
    private final int maxCacheSize;

    CacheImpl(int maxCacheSize) {
        this.maxCacheSize = maxCacheSize;
    }

    @Override
    public void put(K key, V value) {
        map.put(key, value);
    }

    @Override
    public V get(K key) {
        return map.get(key);
    }
}

class Runner{

    public static void main(String[] args) {
        Cache<String, Integer> cache = new CacheImpl<>(3);

    }
}
