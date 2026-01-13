
public class Loops {
    public static void main(String[] args) {
        //for loop in java
        System.out.println("For loop : ");
        for(int i=0; i<10; i++){
            System.out.print(i+ " ");
        }
        
        //while loop in java
        System.out.println();
        System.out.println("while loop : ");
        int num = 0;
        while(num<10){
            System.out.print(num+ " ");
            num++;
        }

        //do while loop in java
        System.out.println();
        System.out.println("Do while loop : ");
        int n = 0;
        do{
            System.out.print(n+" ");
            n++;
        }while(n<=5);
    }
}
