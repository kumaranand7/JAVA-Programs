import java.util.Scanner;
public class input_array {


    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the array size: ");
        int n = sc.nextInt();
        System.out.println("enter the array element: ");

        int arr[] = new int[n];

        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.printf("array element at index %d is %d \n",i,arr[i]);
        }
    }
    }