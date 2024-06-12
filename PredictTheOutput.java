package loops;
public class PredictTheOutput {
    public static void main(String[] args) {
        
        
//        int x= 1;
//        while(x==1)
//        x=x-1;
//        System.out.println(x);

//        int i;
//        while(i=10){
//            System.out.println(i);
//            i = i + 1;
        
//        }

//        while('a'<'b'){
//            System.out.println("malayalam is a palindrome");
//        }

//        int i= 10
//        while(i=20)
//       System.out.println("A computer buff");    

        int x=4,y=0;
        while(x>=0){
            x--;
            y++;
            if(x==y)
                continue;
            else
                System.out.println(x+""+y);
            
        }
        
       
        
    }    
}
  