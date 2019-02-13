import java.util.Scanner;
public class TripPlanner {
    public static void main(String[] args) {
                     //intro
            System.out.println("Welcome to Vacation Planner");
            System.out.println("what is your name?");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Nice to meet you " + name + " Where are you travelling to?");
            String city = input.nextLine();
            System.out.println("Great! " + city + " sounds like a great trip");
            System.out.println("***************************************************************");

                //cost


            System.out.println("How many days will you spend travelling");
            Integer days = input.nextInt();
            System.out.println("How much money in USD are you planning to spend on your trip?");
            Double money = input.nextDouble();
            System.out.println("what is the three letter currency symbol of the destination you are travelling to?");
            String symbol = input.next();
            System.out.println("how many " + symbol + " vaare there in 1 USD?");
            Double value = input.nextDouble();
            System.out.println("if you are travelling for " + days + " that is same as " + (days * 24) + " hours and " + (days * 24 * 60) + " minutes ");
            System.out.println("if you are going to spend " + money + " that means per day you can spend " + (money / days) + " USD.");
            System.out.println("your total budget in " + symbol + " is " + (money * value) + " , which per day is " + ((money / days) * value) + symbol);
            System.out.println("*******************************************************************");

                        //time differnce
           // Scanner input =new Scanner(System.in);//we would not use this because we are wrinting the code in single method
            System.out.println("What is the time difference , in hours, between your home and destination ");
            int timediff = input.nextInt();
            int midnight=0+timediff;

            System.out.println("that means when it is mid night at your home then the time at your destination will be " +midnight+ ":00 in your travel destination");
            int noon = (12+timediff)%24;
            System.out.println("and when it is noon at home it will be " + noon + ":00 ");
            System.out.println("*********************************************************************");

            //area
            System.out.println("what is the area of your destination in km");
            //Scanner input =new Scanner(System.in);
            Double km=input.nextDouble();
            System.out.println("the area of your destination in miles is " +km*1.60 + "miles.");

            //haversin formula HACKERS PROBLEM
           // Scanner input = new Scanner(System.in);
            System.out.print("Enter the latitude of your home - ");
            double latHome = input.nextDouble();
            System.out.print("Enter the longitude of your home - ");
            double longHome = input.nextDouble();
            System.out.print("Enter the latitude of your destination - ");
            double latDest = input.nextDouble();
            System.out.print("Enter the longitude of your destination - ");
            double longDest = input.nextDouble();

            double distLat = Math.toRadians(latDest - latHome);
            double distLong = Math.toRadians(longDest - longHome);

            double haversine = Math.pow(Math.sin(distLat / 2), 2) + Math.cos(latHome) * Math.cos(latDest) * Math.pow(Math.sin(distLong / 2), 2);

            double rad = 6371;
            double distance = 2 * rad * Math.asin(Math.sqrt(haversine));
            double roundDist = (int)(distance*100)/100.0;

            System.out.println("Distance between your home and travel destination is " + roundDist + "km");


    }
}
