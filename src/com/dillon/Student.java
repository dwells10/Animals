package com.dillon;

/**
 * Created by mgreen14 on 12/26/17.
 */
public class Student extends Person implements Talkable {
    private int age;

    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}

