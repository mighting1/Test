package com.data;

import java.util.Scanner;

/*
利用堆栈将中缀表达式转换成后缀表达式
 */
public class test02 {
    private static String input;
    private Stack theStack;
    private String output = "";
    public static void main(String[] args) {
        System.out.println("中缀表达式：");
        Scanner sc = new Scanner(System.in);

        if (sc.hasNext()) {
            input = sc.next();
        }
        //System.out.println(input);
        //String input="1+2*4/5-7+3/6";
        String output;
        test02 test=new test02(input);
        output=test.doTrans();
        System.out.println("后缀表达式：");
        System.out.println(output);
    }
    public test02(String in){
        input=in;
        int stackSize=input.length();
        theStack=new Stack(stackSize);
    }
    public String doTrans(){
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            switch (ch){
                case '+':
                case '-':
                gotOper(ch,1);
                break;
                case '*':
                case '/':
                gotOper(ch,2);
                break;
                case '(':
                theStack.push(ch);
                break;
                case ')':
                gotParen();
                break;
                default:
                output=output+ch;
                break;
            }
        }
        while (!theStack.isEmpty()){
            output=output+theStack.pop();
        }

        return output;
    }
    public void gotOper(char opThis,int prec1){
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                    if (prec2 < prec1) {
                        theStack.push(opTop);
                        break;
                    } else {
                        output = output + opTop;
                    }
                }
            }
        theStack.push(opThis);
        }
    public void gotParen(){
        while (!theStack.isEmpty()){
            char opTop=theStack.pop();
            if (opTop=='('){
                break;
            }else {
                output=output+opTop;
            }
        }
    }
    class Stack{
        private int maxSize;
        private char[] stackArray;
        private int top;
        public Stack(int max){
            maxSize=max;
            stackArray=new char[maxSize];
            top=-1;
        }
        public void push(char j){
            stackArray[++top]=j;
        }
        public char pop(){
            return stackArray[top--];
        }
        public char peek(){
            return stackArray[top];
        }
        public boolean isEmpty(){
            return (top==-1);
        }
    }

}

