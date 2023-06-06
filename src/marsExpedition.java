import java.util.Scanner;

public class marsExpedition {
    public marsExpedition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Expedition to mars booting up...");
        System.out.println("...");
        System.out.println("What is your name?");

        // capture name from player
        String name = input.nextLine();

        System.out.println("Hi, " + name + " --Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");

        String yesOrNo = input.nextLine();

        if(yesOrNo.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are a team leader for a reason.");
        } else {
            System.out.println("Too bad you are a team leader. You have to go.");
        }

        System.out.println("How many people do you want to go?");

        int teamNumber = input.nextInt();
        input.nextLine();

        if(teamNumber > 2) {
            System.out.println("That's way too many people. We can only send 2 more members");
        } else if(teamNumber < 2) {
            System.out.println("You need at least 2 members");
        } else if (teamNumber == 2) {
            System.out.println("Perfect! Good to go!");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");

        String snack = input.nextLine();

        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        System.out.println("You have the choice of 3 vehicles" + "\nA: A Mars Rover" + "\nB: A Chevy Silverado" + "\nC: A Honda Civic");

        String chosenVehicle = input.nextLine();

        if(chosenVehicle.equalsIgnoreCase("A")) {
            chosenVehicle = "a Mars Rover";
        } else if (chosenVehicle.equalsIgnoreCase("B")){
            chosenVehicle = "a Chevy Silverado";
        } else if (chosenVehicle.equalsIgnoreCase("C")) {
            chosenVehicle = "a Honda Civic";
        } else {
            System.out.println("The options were A, B, or C. Now you get nothing");
            chosenVehicle = "nothing";
        }

        System.out.println("Okay, great! You're ready for your expedition! " + name + " You have chosen to bring " + teamNumber + "team members." + "/nThe vehicle chosen to explore is " + chosenVehicle + "." + "n/The snack you will be bringing is " + snack + ".");

    }
//    public static void main(String[] args) {
//        marsExpedition game = new marsExpedition();
//    }

}
