/*
Задание №0. Настроим VS Code
Скачать и установить: https://code.visualstudio.com/download
Настроить проект, вывести в консоль “Hello world!”.
Вывести в консоль системные дату и время.

Задание №1
Написать программу, которая запросит пользователя ввести
<Имя> в консоли.
Получит введенную строку и выведет в консоль сообщение
“Привет, <Имя>!”

Задание №1+
В консоли запросить имя пользователя. В зависимости от
текущего времени, вывести приветствие вида
"Доброе утро, <Имя>!", если время от 05:00 до 11:59
"Добрый день, <Имя>!", если время от 12:00 до 17:59;
"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
"Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/

// import java.time.LocalDateTime;
// import java.util.Scanner;

// import java.lang.reflect.Array;
// import java.util.Arrays;

public class program {
    public static int main(String[] args) {

        // System.out.println("Представьтесь пожалуйста: ");
        // Scanner scanner = new Scanner(System.in, "ibm866");
        // String name = scanner.nextLine();
        // System.out.println("Привет, " + name + "!");
        // System.out.printf("Привет, %s!", name);
        // scanner.close();
        // System.out.println();

        // System.out.println("Hello World!");
        // System.out.println("java program.java");
        // System.out.println(LocalDateTime.now());

/*
Задание №2
Дан массив двоичных чисел, например [1,1,0,1,1,1],
вывести максимальное количество подряд идущих 1.
*/

        // int[] array = {1, 0, 1, 0, 1, 1, 1, 1, 1, 0};

        // int maxCount = getMaxOnes(array);
        // System.out.println("Максимальное количество единиц: " + maxCount);

        /*
        // Date - устаревшие методы
        // Calendar - устаревшие
        System.out.println(LocalDateTime.now());

        // Пимитивные типы данных:
        int num = 34;
        double d = 4.6;
        String str = "Hello!"; // Ссылочный тип (класс)
        char c = 'g';
        boolean b = true;

        System.out.println(num);
        System.out.println(d);
        System.out.println(str);
        System.out.println(c);
        System.out.println(b);

        // Классы обёртки для примитивных типов данных:
        // Integer
        // Double
        // Boolean
        // Character

        // Массивы:

        int[] arr = new int[8];
        int[] arr1 = { 3, 5, 7, 8 };

        // Циклы:

        for (int i = 0; i < arr.length; i++) {

        }

        for (int elem : arr1) {

        }

        while (b) {

        }

        System.out.println(main1());
    }

    public static String main1() {
        return "";
        */
/*
    }
    private static int getMaxOnes(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
            else{
                count = 0;
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
*/

/*
Задание №3
Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести
эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива
должны быть отличны от заданного, а остальные - равны ему.
*/

    //     int array[] = { 5, 3, 2, 2, 3, 2, 3, 2, 3, 6, 3, 6, 3 };
    //     int val = 3;

    //     mooveToEndArray(array, val);
    //     System.out.println(Arrays.toString(array));
    // }
    // public static void mooveToEndArray(int[] nums, int val) {

    //     int right = nums.length - 1;
        
    //     for (int left = 0; left < right; left++) {
    //         while (nums[right] == val && left < right ) {
    //             right--;
    //         }
    //             if (nums[left] == val) {
    //             nums[left] = nums[right];
    //             nums[right] = val;
    //             right--;
    //         }
    //     }
    

/*
Задание №4
Напишите метод, который находит самую длинную строку общего
префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "".
*/

    //     String[] words = {"flowers", "flow", "flight"}; // fl
    //     // String[] str;

    //     System.out.println(getMaxPrefix(words));

    // }

    // public static String getMaxPrefix(String[] words) {
    //     if (words.length == 0 || words == null) {
    //         return "";
    //     }
    //     String prefix = words[0];
    //     for (int i = 1; i < words.length; i++) {
    //         while (words[i].indexOf(prefix) != 0) {
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //             if (prefix.isEmpty()) {
    //                 return "";
    //             }
    //         }
    //     }
    //     return prefix;

/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle,
который принимает число n и возвращает его n-ое треугольное число.
Если число n < 1 (ненатуральное) метод должен вернуть -1.

Пример
n = 4 -> 10
n = 5 -> 15

// N-ое треугольное число (решение):

