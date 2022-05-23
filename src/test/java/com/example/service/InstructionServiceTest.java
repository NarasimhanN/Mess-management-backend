//package com.example.service;
//
//import com.example.dao.InstructionRepository;
//import com.example.model.Instruction;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class InstructionServiceTest {
//
//
//    @Autowired
//    private InstructionService instructionService;
//
//    @MockBean
//    private InstructionRepository instructionRepository;
//
//
//    @Test
//    void fetchInstruction() {
//        instructionService.fetchInstruction(1);
//        Mockito.verify(instructionRepository).findById(1);
//    }
//
//    @Test
//    void updatemessInstruction() {
//    }
//}