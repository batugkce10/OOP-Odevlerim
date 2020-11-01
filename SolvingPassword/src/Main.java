//1306180137


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter a 4 digit number for solving the password: ");
        int number=data.nextInt();
        SolvingPassword firstData=new SolvingPassword(number);
    }
}
    
