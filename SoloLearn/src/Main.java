import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Choose your task:  \n 1. Snails journey \n exit. Exit program \n>");
        String strIn = scanIn.nextLine();
        while (!strIn.equals("exit")){
            System.out.print("Your choise:"+strIn +"\n>");
            strIn = scanIn.nextLine();
        }
        System.out.print("Good buy!");
        }
    }

