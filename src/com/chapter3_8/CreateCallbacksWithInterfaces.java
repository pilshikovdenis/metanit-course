package com.chapter3_8;

public class CreateCallbacksWithInterfaces {
    public static void main(String[] args) {
//        using interfaces for creating callbacks
        Button alertButton = new Button(new AlertButtonEventHandler());
        Button cancelButton = new Button(new CancelButtonEventHandler());

//        emulate click
        alertButton.click();
        cancelButton.click();
    }
}


//        handlers for our buttons looks like classes
class AlertButtonEventHandler implements EventHandler{
    @Override
    public void execute() {
        System.out.println("This is some message by alert button");
    }
}

class CancelButtonEventHandler implements EventHandler {
    @Override
    public void execute() {
        System.out.println("Task canceled");
    }
}