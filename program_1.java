package Java;

// public class program_1 
// {
//     public static void main(String[] args)
//     {
//         int[] arr = new int[] { 1, 1, 0, 1, 1, 1 }; 
//     }
    
// }
// //  и определяет является ли строка палиндромом (возвращает boolean значение).

// package Sem_2_cw;

// public class ex3 {
//     public static void main(String[] args) {
//         System.out.println(polindrom("шалфлаш"));

//     }
//     public static boolean polindrom(String text){
//         // StringBuilder builde = new StringBuilder();
//         boolean answer = false;
//         for (int i = 0; i < text.length()/2; i++) {
//             if (text.charAt(i) == text.charAt(text.length()-(i+1))){
//                 answer = true;
//             } else {
//                 answer = false;
//                 break;
//             }
//         }     
//         return answer;
//     }

// }
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Напишите метод, который составит строку, 
 * состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, 
 * обработайте исключения.
 */
// public class progam3 {
//     public static void main(String[] args) {
//         String text = "TEST ";
//         text = generString(text);
//         generFile(text);
//     }

//     public static String generString(String text){
//         StringBuilder sb = new StringBuilder();
//         for (int j = 0; j < 100; j++){
//             sb.append(text);
//         }
//         return sb.toString();
//     }
    
//     public static void generFile(String stringToFile){
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write(stringToFile);
//             System.out.println("File was written");
//             fw.flush();
//             } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }