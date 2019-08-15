package com.bosssoft.bes.user.permission.service.impl;

import com.bosssoft.bes.user.permission.dao.DictionaryMapper;
import com.bosssoft.bes.user.permission.entity.Dictionary;
import com.bosssoft.bes.user.permission.pojo.exception.BusinessException;
import com.bosssoft.bes.user.permission.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService<Dictionary> {
    @Autowired
    private DictionaryMapper dictionaryMapper;
    @Override
    public int save(Dictionary object) {

        try {
            return dictionaryMapper.insert(object);
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10001");
        }
    }

    @Override
    public int remove(Dictionary object) {

        try {
            return 0;
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10002");
        }
    }

    @Override
    public int update(Dictionary object) {
        try {
            return 0;
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10003");
        }
    }

    @Override
    public List<Dictionary> findByConditon(Dictionary object) {
        try {
            return null;
        } catch (Exception e) {
            throw  new BusinessException(e.getMessage(),e,"10004");
        }
    }
}
