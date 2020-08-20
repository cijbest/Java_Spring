package com.frame;

import java.util.ArrayList;

public interface Dao<V,K> {
      public void insert(V v);
      public void update(V v);
      public void delete(K k);
      public V select(K k);
      public ArrayList<V> select();
}