package com.bosssoft.bes.user.permission.service;

import java.util.List;

public interface DictionaryService<T> {
    int save(T object);
    int remove(T object);
    int update(T object);
    List<T> findByConditon(T object);
}
