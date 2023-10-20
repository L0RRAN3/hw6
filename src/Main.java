// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int numberFirst = 1; numberFirst <= 10; numberFirst++)
        {
            System.out.println(numberFirst);}

        System.out.println();
        System.out.println("Задача 2");
        for (int numberSecond = 10; numberSecond >= 1; numberSecond--)
        {
            System.out.println(numberSecond);}

        System.out.println();
        System.out.println("Задача 3");
        for (int numberThird = 0; numberThird <= 17; numberThird = numberThird + 2)
        {
            System.out.println(numberThird);}

        System.out.println();
        System.out.println("Задача 4");
        for (int numberFour = 10; numberFour >= -10; numberFour--)
        {
            System.out.println(numberFour);}

        System.out.println();
        System.out.println("Задача 5");
        for (int years = 1904; years <= 2096; years = years + 4)
        {
            System.out.println(years + " год является високосным");}

        System.out.println();
        System.out.println("Задача 6");
        for (int numberFive = 7; numberFive <= 98; numberFive = numberFive + 7)
        {
            System.out.println(numberFive);}

        System.out.println();
        System.out.println("Задача 7");
        for (int numberSix = 1; numberSix <= 512; numberSix = numberSix * 2)
        {
            System.out.println(numberSix);}

        System.out.println();
        System.out.println("Задача 8");
        int bank = 0;
        for (int mounth = 1; mounth <= 12; mounth++)
        {
            bank = bank + 29000;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + bank + " рублей");}

        System.out.println();
        System.out.println("Задача 9");
        float bankFirst = 29000;
        for (int mounthFirst = 1; mounthFirst <= 12; mounthFirst++)
        {
            bankFirst = bankFirst + (bankFirst * 0.1f);
            System.out.println("Месяц " + mounthFirst + ", сумма накоплений равна " + bankFirst + " рублей");}

        System.out.println();
        System.out.println("Задача 10");
        for (int table = 1; table <= 10; table++)
        {
            System.out.println("2 * " + (table) + " = " + 2*table);}
    }
}