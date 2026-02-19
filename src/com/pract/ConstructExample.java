package com.pract;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int id;

    Employee(String name, int id) {
        super(name);   // Must call explicitly (no default constructor in parent)
        this.id = id;
    }
}

public class ConstructExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
