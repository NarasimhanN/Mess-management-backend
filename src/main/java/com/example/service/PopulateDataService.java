package com.example.service;

import com.example.dao.*;
import com.example.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.time.LocalTime;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class PopulateDataService {

    @Autowired
    private FoodmenuRepository foodmenuRepository;

    @Autowired
    private CountplatesRepository countplatesRepository;

    @Autowired
    private MesstimeRepository messtimeRepository;

    @Autowired
    private InstructionRepository instructionRepository;

    @Autowired
    StudentdetailsRepository studentdetailsRepository;
    //populate data in countplates
    @PostConstruct
    public void populatecountplates(){

        Countplates countplates1 = new Countplates(34,java.time.LocalDate.now().toString(),1,1,0,1,0,3,"bekar");
        countplatesRepository.save(countplates1);
        Countplates countplates2 = new Countplates(36,java.time.LocalDate.now().toString(),4,4,2,5,1,5,"okkk");
        countplatesRepository.save(countplates2);
        Countplates countplates3 = new Countplates(16,java.time.LocalDate.now().toString(),0,1,1,3,4,3,"okk okkk");
        countplatesRepository.save(countplates3);
    }

//    //populate data in mess time
//    public void populatemesstime(){
//        Messtime messtime= new Messtime(1,"2:02","2:98","3:00","3:20","3:40","4:50");
//        messtimeRepository.save(messtime);
//    }


    @PostConstruct
    public void populatemesstime(){
        Messtime messtime= new Messtime(1,2.02,2.98,3.00,3.20,3.40,4.50);
        messtimeRepository.save(messtime);
    }

    @PostConstruct
    public void populateinstruction(){
        Instruction instruction= new Instruction(1,"ghgjj","guhi","hukh","uiyhiu");
        instructionRepository.save(instruction);
    }

    @PostConstruct
    public void populatestudentdetails(){
        Studentdetails studentdetails1 = new Studentdetails(2,"nikunj","njkhakhkhar@gmail.com","123","student","mtech","MT2021136");
        System.out.println(studentdetails1);
        studentdetailsRepository.save(studentdetails1);
        Studentdetails studentdetails2 = new Studentdetails(2,"pragya","pragya@gmail.com","123","student","mtech","MT2021167");
        studentdetailsRepository.save(studentdetails2);
        Studentdetails studentdetails3 = new Studentdetails(2,"divyanshu","divyanshu@gmail.com","123","student","mtech","MT2021186");
        studentdetailsRepository.save(studentdetails3);
    }

    @PostConstruct
    public void populatemenu(){
        Foodmenu foodmenu1 = new Foodmenu("Monday","dal,chawal,rice,sambar","dhokla,dahi,chawal,upma","idli,sambar,chana,sauce");
        System.out.println(foodmenu1);
        foodmenuRepository.save(foodmenu1);
        Foodmenu foodmenu2 = new Foodmenu("tuesday","chai,chawal,rice,sambar","dhokla,dahi,chawal,upma","idli,sambar,chana,sauce");
        System.out.println(foodmenu2);
        foodmenuRepository.save(foodmenu2);
    }


}
