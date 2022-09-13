package rockpaper;
import java.util.Random;
import java.util.Scanner;

public class Main {
 public void get()
 {
     System.out.println("get");
 }
 static int a;
 static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Random rd = new Random();
        int user,comp,turn;
        System.out.println("**--**--**How many times you want to play**--**--**");
        turn = sd.nextInt();
        System.out.println(" Select 0 for Rock\n Select 1 for Paper\n Select 2 for Scissors");

        while(turn!=0) {

            user = sc.nextInt();
            try
            {
                if(user>2)
                {
                    System.out.println("can't take value greater than 2");
                }
            }
            catch (Exception e)
            {
                System.out.println("can't take value greater than 2");
            }
            comp = rd.nextInt(3);

            if (user == comp) {
                System.out.println("Draw");
            } else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
                System.out.println("You win");
                a++;
            } else if(user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0) {
                b++;
                System.out.println("Computer won");
            }
            else{
                System.out.println("invALID INPUT");
            }
            turn--;
            if(user<=2) {
                System.out.print("Computer move was ");
                if (comp == 0) {
                    System.out.println("Rock");
                } else if (comp == 1) {
                    System.out.println("Paper");
                } else if (comp == 2) {
                    System.out.println("Scissors");
                }
            }
        }


    }

    public void show() {
        System.out.println("hello rudr/aditya/saksham/jaithakur");

        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        Random rd = new Random();
        int user,comp,turn;
        System.out.println("**--**--**How many times you want to play**--**--**");
        turn = sd.nextInt();
        System.out.println(" Select 0 for Rock\n Select 1 for Paper\n Select 2 for Scissors");

        while(turn!=0) {

            user = sc.nextInt();
            try
            {
                if(user>2)
                {
                    System.out.println("can't take value greater than 2");
                }
            }
            catch (Exception e)
            {
                System.out.println("can't take value greater than 2");
            }
            comp = rd.nextInt(3);

            if (user == comp) {
                System.out.println("Draw");
            } else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1) {
                System.out.println("You win");
                a++;
            } else if(user == 0 && comp == 1 || user == 1 && comp == 2 || user == 2 && comp == 0) {
                b++;
                System.out.println("Computer won");
            }
            else{
                System.out.println("invALID INPUT");
            }
            turn--;
            if(user<=2) {
                System.out.print("Computer move was ");
                if (comp == 0) {
                    System.out.println("Rock");
                } else if (comp == 1) {
                    System.out.println("Paper");
                } else if (comp == 2) {
                    System.out.println("Scissors");
                }
            }
        }
        System.out.println("comp points are "+b);
        System.out.println("user points are "+a);
    }
}