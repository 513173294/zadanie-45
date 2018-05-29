public class QuizTest {


    public static void main(String[] args) {


        MathQuiz2 mathQuiz = new MathQuiz2();
        System.out.println("welcome");


        int a = mathQuiz.quest1();
        int b = mathQuiz.quest2();
        int c = mathQuiz.quest3();
        int suma = a + b + c;
        System.out.println("zdobyłeś: " + suma + " pkt");
        System.out.println(
                "ilość pkt za pierwsze pytanie " + a);
        System.out.println("ilość pkt za drugie pytanie " + b);
        System.out.println("ilość pkt za trzecie pytanie " + c);
//        String d =  mathQuiz.pyt1();
//        System.out.println(d);

    }
}


