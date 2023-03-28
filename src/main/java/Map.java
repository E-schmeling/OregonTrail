import java.util.ArrayList;
import java.lang.Math;

import static java.lang.System.out;

//I think we should probably have a map class
public class Map {
    public static void main(String[] args) {

        //series of locations for testing
        ArrayList<Location> runnerLocations = new ArrayList<>();

        //Insert location adding loop at some point when aaron is Good
        runnerLocations.add(new Location(0, "location0"));
        runnerLocations.add(new Location(1000, "Location1"));
        runnerLocations.add(new Location(2000, "location2"));
        runnerLocations.add(new Location(2500, "Special event crossing river"));//special event

        Map trail = new Map(runnerLocations);

        //jerk
        out.println(trail.toString());
        out.println("");
        out.println(trail.closestloc());
    }


    private ArrayList<Location> locations;
    private int playerdistance = 0;
    private int daynumber = 0;//to deal with weather events, possibly add days depending on what month is picked and then subtract that at the end when displaying how long of a trip you had.


    public Map(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public Location closestloc() {
        for (Location loc : locations) {
            if (loc.getMilesinfromstart() >= playerdistance) {
                return loc;
            }
        }
        return locations.get(locations.size() - 1);
    }

    public void AdvanceDay() {
        playerdistance += 20;
        daynumber++;
    }

    public void RandomEvent() {
        int randNum = (int) (Math.random() % 100);
        if (randNum >= 0 && randNum <= 1) { // lose trail(2.0%), call event class
        }
        else if (randNum >= 2 && randNum <= 3) { // thief comes during night(2.0%), call event class
        }
    }

    public void RandomSickness(String name, int health) {
        int randSickness = (int) (Math.random() % 100);
        if (health != 40) {
            if (randSickness >= 0 && randSickness <= (40 - health)) {
                // one of the random sicknesses is given to this person
                int num = (int) (Math.random() % 2);
                if (num == 0) {
                    // print out that "name" got dysentery
                }
                else if (num == 1) {
                    // print out that "name" got measles
                }
            }
        }
    }


    @Override
    public String toString() {
        return "RelearningJavaEt{" +
                "Locations=" + locations +
                ", playerdistance=" + playerdistance +
                ", daynumber=" + daynumber +
                '}';
    }


}
