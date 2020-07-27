package geekbrains.hw_1_3;

import java.util.Random;
import java.util.Scanner;

public class Hw_1_3 {

//    1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
//    попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
//    указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
//    выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args) {

        int userVar;

        do {                                                        // делаем циклы, пока пользователь не выберет 0 по условию while;
            Random rand = new Random();
            int randNumber = rand.nextInt(10);                // рандомайз числа от 0 до 9;

            for (int i = 0; i < 3; i++) {                           // циклы, работающие с введенным пользователем числом и ограниченные 3 попытками (3 цикла);
                Scanner sc = new Scanner(System.in);                // спрашиваем число у пользователя и просим ввести;
                System.out.println("Введите число от 0 до 9: ");
                int userNumber = sc.nextInt();

                if (userNumber == randNumber) {                     // проходим по условиям;
                    System.out.println("Поздравляю! Вы угадали!");
                    break;
                } else if (userNumber > randNumber) {
                    System.out.println("Вы ввели слишком большое число");
                } else {
                    System.out.println("Вы ввели слишком маленькое число");
                }

                if (i == 2) {                                       // когда исчерпали попытки - сообщаем о проигрыше;
                    System.out.println("Вы проиграли");
                }
            }

            Scanner sc = new Scanner(System.in);                                // после выхода из цикла for спрашиваем о желании продолжить или прекратить игру и записываем ответ пользователя;
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            userVar = sc.nextInt();

        } while (userVar == 1);                                     // сравниваем с ответом пользователя. Если 1, то повторяем while;
    }
}

