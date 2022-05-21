package com.example.model;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Entity
@Table
public class Messtime {

    @Id
    private Integer id;
    private double breakfastin;
    private double breakfastout;
    private double lunchin;
    private double lunchout;
    private double dinnerin;
    private double dinnerout;

    public Messtime(double breakfastin, double breakfastout, double lunchin, double lunchout, double dinnerin, double dinnerout) {
        this.breakfastin = breakfastin;
        this.breakfastout = breakfastout;
        this.lunchin = lunchin;
        this.lunchout = lunchout;
        this.dinnerin = dinnerin;
        this.dinnerout = dinnerout;
    }
}
