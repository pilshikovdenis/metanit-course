package com.chapter3;

public class Inheritance {
    public static void main(String[] args) {
        Human someMan = new Human("Викторов Генадий Петрович");
        someMan.tellAboutHimself();

        Programmer olga = new Programmer("Arapova Olga");
        olga.tellAboutHimself();

        Designer maksim = new Designer("Petrov Maksim Alekseevich");
        maksim.tellAboutHimself();

        Monkey kick = new Monkey();
        kick.tellAboutHimself();

//        динамическая диспетчеризация методов
        Human georgy = new Designer("Morris Visconsa");
        georgy.tellAboutHimself();
    }
}

class Human {
    private String initials;

    public void setInitials(String initials) {
        this.initials = initials;
    }
    public String getInitials() {

        return initials;
    }

    Human(String initials) {
        this.initials = initials;
    }
    public void tellAboutHimself() {
        System.out.println("Я человек, могу работать");
    }
//    disable override this method in subclasses
    public final void doSomething(){
        System.out.println("Я чтото делаю");
    }


}

class Programmer extends Human{

    Programmer(String initials) {
        super(initials);
    }
    public void tellAboutHimself() {
        System.out.println("Я программист, пишу код");
    }
}

class Designer extends Human {
    Designer(String initials) {
        super(initials);
    }
    public void tellAboutHimself() {
        System.out.println("Я дизайнер, создаю пользовательские интерфейсы");
    }
}

// inheritance disabled for subclasses
final class Monkey {
    void tellAboutHimself() {
        System.out.println("I am monkey");
    }
}