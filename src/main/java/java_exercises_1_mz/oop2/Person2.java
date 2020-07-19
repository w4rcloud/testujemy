package java_exercises_1_mz.oop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Person2{

    public static final Integer MAX_AGE = 130;
    //fields or attributes
    private String name;
    private String surname;
    private int age = 18; //not a good practice - it's better to assign values in the constructor
    private Address2 address2;

    public Person2(String name, String surname, int age, Address2 address2) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address2 = address2;
    }

    //parameterless construktor
    public Person2(){
        this.name = "Młody";
        this.surname = "Bóg";
//        this.age = 18;
    }

    public Person2(String name, String surname, Integer age) {  //Integer if we want to work on the return
        this.name = name;                                       //int if private and/or final
        this.surname = surname;
        this.age = age;
    }

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = 20;
    }

    //can't be static becouse it will use 'this.field'
    public void introduceSelf() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname);
    }

    //can't be static becouse it will use 'this.field'
    public void introduceSelf(String greeting) {
        System.out.println(greeting + " " + this.name + " " + this.surname);
    }

    public Integer getage(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
