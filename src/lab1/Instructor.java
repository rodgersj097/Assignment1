/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author LoneStar
 */
public class Instructor  {
    private String firstName, lastName, streetAddress, city, postalCode;
    private LocalDate hireDate, birthday; 
    private int employeeNum; 
    private static ArrayList<String>  courseCanTeach;

    public Instructor(String firstName, String lastName, String streetAddress, String city, String postalCode, LocalDate hireDate, LocalDate birthday, int employeeNum) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setCity(city);
        setPostalCode(postalCode);
        setHireDate(hireDate);
        setBirthday(birthday);
        setEmployeeNum(employeeNum);
        courseCanTeach = new ArrayList<>(); 
    }

   
  

    public String getFirstName() {
        return firstName;
    }
    /**
     * Check to see if firstname is empty, then set instance variable
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        if(firstName.isEmpty())
            throw new IllegalArgumentException("Name Cannot be empty"); 
        else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

       /**
        * check if lastname is empty then set instance variable 
        * @param lastName 
        */
    public void setLastName(String lastName) {
       if(lastName.isEmpty())
           throw new IllegalArgumentException ("Name cannot be empty");
       else
            this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }
    /**
     * check if street address is empty then set instance variable
     * @param streetAddress 
     */
    public void setStreetAddress(String streetAddress) {
        if(streetAddress.isEmpty())
            throw new IllegalArgumentException ("Address cannot be empty"); 
        else
            this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }
    /**
     * check if city is empty then set instance variable 
     * @param city 
     */
    public void setCity(String city) {
       if(city.isEmpty())
           throw new IllegalArgumentException ("City cannot be empty");
       else
            this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }
/**
 * check if postal code is empty then set instance variable 
 * @param postalCode 
 */
    public void setPostalCode(String postalCode) {
        if(postalCode.isEmpty())
           throw new IllegalArgumentException ("Postal code cannot be empty");
        else
            this.postalCode = postalCode;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }
    /**
     * check if hiredate is within one month of the current date 
     * @param hireDate 
     */
    public void setHireDate(LocalDate hireDate) {
        LocalDate cutOff = LocalDate.now().plusMonths(1);
        if(hireDate.isAfter(cutOff))
            throw new IllegalArgumentException ("Hire date should only be within one month of current Date");
        else
             this.hireDate = hireDate;
        
    }

    public LocalDate getBirthday() {
        return birthday;
    }
/**
 * check to see if instructor is under 90 years of age 
 * @param birthday 
 */
    public void setBirthday(LocalDate birthday) {
       if(birthday.isAfter(birthday.plusYears(90)))
           throw new IllegalArgumentException ("instructor cannot be 90 yers or older"); 
       else
           this.birthday = birthday;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }
/**
 * check to see if employeeNum is grater than 0 
 * @param employeeNum 
 */
    public void setEmployeeNum(int employeeNum) {
       if(employeeNum >0)
            this.employeeNum = employeeNum; 
        else
            throw new IllegalArgumentException("Number cannot be 0");

    }
    /**
     * return instructos first and last name 
     * @return 
     */
    public String toString(){
        return firstName + " " + lastName; 
    }
 
    public int getYearBorn(){
        return birthday.getYear();
}
   public int getAge(){
       return birthday.getYear(); 
   }
    /**
     * return how many years instructor has been teaching
     * @return 
     */
   public int getYearsAtCollege(){
      LocalDate today = LocalDate.now(); 
      return Period.between(hireDate, today).getYears();
   }
    
  /**
   * check if course is empty then add the course to a arraylist of coursecodes the instructor is able to teach in upper case 
   * @param CourseCode 
   */
  public void addCourseToAbilities(String CourseCode){
    if(CourseCode.isEmpty())
        throw new IllegalArgumentException ("Course code cannot be empty");
    else
        courseCanTeach.add(CourseCode.toUpperCase());
  }
  /**
   * check to see if course code is in the array list of teachable courses 
   * @param courseCode
   * @return 
   */
  public boolean canTeach(String courseCode){
       if(courseCanTeach.contains(courseCode))
           return true; 
       else 
           return false; 
  
  }
  /**
   * return the list of teachable courses 
   * @return 
   */
  public String listOfSubjectsCertifiedToTeach(){
      return courseCanTeach.toString().replace("[", "").replace("]", ""); 
  }
/**
 * get age in years 
 * @return 
 */
   public int getAgeInYears() {
       LocalDate today = LocalDate.now(); 
       return Period.between(birthday,today).getYears(); 
    }
}
