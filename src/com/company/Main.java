package com.company;

import com.company.Testing.Exam;
import com.company.Testing.FinalExam;
import com.company.Testing.Test;
import com.company.Testing.Testing;

public class Main {

    public static void main(String[] args) {

        Testing t1= new Test("Test");
        System.out.println(t1.getType());
        t1.typeofTesting();
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        Testing c= new Exam("Exam");
        System.out.println(c.getType());
        c.typeofTesting();
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        Testing d= new FinalExam("Final Exam");
        System.out.println(d.getType());
        d.typeofTesting();

    }
}
