package com.rh.example.repository;

import com.rh.example.model.Dao2;
import com.rh.example.model.Dao1;
import org.springframework.stereotype.Repository;

@Repository
public class DaoRepository {

    public Dao1 getDao1() {
        return new Dao1("Dao1");
    }

    public Dao2 getDao2() {
        return new Dao2("Dao2");
    }

}
