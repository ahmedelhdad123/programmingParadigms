package com.proramming.paradigms.task3;

public class Task3 {
    public static void main(String[] args) {

        Multiply doubleNumber=multiply(2);
        Multiply tripleNumber=multiply(3);

        System.out.println(doubleNumber.multiply(4));
        System.out.println(tripleNumber.multiply(4));
        System.out.println(multiply(5).multiply(6));
    }
    public static Multiply multiply(int b) {
        return (int a) -> a * b;
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
