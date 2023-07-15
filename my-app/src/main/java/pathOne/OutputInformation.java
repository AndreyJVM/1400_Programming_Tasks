package pathOne;

/**
 * Часть 1: Вывод информации на экран
 */
public class OutputInformation {
    public static String task1Line31_18_19() {
        // 1.1 Вывести на одной строке числа 31, 18, 79 с одним пробелом между ними.
        int one = 31;
        int two = 18;
        int three = 79;
        return one + " " + two + " " + three;
    }

    public static String task2Line47__52__150() {
        // 1.2 Вывести на одной строке числа 47, 52, 150 с двумя пробелами между ними
        int one = 47;
        int two = 52;
        int three = 150;
        return one + "  " + two + "  " + three;
    }

    public static String task3Return50down10() {
        // 1.3 Вывести на экран числа 50 и 10 одно под другим
        int one = 50;
        int two = 10;
        return one + "\n" + two;
    }

    public static String task4Return5Down10Down150() {
        // 1.4 Вывести на экран числа 5, 10, 21 одно под другим
        int one = 5;
        int two = 10;
        int three = 21;
        return one + "\n" + two + "\n" + three;
    }

    public static String task5Return1Down2() {
        /* Получить на экране следующие:
         1
         2
         */
        int one = 1;
        int two = 2;
        return one + "\n" + two;
    }

    public static String task6OutputPI() {
        // Вывести на экран число PI
        double pi = 3.142;
        return String.valueOf(pi);
    }
}
