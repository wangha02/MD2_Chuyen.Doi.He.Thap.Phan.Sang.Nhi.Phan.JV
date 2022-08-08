import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhap So Can Chuyen Vao Day ?");
        int input = scanner.nextInt();

        while (input != 0){
            int a = input % 2;
            stack.push(a);
            input /= 2;
//            System.out.println("hien thi so thap phan: ");
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }
        System.out.println("He So Nhi Phan");
        System.out.println(Arrays.toString(result));
    }
}