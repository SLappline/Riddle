import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Напишите программу-загадку: “Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает”.
//        Ответ: “Заархивированный вирус”.
        System.out.println("Решите загадку.");
        System.out.println("У вас есть всего 3 попытки.");
        System.out.println("Также у вас есть одна подсказка, доступная только на первом шаге. " +
                "Просто напишите слово: Подсказка");
        System.out.println("Будьте внимательны, подсказка досутпна только на первом шаге." +
                "Если вы ошибетесь с ответом, больше отгадать загадку не сможете");
        System.out.println("Загадка: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        String answer = "Заархивированный вирус";

        int attempts = 3;
        int result;
        int result1;
        String hint = "Подсказка";
        Scanner scanner = new Scanner(System.in);
        while (attempts <= 3){
            System.out.print("Ваш ответ: ");
            String youranswer = scanner.nextLine();
            result = youranswer.compareToIgnoreCase(answer);
            result1 = youranswer.compareToIgnoreCase(hint);
            if (attempts == 3){
                if (result1 == 0){
                    System.out.println("Подсказка: Это точно не лук.");
                    attempts = 1;
                }
                else if (result == 0){
                    System.out.println("Правильно!");
                    break;
                }
                else{
                    System.out.println("Подумай еще!");
                    attempts--;
                }
            }
            else if (attempts == 2){
                if (result1 == 0){
                    System.out.println("Подсказка недоступна");
                }
                else if (result == 0){
                    System.out.println("Правильно!");
                    break;
                }
                else{
                    System.out.println("Подумай еще!");
                    attempts--;
                }
            }
            else if (attempts == 1){
                if (result1 == 0){
                    System.out.println("Подсказка недоступна");
                }
                else if (result == 0){
                    System.out.println("Правильно!");
                    break;
                }
                else{
                    System.out.println("Обидно, приходи в другой раз.");
                    break;
                }
            }
        }
    }
}

//        1. У пользователя есть 3 попытки, чтобы отгадать загадку.
//        2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
//        3. Если пользователь ввел неверный ответ на 1 или 2 попытке,
//        вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
//        4. Если пользователь сделал 3 неправильных попытки, вывести “Обидно, приходи в другой раз” и завершить работу.
//        5. Также пользователь имеет право на подсказку при первой попытке, при этом 2 и 3 попытки уже недоступны.
//        Если на первой попытке он введет строку “Подсказка”, вывести любую подсказку.
//        Если на 2 и 3, вывести “Подсказка уже недоступна”.
//        6. Если пользователь, использовавший подсказку, ошибется,
//        вывести “Обидно, приходи в другой раз” и завершить работу.