/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.regex.Pattern;

/**
 *
 * @author LoneStar
 */
public class Student {
    public static void main(String[] args){
        
    }

    private String firstName, lastName, streetAddress, city, postalCode;
    private LocalDate birthday, dateEnrolled; 
     
    private int studentNum;
    private boolean inGoodStanding = true; 
    
    public Student(String firstName, String lastName, String streetAddress, String city, String postalCode, LocalDate birthday, LocalDate dateEnrolled,  int studentNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.birthday = birthday;
        this.dateEnrolled = dateEnrolled;
        this.inGoodStanding = inGoodStanding;
        this.studentNum = studentNum;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
       if(firstName.isEmpty())
       throw new IllegalArgumentException ("You must add a first name");
       else    
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
       if(lastName.isEmpty())
           throw new IllegalArgumentException ("You must have a last Name "); 
       else
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if(streetAddress.isEmpty())
            throw new IllegalArgumentException ("Address can not be emtpy");
        else 
        this.streetAddress = streetAddress;
        
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(city.isEmpty())
            throw new IllegalArgumentException ("YOu must enter a valid city"); 
        else
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
       if(postalCode.isEmpty())
           throw new IllegalArgumentException ("Postal code must be valid");
        else
         this.postalCode = postalCode;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
       LocalDate Illegal = LocalDate.now().minusYears(100); 
        if(birthday.isAfter(Illegal))
            throw new IllegalArgumentException ("You cannot be in school and be over 100 years old");
        else    
            this.birthday = birthday;
    }

    public LocalDate getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(LocalDate dateEnrolled) {
        LocalDate today = LocalDate.now();
        if(dateEnrolled.isAfter(today))
            throw new IllegalArgumentException("You can not have a future enrollment date");
        else 
            this.dateEnrolled = dateEnrolled;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
         
            if(studentNum < 0 )
                  throw new IllegalArgumentException("number cannot be negative"); 
            else 
              this.studentNum = studentNum; 
}
    
    public LocalDate getDateOfBirth(){
        return birthday; 
        
        
    }

    public void setDateOfBirth(LocalDate birthday){
    
        if(birthday.isAfter(birthday.minusYears(100)))
        {
            this.birthday = birthday;
        }else
            throw new IllegalArgumentException("You must be under 100 years to be inrolled "); 
        
    }

    int getYearBorn() {
        return birthday.getYear(); 
    }

    public int getAge() {
        LocalDate today = LocalDate.now(); 
        return Period.between(birthday, today).getYears(); 
        
        
    }

    public int getYearEnrolled() {
        return dateEnrolled.getYear();
    }

    boolean isInGoodStanding() {
      return inGoodStanding;   
         
       
    }

    void suspendStudent() {
       inGoodStanding = false; 
           
    }

    void reinstateStudent() {
        inGoodStanding = true; 
    }

    public String toString(){
    return firstName +" "+  lastName  + ", " + "student number: " + studentNum; 
}
   
    

}