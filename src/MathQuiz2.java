import java.util.Scanner;

class MathQuiz2 {

    Scanner scanner = new Scanner(System.in);

    public boolean question1() {
        System.out.println("jaki jest wynik 3 * 5 = ?");
        int odpowiedz1 = scanner.nextInt();


        if (odpowiedz1 == 15) {
            System.out.println("podałeś poprawną odpowiedz!");
            return true;
        } else {
            System.out.println(odpowiedz1 + " to nie poprawny wynik");
        }
        return false;
    }


    public boolean question2() {
        System.out.println("ile wynisi pole kwadratu o boku 12");
        int odpowiedz2 = scanner.nextInt();

        if (odpowiedz2 == 144) {
            System.out.println("Dobrze!");
            return true;
        } else {
            System.out.println(odpowiedz2 + " to niepoprawna odpowiedz");
        }
        return false;
    }

    public boolean question3() {
        System.out.println("jaki jest pierwiastek kwadratowy z liczby 15129");
        int odpowiedz3 = scanner.nextInt();

        if (odpowiedz3 == 123) {
            System.out.println("Dobrze!");
            return true;
        } else {
            System.out.println(odpowiedz3 + " to niepoprawna odpowiedz");
        }
        return false;

    }

    public int quest1() {
        if (question1() == true) {
            return 1;
        } else return 0;

    }

    public int quest2() {
        if (question2() == true) {
            return 1;
        } else return 0;
    }

    public int quest3() {
        if (question3() == true) {
            return 1;
        } else return 0;

    }

    public String pyt1() {
        if (quest1()==1) return ("dobra odpowiedz na pierwsze pytanie");
        return "zła odpowiedz na pierwsze pytanie";
    }
}

