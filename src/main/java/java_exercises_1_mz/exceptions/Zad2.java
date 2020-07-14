package java_exercises_1_mz.exceptions;

//Utwórz zmienną typu String, a następnie przypisz do niej imię “Olgierd”.
//        a. Wyświetl imię tak aby imię było wyświetlone dużymi literami
//        b. Wyświetl imię tak aby imię było wyświetlone małymi literami
//        c. Wyświetl długość imienia wykorzystująć odpowiednią metodę klasy String.
//        d. Korzystając z odpowiedniej metody sprawdź czy imię rozpoczyna się od litery
//        “O”
//        e. Korzystając z odpowiedniej metody sprawdź czy imię zawiera literę “e”.
//        f. Korzystając z odpowiedniej metody usuń litery “i” oraz “e” z imienia, a
//        następnie wyświetl imię po zmianach.
//        g. Wykorzystując pętlę for wyświetl kolejno litery imienia wraz z ich indeksem.
//        Spodziewany rezultat wygląda następująco
//        [1] = O
//        [2] = l
//        [3] = g
//        [4] = i
//        [5] = e
//        [6] = r
//        [7] = d

public class Zad2 {

    public static void main(String[] args) {
        String name = "Olgierd";
        System.out.println("Name: " + name);
        System.out.println("Name in uppercase: " + name.toUpperCase());
        System.out.println("Name in lowercase: " + name.toLowerCase());
        System.out.println("Name length: " + name.length());
        System.out.println("Name starts with \"O\": " + name.startsWith("O"));
        System.out.println("Name contains \"e\": " + name.contains("e"));
        System.out.println("Name after deleting \"i\" & \"e\": " + name.replaceAll("[ie]", ""));
        for (int i = 0; i < name.length(); i++) {
            System.out.println("[ " + (i + 1) + " ] = " + name.charAt(i));
        }
    }
}
