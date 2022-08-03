package EvenOdd;

import java.util.Scanner;

public class Even{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        boolean running = true;
        Integer result = null;

        while(running){

            if(input != null){
                result = input%2;
                //System.out.println(result);
                break;
            } 
        }
        
        if(result == 0){
            System.out.println("EVEN NUMBER!!");
            result = null;
            
        }
            else{
            System.out.println("ODD NUMBER FOOL!!");
            result = null;

            if(input <= 1){
                System.out.println("no prime");
            }
            for(int i = 2; i < input; i++){
                if(input % i == 0){
                    System.out.println("maybe prime");
                }
                else if(input == 9 || input == 15){
                    System.out.println("NOTA 24Prime Numba");
                }
                else{
                    System.out.println("Prime Numba");
                }
                break;
            }
            
            
        }
        
    }

    

}