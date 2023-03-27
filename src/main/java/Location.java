import static java.lang.System.out;

public class Location {
//For testing to make sure I do thinks right
    public static void main(String[] args){
        out.println("Hello World!");
        Location loc1= new Location(1000,"Location7");

        out.println(loc1.distanceto(100));
    }

    private int milesinfromstart;
    private String locationname;
    private Event event;
    private Store store;

    //
    public Location(int milesinfromstart, String locationname, Store store, double storemultiplier, Event event){
        this.milesinfromstart = milesinfromstart;
        this.locationname = locationname;
        this.event = event;
        this.store=store;
        this.store.setMultiplier(storemultiplier);
    }
    public Location (int milesinfromstart, String locationname, Event event) {
        this.milesinfromstart = milesinfromstart;
        this.locationname = locationname;
        this.event = event;
    }

    public Location (int milesinfromstart, String locationname, Store store, double storemultiplier) {
        this.milesinfromstart = milesinfromstart;
        this.locationname = locationname;
        this.store = store;
        this.store.setMultiplier(storemultiplier);
    }

    public Location (int milesinfromstart, String locationname) {
        this.milesinfromstart = milesinfromstart;
        this.locationname = locationname;
    }


    //getters and setters
    public int getMilesinfromstart() {
        return milesinfromstart;
    }

    public void setMilesinfromstart(int milesinfromstart) {
        this.milesinfromstart = milesinfromstart;
    }

    public String getLocationname() {
        return locationname;
    }

    public void setLocationname(String locationname) {
        this.locationname = locationname;
    }

    public int distanceto(int currentmilage){
        return (this.milesinfromstart-currentmilage);
    }


    @Override
    public String toString() {
        return "Location{" +
                "milesinfromstart=" + milesinfromstart +
                ", locationname='" + locationname + '\'' +
                ", storeindicator=" + store +
                '}';
    }


}
