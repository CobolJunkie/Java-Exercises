package com.coboljunkie.umc.section_7.exercise_31;
/** This class contains methods to describe a Person
 *
 * @author Coboljunkie
 * @author cj at coboljunkie.com
 * @version 0.1
 **/
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    /** Getter for First name
     *
     * @return firstName
     */
    public String getFirstName(){
        return this.firstName;
    }

    /** Getter for Last name
     *
     * @return lastName
     */
    public String getLastName(){
        return this.lastName;
    }

    /** Getter for Age
     *
     * @return Age
     */
    public int getAge() {
        return this.age;
    }

    /** Setter for First name
     *
     * @param firstName
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    /** Setter for Last name
     *
     * @param lastName
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    /** Setter for Age
     *
     * @param age
     */
    public void setAge(int age){
        if (age < 0 || age > 100) age = 0;
        else this.age = age;
    }

    /** Method to check if Person is a teenager
     *
     * @return
     */
    public boolean isTeen(){
        return age > 12 && age < 20;
    }

    /** Method to get full name
     *
     * @return first and last name.
     */
    public String getFullName(){
        if (firstName.isEmpty()) return lastName;
        else if (lastName.isEmpty()) return firstName;
        else return (firstName + " " + lastName);

        }
    }

