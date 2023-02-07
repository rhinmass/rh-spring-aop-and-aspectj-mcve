package com.rh.example.service;

import com.rh.example.repository.DaoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DaoRepository daoRepository;

    public String calculateSomething() {
        String value = daoRepository.getDao1().getValue();
        logger.info("In Business - {}", value);
        return value;
    }
}