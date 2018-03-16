/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3.college;

/**
 *
 * @author macstudent
 */
public class Course {
     private String courseId;
     private String courseName;
     private double Marks;
     
    

    public Course(String courseId, String courseName, double Marks) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.Marks = Marks;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double Marks) {
        this.Marks = Marks;
    }
     
    
    
} 
