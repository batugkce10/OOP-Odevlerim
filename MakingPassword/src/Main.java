//1306180137


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter a 4 digit number for making a password: ");
        int number=data.nextInt();
        MakingPassword firstData=new MakingPassword(number);
    }
}
