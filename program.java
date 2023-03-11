package Java;


import java.util.Scanner;

public class program
{
   public static void main(String[] args) 
    {
        System.out.printf("Ваше имя: %s",inputStr("Введите имя: ")); 
        
    }
    public static String inputStr(String message)
    {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String inputUser = scanner.nextLine();
        scanner.close();
        return inputUser;
    }

}
