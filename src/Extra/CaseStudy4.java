package Extra;/*
Smart Gaming Tournament Management System
 Problem Statement

An esports company wants to create a Java application to manage:

player registration
game selection
tournament entry
score calculation
leaderboard display

The system should help organize gaming tournaments efficiently.
 */

class PlayerRegistration{
    int playerID;
    String playerName;
    int contactNumber;
    int playerAge;
    PlayerRegistration(int id,String name, int number,int age){
        playerID=id;
        playerName = name;
        playerAge = age;
        contactNumber = number;
        System.out.println("--------------------------");
        System.out.println("Player ID: "+id);
        System.out.println("Player Name: "+name);
        System.out.println("Contact Number: "+number);
        System.out.println("Player Age: "+age);
        System.out.println("--------------------------");
    }
}

class Game {
    int gameChoice;
    void selectGame() {
        switch(gameChoice) {
            case 1:
                System.out.println("BGMI Selected");
                break;
            case 2:
                System.out.println("Valorant Selected");
                break;
            case 3:
                System.out.println("Free Fire Selected");
                break;
            default:
                System.out.println("Invalid Game Choice");
        }
    }
}

class Tournament {
    int entryNumber;

    Tournament(int number) {
        entryNumber = number;
    }

    void entryStatus() {
        if(entryNumber <= 50) {
            System.out.println("Tournament Entry Confirmed");
        } else {
            System.out.println("Added To Waiting List");
        }
    }
}

class ScoreLeaderboard {

    String playerName;
    int kills;
    int totalScore;

    // Constructor
    ScoreLeaderboard(String name, int k) {

        playerName = name;
        kills = k;
    }

    void calculateScore() {

        totalScore = kills * 10;

        System.out.println("Total Score : " + totalScore);
    }

    void displayLeaderboard() {

        System.out.println("----- Leaderboard -----");

        System.out.println(playerName + " : " + totalScore);
    }
}

public class CaseStudy4 {
    public static void main(String[] args) {

        PlayerRegistration p1 = new PlayerRegistration(105, "Shabina",12345,21);

        Game g1 = new Game();
        g1.gameChoice = 1;
        g1.selectGame();

        Tournament t1 = new Tournament(25);
        t1.entryStatus();

        ScoreLeaderboard s1 = new ScoreLeaderboard("Shabina", 8);
        s1.calculateScore();
        s1.displayLeaderboard();

    }
}
