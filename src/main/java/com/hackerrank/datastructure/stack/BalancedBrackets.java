package com.hackerrank.datastructure.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int testC = sc.nextInt();

       while(testC-- >0) {
           String test =  "[([{{}}]{[[][][([[]]){[]}{}]]}[]{{}}{})[[]]]{{}}(()[[[[[(){}[]]({}{[]})[][[][]]]]{}]{[{}]{[{[][](()({{()}}){([]({({{[]}([([()]{()[[([({{{[]{(){}}[][]({{[([])()](())([{[]([()]{})}]){}([]){()}{}[]([[()]])}()})[{}]}()}(())}){{}()}[]]{{}})]][[]({{[{}]}})({{}({{[]{()}([][{[()]}]{})}()})}{{}}{})]()(){}}(()({()}[([](){[]()}[])])[])[])][{[{[]}]{}([])}]()(()))}){([{}])}[(([]){[]{}})]{}({}{})}){}({{}([][](){{[][{()([[{}()]]{()}{{}{[()]}})[()[]{}](){[{}()[]][{{}}{[{}][]()}[]](())[[][]][]()}}[({}([[{([]){}}]()([()(){}]){([()]())}](()))(()))]]{}()[][{[{}(([]){([()]{()()}([{}][[[]{[[(({([([]){()[]}]){(())}[]}))][((([]{})[{}[[()]({({[()[]]{}(()[{}[][[{}][][]({()}[{([])}][])]][]{})([])}){}{((){})}}){[]}[]()(()(()))(()[{{}}]){}({{{((()([](()[][]{}){({})}{(([{({{}})}]))})))}}})]]))]]}]]))})]}]}})}))})}]}}])";

           String res = isBalanced(test);
           System.out.println(res);
       }
    }

    static String isBalanced(String s) {

        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    stack.push(s.charAt(i));

                    break;

                case '{':
                    stack.push(s.charAt(i));

                    break;

                case '[':
                    stack.push(s.charAt(i));

                    break;

                case ')':
                    if (!stack.isEmpty()&&stack.peek().toString().equals("(")) {
                        stack.pop();
                    }

                    break;

                case ']':
                    if (!stack.isEmpty()&&stack.peek().toString().equals("[")) {
                        stack.pop();
                    }

                    break;

                case '}':
                    if (!stack.isEmpty()&&stack.peek().toString().equals("{")) {
                        stack.pop();
                    }

                    break;

                default:

                    break;

            }

        }
        return stack.isEmpty() ? "YES" : "NO";

    }


}
