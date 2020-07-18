package java_exercises_1_sda.ZAD11;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Cow implements Animal{

    private String cowSound;

//    public Cow(String mlaskMlask){
//        this.cowSound = mlaskMlask;
//    }


//    public Cow(String cowSound) {
//        this.cowSound = cowSound;
//    }

    @Override
    public String makeSound() {
        return cowSound;
    }
}
