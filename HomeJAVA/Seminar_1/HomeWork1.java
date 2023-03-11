package Java.HomeJAVA.Seminar_1;

import java.util.Scanner;

public class HomeWork1 
{
    // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        int t = (n * (n + 1))/2;
        System.out.printf("Результат: %d",t);
        scanner.close();
    }    
}
