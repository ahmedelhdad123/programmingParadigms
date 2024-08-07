package com.proramming.paradigms.task2;


import java.util.Scanner;
import java.util.function.Consumer;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //register(name, Task2::sendWelcomeMail);
        register(name,mail -> sendWelcomeMail(mail));

    }
    public static void sendWelcomeMail(String mail){
        System.out.println("Welcome :) " + mail);
    }

    public static void register(String mail, Consumer<String> callback){
        callback.accept(mail + "@gmail.com");
    }
}
/*
    JS
//Receive function as argument
function register(name, callback) {
// some logic here
callback(name + '@domain.com');
}
function sendWelcomeMail(mail) {
console.log('MAILING ' + mail);
}
//Send function as argument
register('hany', sendWelcomeMail);
 */
