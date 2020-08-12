/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agecalc;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author SamyB
 */
public class AgeCalc {

    public static void main(String[] args) {

        LocalDate currDay = LocalDate.now();
        LocalDate birthday = LocalDate.of(2000, 11, 6);
        int years = Period.between(birthday, currDay).getYears();

        System.out.println(currDay);
        System.out.println(birthday);
        System.out.println(years);

    }

}
