import java.util.Scanner;

public class Tiger {

    public static void main (String[] args)
    {
        Scanner meow = new Scanner(System.in);
        System.out.println("Number of zombies - ");
        int number = meow.nextInt();
        System.out.printf("Zombies is - %d \n" , number);
    }
}
