import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Wrong {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<Integer>();
        try {
            Scanner scanner = new Scanner(new File("./src/input.txt"));
            while (scanner.hasNextInt() == true) {
                nums.add(scanner.nextInt());
            }

            scanner.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println((int) nums.get(3));

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                int num1 = (int) nums.get(i);
                int num2 = (int) nums.get(j);
                if ((num2 % num1) == 0 || (num1%num2==0)) {
                    System.out.print("(" + num1 + "," + num2 + ") ");
                }
            }
        }
    }
}
