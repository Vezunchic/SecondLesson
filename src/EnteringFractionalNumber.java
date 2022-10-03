import java.util.Scanner;

public class EnteringFractionalNumber {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
     значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
      запросить у пользователя ввод данных.
     */
    public static void main(String[] args)
    {
       var a =  EnteringNumber();
    }
    //Возвращает запрос на введение данных с спомошью рекурсии
    public static Float EnteringNumber()
   {
    System.out.println("Введите число");
    Scanner current = new Scanner(System.in);
    float x = 0;

    if (current.hasNextFloat())
    {
        x = current.nextFloat();
        System.out.println("Введено число:" + x);
        return x;
    }
    else
    {
        String line = current.nextLine();
        System.out.println("Введено не верное число:" + line);
        return EnteringNumber();
    }
   }
}
