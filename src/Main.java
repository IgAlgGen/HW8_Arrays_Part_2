import java.util.Random;

public class Main {
    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = generateRandomArray();
        /* Задание 1.
        Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Сумма трат за месяц составила … рублей».*/
        System.out.println("Задание 1.");

        int sum = 0;
        for (int num : arr) {
            sum = sum + num;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        /* Задание 2.
        Следующая задача — найти минимальную и максимальную трату за день.
        Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».*/
        System.out.println("\nЗадание 2.");

        int maxSpend = arr[0], minSpend = arr[0];
        for (int num : arr) {
            if (maxSpend < num) {
                maxSpend = num;
            } else if (minSpend > num) {
                minSpend = num;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSpend + "рублей. Максимальная сумма трат за день составила " + maxSpend + " рублей.");

        /* Задание 3.
        А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
        и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».*/
        System.out.println("\nЗадание 3");

        int result = 0;
        for (int num : arr) {
            result += num;
        }
        System.out.println("Средняя сумма трат за месяц составила " + result / arr.length + " рублей.");

        /*В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        Данные с именами сотрудников хранятся в виде массива символов (char[]).
        Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде. В качестве данных для массива используйте:
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        В результате в консоль должно быть выведено "Ivanov Ivan".
        Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.*/
        System.out.println("\nЗадание 4.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
