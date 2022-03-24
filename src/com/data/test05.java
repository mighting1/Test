package com.data;
/*
字符串反转
 */
public class test05 {
    private String input;
    private String output;

    public test05(String in){
        input=in;
    }
    public String doRev(){
        stack st=new stack(input.length());
        for (int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            st.push(ch);
        }
        output = "";
        while (!st.isEmpty()){
            char ch=st.pop();
            output+=ch;
        }
        return output;
    }
    public static void main(String[] args) {
        String input="hello world!!";
        String output;
        test05 reverser=new test05(input);
        output=reverser.doRev();
        System.out.println("反转前："+input);
        System.out.println("反转后："+output);
    }
    class stack{
        private int maxSize;
        private char[] stackArray;
        private int top;
        public stack(int max){
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
