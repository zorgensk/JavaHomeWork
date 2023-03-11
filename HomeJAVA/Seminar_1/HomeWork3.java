package Java.HomeJAVA.Seminar_1;

import java.util.Scanner;


public class HomeWork3 
{
    public static void main(String[] args) 
    {   
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.print("Введите второе  число: ");
        int b = scanner.nextInt();
        
        System.out.print("Действие(+  -  *  /): ");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        var res = 0;

         switch(action)
         {
            case "+":
            res = a + b;
            System.out.printf("Ответ: %d", res);
            break;

            case "-":
            res = a - b;
            System.out.printf("Ответ: %d", res);
            break;

            case "*":
            res = a * b;
            System.out.printf("Ответ: %d", res);
            break;

            case "/":
            if(b == 0) 
            {
                System.out.println("На 0 делить нельзя!");
                break;
            }
            else 
            {
                res = a / b;
                System.out.printf("Ответ: %d", res);
                break;
            }
            default:
                System.out.println("Не верный ввод!!!");
         }
         scanner.close();       
    }
}
