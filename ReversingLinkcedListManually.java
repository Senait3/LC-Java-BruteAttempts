import java.util.LinkedList;
import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int start1 = 0;
        int start2 = 0;
        LinkedList<Integer> List1 = new LinkedList<Integer>();
        LinkedList<Integer> List2 = new LinkedList<Integer>();
        
        System.out.println("size : ");
        int size = sc.nextInt();
        
        
        for(int i =0;i<size;i++){
            System.out.println("number : ");
            int num = sc.nextInt();
            
            List1.add(start1,num);
            start1++;
        }
        System.out.println("Before Reversal: " +List1);
        for(int i= List1.size()-1;i>=0;i--){
            int position = List1.get(i);
            List2.add(start2,position);
            start2++;
        }
        System.out.println("After Reversal: " +List2);
    }
}



/*
tryin to reverse a linkedlist based on given user imput
*/
