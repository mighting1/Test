package com.data;
/*
栈的实现
 */
public class test04 {
    private int maxSize;
    private long[] stackArray;
    private int top;
    public test04(int s){
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }
    public void push(long ch){
        stackArray[++top]=ch;
    }
    public long pop(){
        return stackArray[top--];
    }
    public long peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==maxSize-1);
    }

    public static void main(String[] args) {
        test04 stack=new test04(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("栈中元素："+stack);
        long a=stack.pop();
        long b=stack.pop();
        System.out.println("出栈元素："+a+","+b);
        System.out.println("栈中元素："+stack);
        boolean bl=stack.isEmpty();
        System.out.println("是否为空栈："+bl);
        boolean bl2=stack.isFull();
        System.out.println("是否为满栈："+bl2);
        long c=stack.pop();
        boolean bl3=stack.isEmpty();
        System.out.println("是否为空栈："+bl3);
    }
}
