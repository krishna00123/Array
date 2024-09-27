package Dsa;

import java.util.Scanner;

public class StackCreate {
    static int[] stack;
    static int top;

    static void StackCre(int size) {
        stack = new int[size];
        top = -1;
        System.out.println("Stack Created with size:- " + size);
    }
    static void push(int ele){
        if(top==stack.length-1){
            System.out.println("Stack overflow Error!!!");
     }
     else{
        top++;
        stack[top]=ele;
        System.out.println(ele+" has inserted  into the stack sucessfully!!");
     }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter a array size ");
        
        int size = ip.nextInt();
      
        StackCre(size);
        while (true) {
            System.out.println("=======Menu==========");
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Peek\n5.Clear");
			System.out.println("6.isEmpty\n7.IsFull\n8.Exit");
			System.out.println("Enter your option:-");
            int op = ip.nextInt();
            switch (op) {
                
                case 1:
                System.out.println("Enter the element.!!");
				int ele = ip.nextInt();
				 push(ele);
                    break;
                case 2:
                System.out.println("option 2 selected");
                System.exit(0);
                        break;

                default:
                        System.out.println("!!!!!!!");
                 
                    }
             }
    
    }
   
}
