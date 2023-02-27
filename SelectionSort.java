import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size= scan.nextInt();
        System.out.println("Enter Elements: ");
        int[] ar= new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        for(int i=0;i<ar.length;i++){
            int smallest=i;
            for(int j=i+1;j<ar.length;j++){
                if(ar[smallest]>ar[j]){
                    smallest=j;
                }
            }
            int temp=ar[smallest];
            ar[smallest]=ar[i];
            ar[i]=temp;
        }
        System.out.println(Arrays.toString(ar));
    }
}
