package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> list;
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.println("Choose directory:");
        FilePath filePath = new FilePath("D:\\EnglishWrittingProject\\" + print.nextLine() + ".txt");
        list = filePath.getList();
        int a = 1;
        int mistakes = 0;
        while (list.size() > 0){
            int ramdom = Random.getRandom(list.size());
            String [] arr = getArr(ramdom);
            System.out.println(a++ + ". " + arr[1]);
            boolean bool;
            do{
                String ans = print.nextLine();
                bool = ans.equalsIgnoreCase(arr[0]);
                if(!bool){
                    mistakes++;
                    System.out.println(arr[0]);
                }
                System.out.println(bool);
            }while (!bool);
        }
        System.out.println("Count of mistakes: " + mistakes);
    }
    public static String [] getArr (int random){
        String [] arr = list.get(random).split(" - ");
        list.remove(random);
        return arr;
    }
}