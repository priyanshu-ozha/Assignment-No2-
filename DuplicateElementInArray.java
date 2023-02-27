import java.util.*;
public class DuplicateElementInArray{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size= scan.nextInt();
        System.out.println("Enter Elements: ");
        int[] ar= new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int DuplcateElemnt=0;
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]==ar[j]){
                 System.out.println("Duplicate Element : " + ar[j]);
                 DuplcateElemnt = DuplcateElemnt +1;
                }
            }
        }
        if(DuplcateElemnt==0){
            System.out.println("There are No Duplicate Element in The Array");
        }
    }
}