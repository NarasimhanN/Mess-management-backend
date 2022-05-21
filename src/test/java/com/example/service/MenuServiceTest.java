package com.example.service;

import com.example.dao.FoodmenuRepository;
import com.example.model.Foodmenu;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class MenuServiceTest {

    @Autowired
    private MenuService menuService;

    @MockBean
    private FoodmenuRepository foodmenuRepository;


    @Test
    void getMenubyday() {
         menuService.getMenubyday("monday");
        Mockito.verify(foodmenuRepository).getFoodmenuByDays("monday");
    }


     @Test
     void updateFoodMenu() {
        
     }

}