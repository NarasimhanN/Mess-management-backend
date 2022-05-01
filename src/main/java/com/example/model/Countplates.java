package com.example.model;


import lombok.*;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter
@ToString
@Entity
@Table
@IdClass(CountplatesPKID.class)
public class Countplates {

    @Id
    private Integer studentid;
    @Id
    private Date date;

    private Integer breakfast;

    private Integer lunch;
    private Integer dinner;
    private Integer breakfastrating;
    private Integer lunchrating;
    private Integer dinnerrating;
    private String  feedback;

    }



