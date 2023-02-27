import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size= scan.nextInt();
        System.out.println("Enter Elements: ");
        int[] ar= new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
    }
}
