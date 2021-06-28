import java.util.Scanner;

public class MyZadachki {
    public static void main(String[] args) {
      /*  //Задача 1) В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
//
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
       /* //Задача 2 Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
Существует.//
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
      /*  //Задача 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.
//
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
        //Задача 9.Окончание.//
       /* System.out.print("Введите число программистов: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a % 10 == 0 || a % 10 >= 5 && a % 10 <= 9 || a % 100 >= 11 && a % 100 <= 19)
            System.out.println(a + " программистов");
        else if (a % 10 == 1)
            System.out.println(a + " программист");
        else if (a % 10 >= 2 && a % 10 <= 4)
            System.out.println(a + " программиста");

        */
        //Даны 3 целых числа. Найти количество положительных и отрицательных
        //чисел в исходном наборе.
        /*System.out.print("Введите целое число a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите целое число b: ");
        Scanner scan1 = new Scanner(System.in);
        int b = scan1.nextInt();
        System.out.print("Введите целое число c: ");
        Scanner scan2 = new Scanner(System.in);
        int c = scan2.nextInt();
        if (a > 0 && b > 0 && c > 0)
            System.out.println("В исходном наборе 3 положительных числа");
        else if (a < 0 && b < 0 && c < 0)
            System.out.println("В исходном наборе 3 отрицательных числа");
        else if (a > 0 && b > 0 && c < 0 || a > 0 && c > 0 && b < 0 || b > 0 && c > 0 && a < 0)
            System.out.println("В исходном наборе 2 положительных и 1 отрицательное числа");
        else if (a < 0 && b < 0 && c > 0 || a < 0 && c < 0 && b > 0 || b < 0 && c < 0 && a > 0)
            System.out.println("В исходном наборе 1 положительное и 2 отрицательных числа");

         */
        //)Вычислить: 1+2+4+8+16+32...+256
       /* int sum = 0;
        int next = 1;
        for (int i = 1; i <= 256; i = i * 2) {
            System.out.print("+" + next);
            next = i * 2;
            sum += next;
        }
        System.out.print("=" + sum);

        */
        // Треугольники
       /* for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 4; j >= i; j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        */
        //Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
        /*
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print("Task" + i);
            System.out.println();
        }

         */
        //)Составьте программу, вычисляющую A*B, не пользуясь операцией
        //Умножения
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        int multiply = 0;
        for(int i = 1; i <= a; i++)
        {
            multiply = multiply + b;
        }
        System.out.println("произведение " + a + " и " + b + " = " + multiply);

         */

    }
}











