import java.util.*;

public class FindingsLists {

    // create a constructor
    public FindingsLists () throws InterruptedException {

        // stop terminal for half a second
        Thread.sleep(500);
        System.out.println("Welcome back from your expedition. Time to catalog everything you found,");

        // create an array list
        ArrayList<String> rockList = new ArrayList<>();
        System.out.println("Rock data downloaded.");

        // add to array
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list.");

        // remove from array
        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect");

        // stop terminal for half a second
        Thread.sleep(500);

        // create a hashmap (key value pairs)
        HashMap<String, String> fossilDirectory = new HashMap<>();
        System.out.println("Fossil data downloaded.");

        // add to hashmap
        fossilDirectory.put( "Bird Fossil" , "The fossil has wings implying it was capable of flight");
        fossilDirectory.put( "Fish Fossil" , "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put( "Tooth Fossil" , "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Bird Fossil, Fish Fossil, Tooth Fossil. Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if( fossilChoice.equalsIgnoreCase("Bird Fossil") ||
                fossilChoice.equalsIgnoreCase("Fish Fossil") ||
                fossilChoice.equalsIgnoreCase("Tooth Fossil")   ) {
            System.out.println("Fossil: " + fossilChoice +"\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        // stop terminal for half a second
        Thread.sleep(500);

        // create a HashSet
        HashSet<String> suppliesBought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        // add to hashset
        suppliesBought.add("Food");
        suppliesBought.add("Water");
        suppliesBought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        // print remaining
            // remove duplipcates from used set in bought set and printing remaining in bought set
        suppliesUsed.forEach( (k) -> suppliesBought.remove(k) );
        System.out.println("Remaining Supplies: " + suppliesBought );


    }
}
