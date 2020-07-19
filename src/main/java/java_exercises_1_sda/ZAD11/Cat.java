package java_exercises_1_sda.ZAD11;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cat implements Animal {

    private String catSound;
    private int age;

    public Cat() {
        this.catSound = "Meow";
    }

    public Cat(String ownSound) {
        this.catSound = ownSound;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    @Override
    public String makeSound() {

        return catSound;
    }


    public static String testMakeSound() {

        return "testCatSound";
    }


}
