package lab0;

import java.util.Date;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;
    private String DAYS_VACATION_ERROR = "Days of vacation must be 0 or above.";
    private String FIRST_NAME_ERROR = "First Name is less than 1 character.";
    private String HIRE_DATE_ERROR = "Hire date is not a date.";
    private String LAST_NAME_ERROR = "Last Name is less than 1 character.";
    private String SSN_ERROR = "SSN must be the format of XXX-XX-XXXX";
    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.hireDate = hireDate;
        setDaysVacation(daysVacation);
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if(daysVacation < 0){
            throw new IllegalArgumentException(DAYS_VACATION_ERROR);
        }else this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.length() < 1){
            throw new IllegalArgumentException(FIRST_NAME_ERROR);
        } else this.firstName = firstName;
        
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        if(hireDate == null){
            throw new IllegalArgumentException(HIRE_DATE_ERROR);
        }else this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.length() < 1){
            throw new IllegalArgumentException(LAST_NAME_ERROR);
        } else this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if(ssn == null || ssn.length() != 11){
            throw new IllegalArgumentException(SSN_ERROR);
        } else this.ssn = ssn;
    }
    
    
}
