package loops;
import java.util.Scanner;
public class AP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        // 1 3 5 7 9.....
//        for(int i=1; i<=n*2-1; i+=2){
//            System.out.println(i);
        //47 10 13 16.......    
//        for(int i=4; i<=3*n+1; i+=3){
//            System.out.println(i); 

//       int a = 4, d = 3;
//      for(int i=1; i<=n; i++){
//            System.out.println(a); 
//            a += d;
            
        int a = 5, d = -4;
        for(int i=1; i<=n; i++){
            System.out.println(a); 
            a += d;
            

        
            
        }

    }
}
