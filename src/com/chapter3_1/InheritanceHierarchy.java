package com.chapter3_1;

public class InheritanceHierarchy {
    public static void main(String[] args) {
        Person nick = new Person("Nick Morrison");
        nick.display();

        Employee hizenberg = new Employee("Hizenberg", "VTB");
        hizenberg.display();

        Client samuel = new Client("Samuel", "Sberbank", 2000000);
        samuel.display();


//        upcasting example, running automatically
        Object geyb = new Person("Geyb Nuel");
        Object melissa = new Employee("Melissa", "Sberbank");
        Object sofia = new Client("Sofia", "Alfa-bank", 13000000);
        Person morris = new Employee("Morris Ander", "VTB");
        Person gleb = new Client("Gleb", "VTB", 1000000);
        gleb.display();
        System.out.println();


//        downcasting example, running by developer
        Object sam = new Employee("Sam", "Finam");

        Employee empl = (Employee) sam;
        empl.display();
        System.out.println(empl.getCompany());


        Object mark = new Client("Mark", "Alfa", 50000);
        ((Client)mark).display();

        Object semen = new Person("Semen");
        ((Person)semen).display();


//        check type, before conversion types
        Object luck = new Client("Luck", "VTB", 3000);
        if (luck instanceof Employee) {
            Employee employeeLuck = (Employee) luck;
            employeeLuck.display();
        }
        else  {
            System.out.println("conversion can not be run");
        }
    }
}