class Answer {
    public int countNTriangle(int n){
if (n < 1) return -1;
    int sum = 0;
    for(int i = 1; i <= n; i++){
          sum += i;
    }
    return sum;
    }
}

public class Printer{ 
    public static void main(String[] args) { 
      int n = 0;

      if (args.length == 0) {
        n = 4;
      }
      else{
        n = Integer.parseInt(args[0]);
      }     

      Answer ans = new Answer(); 
      int itresume_res = ans.countNTriangle(n);     
      System.out.println(itresume_res);
    }
}


*/

// Моё решение:
    //     int n = 2;
    //     System.out.println(countNTriangle(n));
    // }
    // public static int countNTriangle(int n) {
    //     if (n < 1) {
    //     return -1;
    //     }
    //     int count = 1;
    //     while (n > 1) {
    //         count = count + n;
    //         n--;
    //     }
    // return count ++;

/*
Напишите функцию printPrimeNums,
которая выведет на экран все простые числа в промежутке от 1 до 1000,
каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.

Пример
2
3
5
7
11
...

// Вывести простые числа (решение):

class Answer {
       public static void printPrimeNums() {
        // Напишите свое решение ниже

        // Проход начинается с 2, т.к. это число является наименьшим простым
        for (int i = 2; i <= 1000; i++) {

            boolean isPrime = true;

            // Проверка, является ли число i простым
            // Проход по циклу до корня числа,
            // т.к. дальше нет смысла искать, делителей нет.
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Если число i простое, вывод его на экран
            if (isPrime)
                System.out.println(i);
        }
    }
}

public class Printer{ 
    public static void main(String[] args) { 

      Answer ans = new Answer();      
      ans.printPrimeNums();
    }
}

*/

// Моё решение:
    //     program ans = new program();      
    //     ans.printPrimeNums();
    // }
    // public void printPrimeNums() {
    //     for (int j = 2; j <= 1000; j++) {
    //         boolean simple = false;

    //         for (int i = 2; i * i <= j; i++) {
    //             simple = (j % i == 0);
    //             if (simple) {
    //                 break;
    //             }
    //         }
    //         if (!simple) {
    //             System.out.println(j);
    //         }
    //     }

/*
Реализуйте простой калькулятор.
В методе calculate класса Calculator реализовать калькулятор,
который будет выполнять математические операции (+, -, *, /)
над двумя целыми числами и возвращать результат вещественного типа.
В классе Printer необходимо реализовать проверку переданного оператора,
при некорректном операторе программа должна вывести сообщение об ошибке
"Некорректный оператор: 'оператор'".

Аргументы, передаваемые в метод/функцию:
'3'
'+'
'7'

На выходе:
10.0
*/

// Моё решение:

        // char op = '+';
        // int a = 7;
        // int b = 3;
        // // System.out.println(calculate('+', 3, 7));
        
        // public int calculate(char op, int a, int b) {
        //     // Введите свое решение ниже
        //             if (op != '+' && op != '-' && op != '*' && op != '/') {
        //           System.out.println("Некорректный оператор: '" + op + "'");
        //           }
        //           int result = 0;
        //       switch (op){
        //               case '+':
        //               result = a+b;
        //               break;
        //           case '-':
        //               result = a-b;
        //               break;
        //           case '*':
        //               result = a*b;
        //               break;
        //           case '/':
        //               if (a != 0) {
        //                   result = a / b;
        //                   } else {
        //               result = -1;
        //               }
        //       }
        //       return result;
      
        // }
    }
}

/*

            
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = 3;
        op = '+';
        b = 7;
    } else {
        a = Integer.parseInt(args[0]);
        op = args[1].charAt(0);
        b = Integer.parseInt(args[2]);
}

            program calculator = new program();
            int result = program.calculate(op, a, b);
            System.out.println(result);

        public int calculate(char op, int a, int b) {
            if (op != '+' && op != '-' && op != '*' && op != '/') {
            System.out.println("Некорректный оператор: '" + op + "'");
            }

        double result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                result = (double) a / b;
                } else {
                    result = -1;
                }
                
            }
        return result;
    }
    // public void checkOperator(char op) {
    //     if (op != '+' && op != '-' && op != '*' && op != '/') {
    //         System.out.println("Некорректный оператор: '" + op + "'");
    //         }
    //     }
    }
}
*/