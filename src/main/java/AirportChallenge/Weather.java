package AirportChallenge;

import java.util.Random;

public class Weather {

    public static boolean isStormy(int number) {
        return number > 90;
    }

    public static boolean isStormy() {
        return check() > 90;
    }

    public static int check() {
        Random rand = new Random();
        int randomNumber = rand.nextInt((100 - 1) + 1) + 1;
        return randomNumber;
    }

}
