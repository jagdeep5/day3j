/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.util.Date;
import project3.college.Course;
import project3.college.Student;



/**
 *
 * @author macstudent
 */
public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
                Course c1 = new Course("M1","java", 70.0);
                Course c2 = new Course("M2","ios", 80.0);
                Course c3 = new Course("M3","web programming", 60.0);
                Course c4= new Course("M4","swift", 90.5);
                Course c5= new Course("M4","Android", 70.5);
                Course courseArray[] = new Course[5];
                courseArray[0] = c1;
                courseArray[1] = c2;
                courseArray[2] = c3;
                courseArray[3] = c4;
                courseArray[4] = c5;
                
                Student s = new Student();
                s.setStudentId(1);
                s.setName("jagdeep");
                s.setDob(new Date());
                s.caltotal();
                s.calPercentage();
                s.calResult();
                
                
                
                
                
                
                
    }
    
}
