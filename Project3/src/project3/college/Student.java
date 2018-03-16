/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3.college;

import java.util.Date;
import java.util.Objects;
import java.util.Objects;
import java.util.logging.Logger;
/**
 *
 * @author macstudent
 */
public class Student {
    

    private int studentId;
    private String name;
    private Date dob;
    private double total;
     private String result;
     private double per;

    private Course courselist[];

    public Student(int studentId, String name, Date dob, Course[] courselist,double total,
      String result,double per) 
      {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.courselist = courselist;
        this.total = total;
        this.result = result;
        this.per = per;
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Course[] getCourselist() {
        return courselist;
    }

    public void setCourselist(Course[] courselist) {
        this.courselist = courselist;
    }

    public double getTotal() {
        return total;
    }

    public String getResult() {
        return result;
    }

    public double getPer() {
        return per;
    }

    public void caltotal()
    {
        this.total = 0;
        for( int i= 0; i < courselist.length; i++) 
        {
        this.total = this.total + courselist[i].getMarks();
        }
        
    }
    public void calResult()
    {
    this.result = "pass";
            
    }

    
    public void calPercentage()
    {
        this.per = this.total / this.courselist.length * 100.00;
    }  
    public void printStudentDetails()
    {
        System.out.println("Student id" + this.studentId);
        System.out.println("Student Name" + this.name);
        System.out.println("Student dob" + this.dob);
        System.out.println("Student total" + this.total);
        System.out.println("Student result" + this.result);
        System.out.println("Student per" + this.per);
    }

    @Override
    public String toString() {
        String s = "Student{" + "studentId=" + studentId + ", name=" + name + ", dob=" + dob + ", total=" + total + ", result=" + result + ", per=" + per + ", courselist=" + courselist + '}';
        
            for (Course c : courselist)
            {
           
                s = s + c.toString() + "\n";
       
            }
                return s;
    
    }

    
}



