import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int arr_size=sc.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<=arr_size-1;i++){
        arr[i]=sc.nextInt();
      }
      int lar=arr[0];
       for(int i=0;i<=arr_size-1;i++){
         if(arr[i]>lar)
         {
           lar=arr[i];
         }
       }
      System.out.println(lar);
        
    }
}