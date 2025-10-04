package com.hillel.homework.homeworklesson8;

import java.util.Arrays;

public class HomeTask1 {

    public static void main(String[] args) {

        int[] team1 = getAge(11);
        int[] team2 = getAge(11);
        int averageAgeTeam1 = calculateAverageAge(team1);
        int averageAgeTeam2 = calculateAverageAge(team2);
        printTeamsAge(team1);
        printTeamsAge(team2);
        printMessage(averageAgeTeam1, averageAgeTeam2);
    }

    public static int[] getAge(int size) {
        int[] team = new int[size];
        for (int i = 0; i < team.length; i++) {
            team[i] = (int) (Math.random() * (45 - 18 + 1) + 18);
        }
        return team;
    }

    public static void printTeamsAge(int[] team) {

        System.out.println("Team : " + Arrays.toString(team));
    }

    public static int calculateAverageAge(int[] team) {

        int sum1 = 0;

        for (int i = 0; i < team.length; i++) {
            sum1 = sum1 + team[i];
        }
        int averageAgeTeam = sum1 / team.length;
        return averageAgeTeam;
    }

    public static void printMessage(int averageAgeTeam1, int averageAgeTeam2) {

        System.out.println("Average age of team 1 is: " + averageAgeTeam1);
        System.out.println("Average age of team 2 is: " + averageAgeTeam2);

        if (averageAgeTeam1 > averageAgeTeam2) {
            System.out.println("Average age of team 1 is bigger than average age of team 2");
        } else if (averageAgeTeam2 > averageAgeTeam1) {
            System.out.println("Average age of team 2 is bigger than average age of team 1");
        } else
            System.out.println("Average age of teams is the same");
    }
}
