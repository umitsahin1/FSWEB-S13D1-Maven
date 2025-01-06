package org.example;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        } else if (isBarking &&  (clock < 8 || clock >= 20 ) ) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        if( firstAge > 12 && firstAge < 20 || secondAge > 12 && secondAge < 20 || thirdAge > 12 && thirdAge < 20 ) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
     if (isSummer && temp >= 25 && temp <= 45) {
         return true;
     }
      else if(!isSummer && temp >= 25 && temp <= 35){
         return true;
     }
     else {
        return false;
     }
    }

    public static double area(double width, double height) {
        if(width < 0 || height < 0) {
            System.out.println("Hatalı bir işlem yaptınız!");
            return -1;

        } else {
            return width * height;
        }
       
    }

    public static double area(double radius) {
        if(radius < 0) {
            System.out.println("Hatalı bir işlem yaptınız!");
            return -1;

        } else {
            return radius*radius*Math.PI;
        }
    }
}
