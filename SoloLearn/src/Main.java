import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Choose your task:  \n 1. Snails journey \n exit. Exit program \n>");
        String strIn = scanIn.nextLine();
        while (!strIn.equals("exit")){
            System.out.print("Your choise:"+strIn +"\n>");
            switch (strIn){
                case "1": snailsJourney();
                break;
                //case "":
                //case "":
                //case "":
                default: System.out.print("Bull shit! Try again!");
            }
            strIn = scanIn.nextLine();
        }
        System.out.print("Good bye!");
        }

     static void snailsJourney(){
         //int h,a,b;
         Scanner scanIn = new Scanner(System.in);
         System.out.print("h =");
         double h = scanIn.nextDouble();
         System.out.print("a =");
         double a = scanIn.nextDouble();
         System.out.print("b =");
         double b = scanIn.nextDouble();

         System.out.print("Need "+((int)(h/(a-b))-1)+" days!");
     }
    }

