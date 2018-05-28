public class QuizTest {


    public static void main(String[] args) {


        MathQuiz2 mathQuiz = new MathQuiz2();
        System.out.println("welcome");

//        boolean odpowiedz1 = mathQuiz.question1();
//        boolean odpowiedz2 = mathQuiz.question2();
//        boolean odpowiedz3 = mathQuiz.question3();
//       System.out.println(odpowiedz1);

       nowa nowa = new nowa();


      int a = nowa.quest1(mathQuiz);
       int b = nowa.quest2(mathQuiz);
       int  c = nowa.quest3(mathQuiz);
        System.out.println(a + b + " Punkty");

//        System.out.println(odpowiedz2);
//        System.out.println(odpowiedz3);

//        public int quest1() {
//        if (mathQuiz.question1() == true) {
//            return 1;
//        } else return 0;
//
//    }
//
//    public int quest2() {
//        if (question2() == true) {
//            return 1;
//        } else return 0;
//    }
//
//    public int quest3() {
//        if (question3() == true) {
//            return 1;
//        } else return 0;
//
//    }

//        int a = mathQuiz.quest1();
//        int b = mathQuiz.quest2();
//        int c = mathQuiz.quest3();
//        int suma = mathQuiz.quest1() + mathQuiz.quest2() + mathQuiz.quest3();
//        System.out.println(suma);
//        System.out.println(a+b+c);
//       System.out.println("twoj wynik to: "+ suma + "/3");


    }
}