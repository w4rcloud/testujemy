package java_exercises_1_sda.ZAD11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Dog implements Animal{

    private String dogSound;


    @Override
    public String makeSound() {
        return dogSound;
    }
}
