import java.util.*;
public class MergeSort {

    public static void divide(int arr[],int si,int ei){
        int mid= si+(ei-si)/2;

        divide(arr, si, mid);
        divide(arr, mid+1, ei);

        conquer(arr,si,mid,ei);
    }
    public static void conquer(int arr[],int si,int mid,int ei){
        int merger[]=new int[ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x=0;
        while(indx1 <= mid && indx2 <= ei){
            if(arr[indx1]<= arr[indx2]){
                merger[x]=arr[indx1];
                x++;
                indx1++;
            }else{
                merger[x]=arr[indx2];
                x++;
                indx2++;
            }
        }
        while(indx1<=mid){
            merger[x]=arr[indx1];
            x++;
            indx1++;
        }
        while(indx2<=ei){
            merger[x]=arr[indx2];
            x++;
            indx2++;
        }
        for(int i=0,j=0;i<merger.length;i++,j++){
            arr[j]=merger[i];
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size= scan.nextInt();
        System.out.println("Enter Elements: ");
        int[] ar= new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        divide(ar, 0, ar.length-1);

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+ "  ");
        }

    }
}
