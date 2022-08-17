package com.syntax.javaclass15;

public class MD2 {
    public static void main(String[] args){
        int [] arr= {10,20,30,40,50};
        ArrayUtils arrayUtils=new ArrayUtils();
        arrayUtils.PrintArray(arr);
        int sum= arrayUtils.SumArray(arr);
        System.out.println(sum);
    }
}
