package com.hackerrank.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertDeleteMaximum {


    /*
    *
    *
    1 x  -Push the element x into the stack.
    2    -Delete the element present at the top of the stack.
    3    -Print the maximum element in the stack.
    * */


    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        Stack<Integer> actual = new Stack();
        Stack<Integer> trackMaximum = new Stack();

        for(int i=0;i<n;i++)
        {

            int caseNumer = sc.nextInt();

            switch (caseNumer){

                case 1:{

                    int data = sc.nextInt();
                    if(!trackMaximum.isEmpty())
                    {
                        Integer peekData = trackMaximum.peek();
                        if(data>=peekData)
                            trackMaximum.push(data);

                    }else {
                        trackMaximum.push(data);
                    }

                    actual.push(data);
                    break;
                }

                case 2:{
                 Integer deleteData =    actual.pop();
                 if(deleteData == trackMaximum.peek())
                 {
                     trackMaximum.pop();
                 }
                 break;
                }

                case 3 :{

                    System.out.println(trackMaximum.peek());
                    break;
                }

            }

        }


    }



}
