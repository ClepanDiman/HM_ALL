//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //task1
        int a = 40000;
        byte b = 22;
        short c = 30000;
        long d = 2150000000000L;
        float e = 3.75f;
        double f = 3.1499999999999;
        System.out.println("Значение переменной a с типом int равно :" + a);
        System.out.println("Значение переменной b с типом byte равно :" + b);
        System.out.println("Значение переменной c с типом short равно :" + c);
        System.out.println("Значение переменной d с типом long равно :" + d);
        System.out.println("Значение переменной e с типом float равно :" + e);
        System.out.println("Значение переменной f с типом double равно :" + f);

        //task 2

        float cG = 27.12F;
        long cF = 987678965549L;
        float cA = 2.786f; // тут в задании заложена ошибка символ ","
        short cS = 569;
        short cD = -159;
        short cH = 27897;
        byte cB = 67;

        //task 3
        byte schoolClass1 = 23;
        byte schoolClass2 = 27;
        byte schoolClass3 = 30;
        short schoolPaper = 480;
        short paperPerman = (short) (schoolPaper / (schoolClass1+schoolClass2+schoolClass3));
        System.out.println("На каждого ученика рассчитано " + paperPerman + " листов бумаги");
        //task4
        byte dayInMonth = 30;
        byte botPerMin = 16/2;
        short bot20min = (short) (botPerMin * 20);
        int minDay = 24*60;
        int botInDay = minDay * botPerMin;
        long bot3day = (botInDay*3);
        long botMonth = botInDay * dayInMonth;

        System.out.println("За 20 минут машина произвела " + bot20min + " штук бутылок");
        System.out.println("За сутки минут машина произвела " + botInDay + " штук бутылок");
        System.out.println("За три дня минут машина произвела " + bot3day + " штук бутылок");
        System.out.println("За месяц минут машина произвела " + botMonth + " штук бутылок");
        //task 5
        byte canPaintall = 120;
        byte canWhiteonClass = 2;
        byte canBrownonClass = 4;
        byte canSummonClass = (byte) (canBrownonClass + canWhiteonClass);
        byte schoolClasses = (byte) (canPaintall / canSummonClass);
        byte canWhiteonSchool = (byte) (canWhiteonClass * schoolClasses);
        byte canBrownonSchool = (byte) (canBrownonClass * schoolClasses);
        System.out.println("В школе, где "+ schoolClasses + " классов, нужно " + canWhiteonSchool + " банок белой краски и "+ canBrownonSchool +" банок коричневой краски");




    }
}
