package com.techprimers;

public class SwitchExpression {

    public String process(String day) {

        //Switch can now have a return type.
        // Yield is used for returning in switch which has {} block of statements
        return switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekdays";

            case "Saturday", "Sunday" -> "Weekends";
            default -> {
                if (day.isBlank()) {
                    yield "Please insert a day...!";
                } else {
                    yield "Please insert a valid day...!";
                }
            }
        };
    }
}
