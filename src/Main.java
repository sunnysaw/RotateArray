/*
In this given section we will see how to rotate an array with given element k :
____________________________________________________________________________________
Question : Rotate the given array 'a' by k step, where k is non-negative number :
          NOTE : k can be greater than n as will.
 */
import java.util.Scanner;
public class Main {
    static int[] rotate(int arr[] , int k){
        k = k % arr.length;
        int temp[] = new int[arr.length];
        int j = 0;
        int l = arr.length - k;
        for (int i = l; i < arr.length; i++){
            temp[j++] = arr[i];
        }
        int d = arr.length - k - 1;
        for (int i =0; i < d; i++){
            temp[j++] = arr[i];
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY : ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER THE VALUE YOU WANT TO STORE IN ARRAY : ");
        System.out.println("PRINTING THE MAIN VALUE OF ARRAY : ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println("ENTER THE VALUE FOR ROTATING THE ARRAY :");
        int k = sc.nextInt();
        System.out.println("ROTATED ARRAY :");
        System.out.println(rotate(arr , k));
        }
    }
