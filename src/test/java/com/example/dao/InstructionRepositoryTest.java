//package com.example.dao;
//
//import com.example.model.Foodmenu;
//import com.example.model.Instruction;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class InstructionRepositoryTest {
//
//    @Autowired
//    private InstructionRepository instructionRepository;
//
//    @Test
//    void findById1(Integer id) {
//        Instruction f= new Instruction(1,"asf","dfgffh","fgullk","ghgj") ;
//        instructionRepository.save(f);
//
//        Instruction res=instructionRepository.findById(id).orElse(null);
//        System.out.println(res.getId() + " - " + f.getId());
//        assertThat(res.getId()).isEqualTo(f.getId());
//        instructionRepository.deleteById(res.getId());
//
//    }
//
//}