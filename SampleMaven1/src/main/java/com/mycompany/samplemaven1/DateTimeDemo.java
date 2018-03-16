/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samplemaven1;


import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author macstudent
 */

    
public class DateTimeDemo {

    public static void main(String[] args) {
        // Creates DateTime object using the default constructor will
        // give you the current system date.
        DateTime date = new DateTime();
        System.out.println("date = " + date);

        // Or simply calling the now() method.
        date = DateTime.now();
        System.out.println("date = " + date);

        // Creates DateTime object with information like year, month,
        // day, hour, minute, second and milliseconds
        date = new DateTime(2017, 1, 15, 0, 0, 0, 0);
        System.out.println("date = " + date);

        // Create DateTime object from milliseconds.
        date = new DateTime(System.currentTimeMillis());
        System.out.println("date = " + date);

        // Create DateTime object from Date object.
        date = new DateTime(new Date());
        System.out.println("date = " + date);

        // Create DateTime object from Calendar object.
        Calendar calendar = Calendar.getInstance();
        date = new DateTime(calendar);
        System.out.println("date = " + date);

        // Create DateTime object from string. The format of the
        // string  should be precise.
        date = new DateTime("2017-01-15T13:14:00.000+08:00");
        System.out.println("date = " + date);
        date = DateTime.parse("2017-01-15");
        System.out.println("date = " + date);
        date = DateTime.parse("15/01/2017", DateTimeFormat.forPattern("dd/MM/yyyy"));
        System.out.println("date = " + date);
    }
}
