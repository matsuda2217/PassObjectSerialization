package com.example.tt.passobjectserialization;

import java.io.Serializable;

/**
 * Created by TT
 */
public class Person implements Serializable {
    String name ;
    int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Name: "+ name+", Age:" + age;
    }
}
