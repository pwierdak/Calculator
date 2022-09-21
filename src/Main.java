import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! What do you want to do?\n1.addition\n2.substraction\n3.multiplication\n4.division");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please, enter first value.");
        int x= scanner.nextInt();
        System.out.println("Please, enter second value.");
        int y= scanner.nextInt();
        int select= scanner.nextInt();
        switch (select){
            case 1:
                System.out.println(x+y);
                break;
        }
    }
}