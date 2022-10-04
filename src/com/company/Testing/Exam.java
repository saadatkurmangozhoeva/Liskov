package com.company.Testing;

public class Exam extends Testing{
    public Exam(String type) {
        super(type);
    }

    @Override
    public void typeofTesting() {
        System.out.println("It is exam");
    }


}
