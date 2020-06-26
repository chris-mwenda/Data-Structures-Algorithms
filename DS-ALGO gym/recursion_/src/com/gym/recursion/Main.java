package com.gym.recursion;

public class Main {

    public static void main(String[] args) {
        System.out.println(recursiveFactorial(8));
        System.out.println(recursiveFactorial(5));
    }

    // n! = n * (n-1)!

    public static int recursiveFactorial (int num){
        if(num == 0){  //breaking condition OR base case.Needed for recursion to work.
            return 1;
        };
        return num * recursiveFactorial(num-1);
    };

    public static int iterativeFactorial (int num){

        if(num == 0){
            return 1;
        }

        int factorial = 1;

        for(int i = 1; i <= num; i++){
            factorial *=i;
        }

        return factorial;

    };
}
