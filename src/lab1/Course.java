/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author LoneStar
 */
public class Course {
    private Instructor instructor; 
    private String  courseCode, courseName, Room; 
    private int maxStudents;
    private ArrayList<Student> classOfStudent; 
   

    public Course(Instructor instructor, String courseCode, String courseName, String Room, int maxStudents ) {
       setCourseCode(courseCode);
        setInstructor(instructor);
        setCourseName(courseName);
        setRoom(Room);
        setMaxStudents(maxStudents);
        classOfStudent = new ArrayList<Student>(); 
    }

    public Instructor getInstructor() {
        return instructor;
    }
 
 /**
 * test to see if instructor can teach the course and then set instance variable 
 * @param instructor 
 */
   public void setInstructor (Instructor instructor){
       if(instructor.canTeach(courseCode))
           this.instructor = instructor; 
       else 
           throw new IllegalArgumentException("Instructor is not qualified to teach this course");
   }
   
   
    public String getCourseCode() {
        return courseCode;
    }
/**
 * check to see if course code is empty then set instance variables 
 * @param courseCode 
 */
    public void setCourseCode(String courseCode) {
      if(courseCode.isEmpty())
        throw new IllegalArgumentException("Cours code cannot be empty");
      else
        this.courseCode = courseCode;
    }

  

    public String getCourseName() {
        return courseName;
    }
/**
 * check to see if the coursename is empty then set instance variable
 * @param courseName 
 */
    public void setCourseName(String courseName) {
       if(courseName.isEmpty())
           throw new IllegalArgumentException("Course name cannot be empty");
       else
        this.courseName = courseName;
    }

    public String getRoom() {
        return Room;
    }
/**
 * check to see if room is empty then set instance variable 
 * @param Room 
 */
    public void setRoom(String Room) {
        if(Room.isEmpty())
            throw new IllegalArgumentException("Room cannot be empty");
        else
         this.Room = Room;
        
    }

    public int getMaxStudents() {
        return maxStudents;
    }
/**
 * check to see if the their is room in the course
 * @param maxStudents 
 */
    public void setMaxStudents(int maxStudents) {
      if(maxStudents <= 45 && maxStudents > 0)
        this.maxStudents = maxStudents;
      
      else 
          throw new IllegalArgumentException ("The class is full"); 
          
    }        
    
/**
 * return the courseName and course Code 
 * @return 
 */
    public String toString(){
        return courseName + " " + courseCode; 
    }
   
    /**
      * check to see if student is in good standing and if their is room then add student
      * @param student 
      */
    public void addStudent(Student student){
     
        if(student.isInGoodStanding() ){
            if(maxStudents > classOfStudent.size()){
                classOfStudent.add(student); 
            }else 
              throw new IllegalArgumentException("Class is full");
        }else
          throw new IllegalArgumentException("Student is not in good standing");
      
    }
/**
 * print the students each on a new line 
 */
    public void showClassList(){
       for(Student List : classOfStudent){
           System.out.println(classOfStudent.toString());
       }
    }
/**
 * return array list of classOfStudents 
 * @return 
 */
    public ArrayList getStudents() {
     return classOfStudent; 
     
    
    }
}
