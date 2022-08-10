package com.zjy.mb.compute;

import java.util.Stack;

public class demo01 {
    public void test(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);


        System.out.println(stack);

        Integer peek = stack.peek();
        System.out.println(peek);

        boolean empty = stack.empty();
        System.out.println(empty);

        Integer pop = stack.pop();
        System.out.println(pop);

        System.out.println(stack);

        int search = stack.search(1);
        System.out.println(search);

        int search1 = stack.search(2);
        System.out.println(search1);


    }

    public static void main(String[] args) {
        demo01 demo01 = new demo01();
        demo01.test();
    }
}
