package com.proramming.paradigms.task3;

import java.util.function.Function;

public class Task3 {
    public static void main(String[] args) {
        Function<Integer,Integer>  multiply=multiplyBy(3);
        System.out.println(multiply);
        int result = multiply.apply(3);
        System.out.println(result);
    }
    public static Function <Integer,Integer> multiplyBy(int x) {
        return (y) -> x * y;
    }
}
/*
      JS
function multiplyBy(x) {
//Return function
return function(y) {
return x * y;
};
}

doubleNumber = multiplyBy(2);
tripleNumber = multiplyBy(3);
console.log(doubleNumber(4));
console.log(tripleNumber(4));
console.log(multiplyBy(5)(6
 */
