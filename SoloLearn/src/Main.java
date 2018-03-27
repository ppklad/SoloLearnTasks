import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Choose your task:  \n 1.Snails journey \n 2.Stepik 2.4 \n 3.Stepik 3.3 moveRobot \n exit. Exit program \n>");
        String strIn = scanIn.nextLine();
        while (!strIn.equals("exit")){
            System.out.print("Your choise:"+strIn +"\n>");
            switch (strIn){
                case "1": snailsJourney();
                    break;
                case "2": stepik_2_4();
                    break;
                case "3": moveRobot();
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
    
    static String stepik_2_4(){
        String rolesX = new String("Городничий\n" +
                "Аммос Федорович\n" +
                "Артемий Филиппович\n" +
                "Лука Лукич");
        String textLinesX = new String("Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.\n" +
                "Аммос Федорович: Как ревизор?\n" +
                "Артемий Филиппович: Как ревизор?\n" +
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.\n" +
                "Аммос Федорович: Вот те на!\n" +
                "Артемий Филиппович: Вот не было заботы, так подай!\n" +
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!");


        String[] roles = rolesX.split("\n");
        String[] textLines = textLinesX.split("\n");

        StringBuilder strOut = new StringBuilder();

        for (String role:roles
             ) {
            strOut.append(role+":\n");
            int i=1;
            for (String line:textLines
                 ) {
                if(line.startsWith(role+": ")) {
                    strOut.append( i+") " + line.replaceFirst(role+": ","")+"\n");
                }
                i++;
                }
            strOut.append("\n");
            }
            return strOut.toString();
        }

    static void moveRobot() { //stepik_3_3

        Robot robot = new Robot(0,0,Direction.UP);
        int toX = 3;
        int toY = 0;


        //static void moveRobot(Robot robot, int toX, int toY) {
        Direction xDirection = robot.getX()>toX? Direction.LEFT : Direction.RIGHT;
        Direction yDirection = robot.getY()>toY? Direction.DOWN : Direction.UP;

            while (robot.getDirection()!=xDirection){//поворачиваем налево
                robot.turnRight();
            }
            while (robot.getX()!=toX){
                robot.stepForward();
            }
            while (robot.getDirection()!=yDirection){//поворачиваем налево
                robot.turnRight();
            }
            while (robot.getY()!=toY){
                robot.stepForward();
            }
        }

    }




