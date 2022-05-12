//package com.example.dao;
//
//import com.example.model.Countplates;
//import com.example.model.History;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//
//import java.time.LocalDate;
//import java.util.Date;
//import java.util.List;
//
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//import static org.junit.jupiter.api.Assertions.*;
//@DataJpaTest
//class CountplatesRepositoryTest {
//
//    @Autowired
//    private CountplatesRepository countplatesRepository;
//    @Test
//    void findIDateAndBreakfastAndLunchAndDinnerById() {
//        Countplates c=new Countplates(34, LocalDate.now().toString(),1,1,0,1,0,3,"bekar");\
//
//        countplatesRepository.save(c);
//        List<History> actualresult= countplatesRepository.findIDateAndBreakfastAndLunchAndDinnerById(34);
//       assertThat(actualresult).isNotNull().isNotEmpty();
//       assertThat(actualresult.getBreakfast).isEqualTo(c.getBreakfast());
//
//    }
////
//    @Test
//    void getUserByIdAndCurrDate() {
//        Countplates c=new Countplates(34,java.time.LocalDate.now().toString(),1,1,0,1,0,3,"bekar");
//        countplatesRepository.save(c);
//        Countplates res= countplatesRepository.findIDateAndBreakfastAndLunchAndDinnerById(34,java.time.LocalDate.now().toString());
//        assertThat(res).isEqualTo(c);
//    }
//}