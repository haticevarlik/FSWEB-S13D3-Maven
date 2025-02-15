package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    int id;
    int birthYear;
    boolean isMarried;

    public Person(String fn, String ln, int age){
        this.firstName=fn;
        this.lastName = ln;
        this.age=age;
    }
    public Person(String fn, String ln, int age, int id, int birthYear, boolean isMarried){
        this.firstName=fn;
        this.lastName = ln;
        this.age=age;
        this.id=id;
        this.birthYear=birthYear;
        this.isMarried=isMarried;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        if (this.age >= 12 && this.age <= 18) {
            return true;
        } else {
            return false;
        }

    }
}
