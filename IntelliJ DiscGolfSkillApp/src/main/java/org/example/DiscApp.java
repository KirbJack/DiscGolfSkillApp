package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiscApp
{
    public static void main(String[] args) {
        System.out.println("Hello! Please enter your skill level:");
        System.out.println("0. Beginner/Just Started Playing/Never Played");
        System.out.println("1. Recreational/MA3)");
        System.out.println("2. Intermediate/MA2");
        System.out.println("3. Advanced/MPO/MA1");

        Scanner input = new Scanner(System.in);
        int skillLevel = input.nextInt();

        List<String> beginnerCourses = new ArrayList<>();
        beginnerCourses.add("Belleve State Park");
        beginnerCourses.add("White Clay Creek State Park");

        List<String> recreationalAndMa3Courses = new ArrayList<>();
        recreationalAndMa3Courses.add("Bellevue State Park");
        recreationalAndMa3Courses.add("White Clay Creek State Park");
        recreationalAndMa3Courses.add("Brandywine Creek State Park(Main)");

        List<String> intermediateAndMA2Courses = new ArrayList<>();
        intermediateAndMA2Courses.add("Brantwood Park");
        intermediateAndMA2Courses.add("Canby West(Shorts)");
        intermediateAndMA2Courses.add("Bellevue State Park(Longs)");

        List<String> advancedAndMpoMa1Courses = new ArrayList<>();
        advancedAndMpoMa1Courses.add("Iron Hill Park");
        advancedAndMpoMa1Courses.add("Lums Pond State Park");
        advancedAndMpoMa1Courses.add("Green Ridge");


        switch (skillLevel) {
            case 0:
                System.out.println("Suggested courses based on your skill level: " + beginnerCourses);
                break;

            case 1:
                System.out.println("Suggested courses based on your skill level " + recreationalAndMa3Courses);
                break;

            case 2:
                System.out.println("Suggested courses based on your skill level: " + intermediateAndMA2Courses);
                break;
            case 3:
                System.out.println("Suggested courses based on your skill level: " + advancedAndMpoMa1Courses);
                break;
            default:
                System.out.println("Invalid entry. Try again");

        }



    }
}