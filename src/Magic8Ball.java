import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter a yes-no question and I will answer it: ");
        String question = scan.nextLine();

        String response = "";

        int n = (int) (Math.random()*6) + 1;

        if (n==1) {
            response = "Outlook good";
        }
        if (n==2) {
            response = "Without a doubt!";
        }
        if (n==3) {
            response = "Yes";
        }
        if (n==4) {
            response = "No";
        }
        if (n==5) {
            response = "Maybe";
        }
        if (n==6) {
            response = "Ask again later";
        }

        System.out.println(response);
    }
}