package java_exercises_1_mz.oop;

public class Person {

    private String name;
    private String surname;
    private int age;
    Address address;


    Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    Person(String name, String surname, int age, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname() {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }

    public void introduceSelf() {
        System.out.println("Hi! My name is " + name + " " + surname + ". I am " + age + " years old.");
    }

}

