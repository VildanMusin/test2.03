import java.util.Random;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        int x = new Random().nextInt(101);
        int y;

        while (true){
            System.out.println("Введите число от 0 до 100" );
            y = new Scanner(System.in).nextInt();
            if (x == y) {
                System.out.println("Ура!!! Вы угадали число - " + x);
                System.out.println("Количество попыток: -  ");

                break;


            }else if (y>x){
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат " + y);
            } else {
                System.out.println("Я сам в шоке, но, загаданное число больше, брат" + y);




            }



        }




    }
}
