package com.example.dao;

import com.example.model.Instruction;
import com.example.model.Messtime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MesstimeRepositoryTest {

    @Autowired
   private MesstimeRepository messtimeRepository;

    @Test
     void findById1() {
//        Messtime f= new Messtime(1,2.02,2.98,3.00,3.20,3.40,4.50); ;
//        messtimeRepository.save(f);

        Messtime res=messtimeRepository.findById1(1);
        assertThat(res).isNotNull();
        assertThat(res.getId()).isEqualTo(1);

    }
    @Test
     void fetch() {
    }

    @Test
    void savebyid() {
    }
}