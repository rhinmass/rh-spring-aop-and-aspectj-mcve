package com.rh.example.service;

import com.rh.example.model.Dao2;
import com.rh.example.repository.DaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private DaoRepository daoRepository;

    public String calculateSomething() {
        //Business Logic
        Dao2 dao2 = daoRepository.getDao2();
        String val = dao2.getValue();
        logger.info("In Business - {}", val);
        return val;
    }
}