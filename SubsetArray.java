import java.util.*;;
public class SubsetArray {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Size Of Array One");
        int size= scan.nextInt();
        System.out.println("Enter Elements  of Array One: ");
        int[] ar= new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        System.out.println("Enter Size Of Array One");
        int size2= scan.nextInt();
        System.out.println("Enter Elements  of Array Two: ");
        int[] a= new int[size2];
        for(int i=0;i<a.length;i++){
            a[i]=scan.nextInt();
        }

        int len1 = ar.length;
        int len2= a.length;
        int count=0;
       if(len2>1){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<ar.length;j++){
                if(a[i]==ar[j]){
                    count=count+1;
                }
            }
        }
       }else{
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==ar[j]){
                    count=count+1;
                }
            }
        }
       }

       if(count==len1-1){
        System.out.println("The Array One is Subset of Array Two");
       }else{
        System.out.println("The Array Two is Subset of Array One"); 
       }
        
    }
}
