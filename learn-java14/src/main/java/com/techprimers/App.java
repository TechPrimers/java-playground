package com.techprimers;

public class App {
    public static void main(String[] args) {

        SwitchExpression switchExpression = new SwitchExpression();
        System.out.println(switchExpression.process("Sunday"));
        System.out.println(switchExpression.process("Friday"));
        System.out.println(switchExpression.process(" "));
        System.out.println(switchExpression.process("Test"));

        //Did not work with adoptopenjdk dated 3rd April 2020.
        //switchExpression.process(null);

        User user = new User(30, "Ajay");

        System.out.println("User age: " + user.age());

        //IntellIJ 1019 doesnt work well with preview features of Java14.
        // Upgrading to Release Candidate 2020.1
        //Configured --enable-preview as vmargs and compiler args, however IDE fails to identify record

        //Update: Using 2020.1 RC worked.
        System.out.println("User name: " + user.name());

    }
}
