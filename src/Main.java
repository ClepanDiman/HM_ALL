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
        //task 6

        byte banQuantity = 5;
        byte oneBanWeght = 80;
        short banAllWeght = (short) (banQuantity * oneBanWeght);
        short milkQuantity = 200;
        byte milkServ = 105;
        short milkAll = (short) ((milkQuantity/100) * milkServ);
        byte iceCreamQuantity = 2;
        byte iceCreamWeght = 100;
        short iceCreamAll = (short) (iceCreamQuantity * iceCreamWeght);
        byte eggQuantity = 5;
        byte oneEggWeght = 70;
        short eggAll = (short) (eggQuantity * oneEggWeght);

        short blender = (short) (eggAll + iceCreamAll + milkAll + banAllWeght);
        float blenderInKilo = (eggAll + iceCreamAll + milkAll + banAllWeght)/1000f;
        System.out.println("Этот завтрак весит "+ blender + " грамм или " + blenderInKilo +" килограмм. Приятного аппетита!");
        //task 7

        short losPerDayOne = 250;
        short losPerDayTwo = 500;
        byte losTarget = 7; // тут в кг (будем переводить)
        short fistDaysForLos = (short) ((short) (losTarget*1000) / losPerDayOne);
        short secDaysForLos = (short) ((short) (losTarget*1000) / losPerDayTwo);
        double midLosPerDay = (losPerDayOne + losPerDayTwo) /2;
        double midDayaForLos = (losTarget*1000) / losPerDayTwo;

        System.out.println("Для сброса "+ losTarget +" килограмм по "+losPerDayOne+" грамм в день, у спортсмена уйдет "+ fistDaysForLos + " дней");
        System.out.println("Для сброса "+ losTarget +" килограмм по "+losPerDayOne+" грамм в день, у спортсмена уйдет " + secDaysForLos+" дней");
        System.out.println("Среднее значение потери грамм в день " + midLosPerDay + " Среднее количество дней на похудение " + midDayaForLos);
        //task 8
        //Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников. В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.
        //
        //К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
        //
        //Маша получает 67 760 рублей в месяц.
        //Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        //Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
        //
        //Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
        //
        //Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

    }
}
