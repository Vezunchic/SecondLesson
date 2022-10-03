import java.util.Scanner;

public class EntersAnEmptyString {

    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
     показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) {
        EnteringNumber();
    }

    public static String EnteringNumber() {

        System.out.println("Введите текст");
        Scanner current = new Scanner(System.in);
        String line = current.nextLine();
        if(current == null || line.isEmpty()) {
           throw new RuntimeException("Строка пустая, пустые строки вводить нельзя");

        }
        else
        {
            System.out.println("Введено:" + line);
            return line;
        }


    }
}
