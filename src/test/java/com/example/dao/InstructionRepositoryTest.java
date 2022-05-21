//package com.example.dao;
//
//import com.example.model.Foodmenu;
//import com.example.model.Instruction;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//
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
//        Optional<Instruction>  res=instructionRepository.findById(id);
//        assertThat(res).isNotNull();
//        assertThat(res).isEqualTo(f);
//
//    }
//
//}