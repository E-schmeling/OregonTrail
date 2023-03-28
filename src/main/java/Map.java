import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static java.lang.System.out;

//I think we should probably have a map class
public class Map {
    public static void main(String[] args){

        //series of locations for testing
        ArrayList<Location> runnerLocations = new ArrayList<>();

        //Insert location adding loop at some point when aaron is Good
        runnerLocations.add(new Location(0,"location0"));
        runnerLocations.add(new Location(1000,"Location1"));
        runnerLocations.add(new Location(2000,"location2"));
        runnerLocations.add(new Location(2500, "Special event crossing river"));//special event
int day=0;
        Map trail = new Map(runnerLocations, day);

        //jerk
        out.println(trail.toString());
        out.println("");
        out.println(trail.closestloc());
    }


        private ArrayList<Location> locations;
        private int playerdistance=0;
        private int daynumber;//to deal with weather events, possibly add days depending on what month is picked and then subtract that at the end when displaying how long of a trip you had.



        public Map(ArrayList<Location> locations, int day) {
            this.locations = locations;
            this.daynumber=day;
        }

        public Location closestloc() {
            for (Location loc : locations) {
                if (loc.getMilesinfromstart() >= playerdistance) {
                    return loc;
                }
            }
            return locations.get(locations.size()-1);
        }
        public void AdvanceDay() {
            playerdistance += 20;
            daynumber++;
        }
    @Override
    public String toString() {
        return "RelearningJavaEt{" +
                "Locations=" + locations +
                ", playerdistance=" + playerdistance +
                ", daynumber=" + daynumber +
                '}';
    }
    String toDate()
    {
            int numdate= this.daynumber;
            LocalDate date = LocalDate.of(1850, 3, 1).plusDays(numdate);
            String formattedDate = date.format(DateTimeFormatter.ofPattern("MMMM d")); // format as "MonthName day"
            return  formattedDate;
    }



}
