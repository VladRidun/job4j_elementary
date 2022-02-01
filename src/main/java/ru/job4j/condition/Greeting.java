package ru.job4j.condition;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        String separate = " ";
        System.out.println(idea);
        String newbie = "But I am a newbie";
        idea = idea + separate + newbie;
        int year = 2022;
        idea = idea + separate + year;
        System.out.println(idea);
    }
}