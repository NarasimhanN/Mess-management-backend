//package com.example.service;
//
//import com.example.dao.InstructionRepository;
//import com.example.model.Instruction;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class InstructionServiceTest {
//
//    @Autowired
//    private InstructionService instructionService;
//
//    @MockBean
//    private InstructionRepository instructionRepository;
//
//    @Test
//    void updatemessInstruction() {
//        Instruction instruction = new Instruction(1,"aaaa","bbbb", "ccc","ddd");
//        Mockito.when(instructionRepository.save(instruction)).thenReturn(instruction);
//        Instruction instruction1 = new Instruction(1,"aabb","aabb", "ccgc","ddgd");
//        Mockito.when(instructionRepository.updatemessInstruction(instruction,1)).thenReturn(instruction);
//        Assertions.assertThat(instructionService.updatemessInstruction(instruction1, instruction1.getId())).isEqualTo(donate);
//    }
//
//    @Test
//    void fetchInstruction() {
//    }
//}