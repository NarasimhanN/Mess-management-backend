//package com.example.service;
//
//import com.example.dao.CountplatesRepository;
//import com.example.model.Countplates;
//import org.junit.Assert;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class RateServiceTest {
//    @Autowired
//    private RateService rateService;
//
//    @MockBean
//    private CountplatesRepository countplatesRepository;
//
//    @Test
//    void fetchRate() {
//    }
//
//    @Test
//    void postRating() {
//        Countplates countplates = new Countplates(34,java.time.LocalDate.now().toString(),1,1,0,1,0,3,"bekar");
//        Mockito.when(countplatesRepository.save(countplates)).thenReturn(countplates);
////        Assertions.assertThat(rateService.postRating(countplates)).isEqualTo(countplates);
//        assertThat(rateService.postRating(countplates)).isEqualTo(countplates);
//    }
//}