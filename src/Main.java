import java.util.Scanner;

class Move{
    public static void moveZero(int []arr){
        int l=arr.length-1;
        int j=0,c=0,p=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
            else {
                c++;
            }
        }
        for(int i=j;i< arr.length;i++){
            arr[i]=0;
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
 }

     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         int n=scanner.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=scanner.nextInt();
         }
         moveZero(arr);
     }


 }
