import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        do{
            System.out.println("Enter number " + counter + ": ");

            boolean isInt = scanner.hasNextInt();

            if (!isInt){
                System.out.println("Invalid number!");
            }else{
                int num = scanner.nextInt();
                sum = sum + num;
                counter++;
            }
            scanner.nextLine();

        }while(counter<=10);
        System.out.println("The sum is : " + sum);
        scanner.close();
    }
}