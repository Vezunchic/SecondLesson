public class FixTheCode {
    /*
    Дан следующий код, исправьте его там, где требуется (задание 3)
     */
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;

        }
        //Ccылка которая не куда не указывает (null)
        catch (NullPointerException e) {
            System.out.println("Указатель не может указывать на null!");
        }
        // индекс массива вне диапазона
        catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
        catch (Throwable e) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b){
        System.out.println(a + b);
    }


}
