import java.util.Scanner;

public class MyZadachki {
    public static void main(String[] args) {
      /*  //Задача 1//
        System.out.print("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        if (num1 > -10 && num1 < 0)
            System.out.println("Это однозначное отрицательное число ");
        else if (num1 > -100 && num1 < -10)
            System.out.println("Это двухзначное отрицательное число ");
        else if (num1 > -1000 && num1 < -100)
            System.out.println("Это трехзначное отрицательное число ");
        else if (num1 < 10 && num1 > 0)
            System.out.println("Это однозначное положительное число ");
        else if (num1 < 100 && num1 >= 10)
            System.out.println("Это двухзначное положительное число ");
        else if (num1 < 1000 && num1 >= 100)
            System.out.println("Это трехзначное положительное число ");
*/
       /* //Задача 2//
        System.out.print("Введите сторону треугольника a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите сторону треугольника b: ");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        System.out.print("Введите сторону треугольника c: ");
        Scanner scan2 = new Scanner(System.in);
        int c = scan2.nextInt();
        if (a + b < c || a + c < b || b + c < a)
            System.out.println("Треугольник не существует");
        else if (a + b > c && a + c > b && b + c > a)
            System.out.println("Треугольник существует");
        */
      /*  //Задача 3//
        System.out.print("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a > 0)
            System.out.println("Равно" + " " + (a = a + 1));
        else if (a == 0)
            System.out.println("Равно" + " " + (a = 10));
        else if (a < 0)
            System.out.println("Равно" + " " + (a = a - 2));
       */
        //Задача 4.Вывод четных чисел от 0 до 100//
       /* for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(" " + i + " ");

        */
        //Задача 5. Сумма нечетных//
       /* int sum = 0;
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.print("+" + i);
            sum = sum + i;
        }
        System.out.print("=" + sum);

        */
        //Задача6.Спортсмен//
         /*   double day1Km = 10;
            double percent = 10;
            int days = 7;
            double kmFor7Days = 0;
            for (int i = 0; i < days; i++) {
                kmFor7Days += day1Km;
                day1Km = day1Km + ((day1Km * percent) / 100);
            }
            System.out.println(kmFor7Days);
          */


        //Задача 7.Амеба//
       /* int hours = 24;
        int amebaBefore = 0;
        int amebaAfter = 2;
        for (int i = 3; i <= hours; i = i + 3) {
            amebaBefore = amebaAfter;
            amebaAfter = (amebaBefore * 2) + amebaBefore;
            System.out.println("For " + i + " hours "+ amebaBefore + " ameb.");

        */
        //Задача 8.Дюймы//
       /* double cm1 = 2.54;
        double dnext = 0;
        String inch;
        for (int i = 1; i <= 20; i++) {
            dnext = cm1 * i;
            inch = i == 1 ? "дюйме" : "дюймах";
            System.out.println("в " + i + " " + inch + " = " + dnext + " см");

        */

        }


    }










