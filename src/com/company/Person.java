package com.company;

/* 1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на
несколько имен и выбирать из него случайным образом).

Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд.
*/
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private float weight;
    private int height;

    public String getFirstName() {
        return firstName;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(firstName + " " + lastName + " CREATED");
    }
}
