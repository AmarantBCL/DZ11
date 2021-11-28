package com.vpetelsky;

import java.util.Random;

/* 1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя и фамилия.
Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на
несколько имен и выбирать из него случайным образом).

Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд.
*/
public class Person {

    private static final Random RANDOM = new Random();
    private static final int MAX_AGE = 100;
    private static final int BASE_HEIGHT = 50;
    private static final int BASE_WEIGHT = 3;
    private static final int MIN_ADULT_HEIGHT = 150;
    private static final int MAX_ADULT_HEIGHT = 200;
    private static final int MIN_ADULT_WEIGHT = 50;
    private static final int MAX_ADULT_WEIGHT = 120;
    private static final int MIN_HEIGHT_COEFF = 6;
    private static final int MAX_HEIGHT_COEFF = 9;
    private static final int MIN_WEIGHT_COEFF = 3;
    private static final int MAX_WEIGHT_COEFF = 6;

    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int height;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setAge() {
        age = RANDOM.nextInt(MAX_AGE) + 1;
    }

    public int getAge() {
        return age;
    }

    private void setWeight() {
        double coeff = 0.0;
        if (age < 18) {
            coeff = MIN_WEIGHT_COEFF + (MAX_WEIGHT_COEFF - MIN_WEIGHT_COEFF) * RANDOM.nextDouble();
        } else {
            weight = RANDOM.nextInt(MAX_ADULT_WEIGHT - MIN_ADULT_WEIGHT + 1) + MIN_ADULT_WEIGHT;
            return;
        }

        weight = BASE_WEIGHT + (int)Math.round(age * coeff);
    }

    public int getWeight() {
        return weight;
    }

    private void setHeight() {
        double coeff = 0.0;
        if (age < 20) {
            coeff = MIN_HEIGHT_COEFF + (MAX_HEIGHT_COEFF - MIN_HEIGHT_COEFF) * RANDOM.nextDouble();
        } else {
            height = RANDOM.nextInt(MAX_ADULT_HEIGHT - MIN_ADULT_HEIGHT + 1) + MIN_ADULT_HEIGHT;
            return;
        }

        height = BASE_HEIGHT + (int)Math.round(age * coeff);
    }

    public int getHeight() {
        return height;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge();
        setWeight();
        setHeight();
    }
}
