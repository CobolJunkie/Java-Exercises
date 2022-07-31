package com.coboljunkie.MasterClassUdemy;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if (age < 0 || age > 100) age = 0;
        else this.age = age;
    }
    public boolean isTeen(){
        return age > 12 && age < 20;
    }
    public String getFullName(){
        if (firstName.isEmpty()) return lastName;
        else if (lastName.isEmpty()) return firstName;
        else return (firstName + " " + lastName);

        }
    }

