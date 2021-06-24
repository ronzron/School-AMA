import java.util.Scanner;

public class MP1_Gambong_Ronnel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true)

        {
            System.out.print(
                    "\n MENU \n [1] Prime or Composite \n [2] All Prime Numbers \n [3] Exit \n Choose an Option ->\n");
            int a = scanner.nextInt();
            if (a < 1 || a > 3) {
                System.out.println("Error! Choose the valid number option");
            }
            switch (a) {
                case 1:
                    System.out.println("Enter an integer");
                    int n = scanner.nextInt();
                    int flag = 0;
                    if (n == 0 || n == 1) {
                        System.out.println("Neither prime nor Composite");
                    } else if (n == -1) {
                        System.out.println("Prime Number");
                    } else if (n < -1) {
                        System.out.println("Composite number");
                    } else {
                        flag = 0;
                        for (int i = 2; i < n; i++) {
                            if (n % i == 0) {
                                flag = 1;
                                System.out.println("Composite Number");
                                break;
                            }
                        }
                        if (flag == 0) {
                            System.out.print("Prime number");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter two integers");
                    int temp = 0;
                    int m = scanner.nextInt();
                    int r = scanner.nextInt();
                    for (int i = m; i <= r; i++) {
                        temp = 0;
                        for (int j = 2; j < i; j++) {
                            if (i % j == 0) {
                                temp = 1;
                                break;
                            }
                        }
                        if (temp == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
