import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class findingList {
    public findingList() throws InterruptedException {

        Thread.sleep(1000);

        System.out.println("Welcome back from your expedition!");

        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("Rock data downloaded.");

        System.out.println(rockList);

        System.out.println("Wait, there's one that isn't a rock and needs to be deleted.");

        rockList.remove("not rock");

        System.out.println(rockList);

        System.out.println("perfect");

        Thread.sleep(1000);

        HashMap<String, String> fossilDirectory = new HashMap<>();

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Marauders Map");
        supplies.add("Invisibility Cloak");
        supplies.add("Time Turner");

        supplies.remove("Time Turner");

        Iterator itr = supplies.iterator(); // Iterator prints each one

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }



    }



}
