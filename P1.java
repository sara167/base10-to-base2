package p1;

import java.util.Scanner;
import java.util.Stack;

public class P1 {

    public static void main(String[] args) {
       Scanner scan = new Scanner ( System.in);
       Stack s = new Stack();
       System.out.print("Enter a base 10 number : ");
       int num = scan.nextInt();
       if (num==0)
           s.push(0);
       while (num!=0){
           if (num%2==0)
               s.push(0);
           else 
               s.push(1);
           num=(int)(num/2);
       }
       System.out.print("The number in Base 2 : ");
       print(s);
    }
    
    public static void print(Stack s){
        Stack temp = new Stack();
        copy(s,temp);
        while(!temp.isEmpty()){
            System.out.print(temp.pop()+" ");
        }
        System.out.println("");
    }
    
    public static void copy(Stack a ,Stack b ){
        Stack c = new Stack();
        while(!a.isEmpty())
            c.push(a.pop());
        while(!c.isEmpty()){
            a.push(c.peek());
            b.push(c.pop());
        }
        
    }
    
}
