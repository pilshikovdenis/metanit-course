package com.chapter3_10;

public class Task {
    private String name;
    private Priority priority;
    private String creator;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
    public Priority getPriority() {
        return priority;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public String getCreator() {
        return creator;
    }

    Task(String name, String creator, Priority priority) {
        setName(name);
        setPriority(priority);
        setCreator(creator);
    }

    public void showDescription() {
        System.out.println("Name: " + name);
        System.out.println("Priority: " + priority.getTextValue());
        System.out.println("Created by: " + creator);


    }
}
