import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size= scan.nextInt();
        System.out.println("Enter Elements: ");
        int[] ar= new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        for(int i=0; i < ar.length; i++){
            for(int j=0;j<ar.length-1;j++){
                if(ar[j]>ar[j+1]){
                  int temp=ar[j];
                  ar[j]=ar[j+1];
                  ar[j+1]=temp;
                }
            }
        }
    }
}
