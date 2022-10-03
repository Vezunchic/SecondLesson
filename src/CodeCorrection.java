public class CodeCorrection {
    /*
    Если необходимо, исправьте данный код (задание 2)
     */
    public static void main(String[] args) {
        int [] curent = new int [8];
    //    curent[8] = 0;
        DeleteByZero(curent);
    }
    public static void DeleteByZero(int[] intArray)
    {
        try {
            int d = 0;
                double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        }
        // Ошибки из-за обращения к элементу находяшемуся за перделом длины массива
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Catching exception: " + e);
        }
        // Вылавливает арифметические ошибки
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

}
