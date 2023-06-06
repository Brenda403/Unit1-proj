public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world!");
    String colonyName = "Jamestown";
    int shipPopulation = 300;
    double meals = 400.00;
    boolean landing = landingCheck(7);

    meals = meals - (shipPopulation * 0.75);
    meals = meals - (shipPopulation * 0.75);
    System.out.println(meals);
    meals = meals + (meals * .5);
    shipPopulation += 5;

    String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
        System.out.println("Bbzzz landing on The Plain");
    } else {
        System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
    }
        new guessingGame();
        new marsExpedition();
        new findingList();

}



    public static boolean landingCheck(int minutesLeft){
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if (((minute % 3) == 0) && ((minute % 2) == 0)) {
                System.out.println("Keep Center");
            } else if ((minute % 2) == 0) {
                System.out.println("Right");
            } else if ((minute % 3) == 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Landed");
        return false;
    }
}

