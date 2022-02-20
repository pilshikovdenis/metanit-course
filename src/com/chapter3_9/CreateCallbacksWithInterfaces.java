package com.chapter3_9;

public class CreateCallbacksWithInterfaces {
    public static void main(String[] args) {
        System.out.println("test");

//        using intefaces for creating callbacks, but now using anonymous objects, not classes
        Button lampButton = new Button(new EventHandler() {
            private boolean on = false;

            public void execute() {
                if(on) {
                    System.out.println("ламба была выключена");
                    on = false;
                }
                else  {
                    System.out.println("лампа была включена");
                    on = true;
                }
            }
        });

        Button descriptionButton = new Button(new EventHandler() {
            @Override
            public void execute() {
                System.out.println("Описание выведено на экран");
            }
        });


//        emulate clicks
        lampButton.click();
        descriptionButton.click();
        lampButton.click();

    }
}
