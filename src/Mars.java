public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Blue Lagoon";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        // landing takes two days
            // calc. how much food is left after landing
            // day 1 and day 2:
        shipFood -= (shipPopulation * 0.75);
        shipFood -= (shipPopulation * 0.75);
        System.out.println("Remaining food after 2 days: " + shipFood);

        // An extra crate of food is found increasing ShipFood by 50%
        shipFood = ( shipFood * 1.5);

        // The births very timed perfectly and 5 more babies join the ShipPopulation
        shipPopulation += 5;
        System.out.println("Total population: " + shipPopulation);

        String landingLocation = "The Hill";

        if( landingLocation.equalsIgnoreCase("The Plain") ) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        // run landingcheck function and return boolean
        landing = LandingCheck(100);

        // call the guessgame and marsexped. constructor
        new GuessingGame();
        new MarsExpedition();


        // print landing variable
        System.out.println("Ship landing status: " + landing);

        // call findinglist constructor
        new FindingsLists();
    }

    private static boolean LandingCheck(int loops) throws InterruptedException {
        for( int i=0; i <= loops; i++) {

            if (i%5 ==0 && i%3 ==0) {
                System.out.println("KEEP CENTER");
            } else if(i%5 ==0 ) {
                System.out.println("RIGHT");
            } else if(i%3 ==0 ) {
                System.out.println("LEFT");
            } else {
                System.out.println("Calculating");
            }
        }

        //Thread.sleep(250) slows the console down by 250 milliseconds
        Thread.sleep(250);

        // print landed
        System.out.println("Landed");

        // Ship landed; return false
        return false;
    }
}
