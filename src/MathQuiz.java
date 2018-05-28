import java.util.Scanner;

public class MathQuiz {

    Scanner scanner = new Scanner(System.in);

    public boolean question1() {
        System.out.println("jaki jest wynik 3 * 5 = ?");
        int odpowiedz1 = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        if (odpowiedz1 == 15) {
            System.out.println("podałeś poprawną odpowiedz!");
        } else {
            System.out.println(odpowiedz1 + " to nie poprawny wynik");
        }
        return question1();
    }

//
//
//    public boolean question2() {
//        System.out.println("ile wynisi pole kwadratu o boku 12");
//        int odpowiedz2 = scanner.nextInt();
//
//        if (odpowiedz2 == 144) {
//            System.out.println("Dobrze!n");
//        } else {
//            System.out.println(odpowiedz2 + " to niepoprawna odpowiedz");
//        }
//        return question2();
//    }
//
//    public boolean question3() {
//        System.out.println("jaki jest pierwiastek kwadratowy z liczby 15129");
//        int odpowiedz3 = scanner.nextInt();
//        scanner.close();
//        if (odpowiedz3 == 123) {
//            System.out.println("Dobrze!");
//        } else {
//            System.out.println(odpowiedz3 + " to niepoprawna odpowiedz");
//        }
//        return question3();
//
//    }

//    public String odpowiedzi(){
//        if (question1()== true);
//
}

