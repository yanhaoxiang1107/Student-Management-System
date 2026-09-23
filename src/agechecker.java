import java.util.Scanner;

public class agechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入你的年龄：");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("你已经成年了");
        } else {
            System.out.println("你还未成年");
        }

        scanner.close();
    }
}



