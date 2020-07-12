package java_exercises_1_mz.regex;

import java.util.regex.Pattern;

public class ExcercisesFromPresentation {

    public static boolean isIdCorrect(String id) {
        Pattern idPattern = Pattern.compile("[0-9]{11}");
        return idPattern.matcher(id).matches();
    }

    public static boolean isEmail(String email) {
        Pattern emailPatter = Pattern.compile("[A-Z0-9a-z_\\.\\-]+@[a-z0-9A-Z\\.\\-]+");
        return emailPatter.matcher(email).matches();
    }

    public static boolean isPassword(String password){
        Pattern passwordPattern = Pattern.compile("[a-zA-Z!@#$%^&*]+{9,}");
        return passwordPattern.matcher(password).matches();
    }


    public static void main(String[] args) {
        System.out.println(isIdCorrect("11111111111"));
        System.out.println(isIdCorrect("1111111111a"));
        System.out.println(isEmail("a@a.pl"));
        System.out.println(isEmail("a.a.pl"));
    }


}
