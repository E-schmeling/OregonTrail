public class Event {

    public enum EventType{RIVERCROSSING,ENDOFPROTYPE,  XYZ}
    public EventType eventType;

    public Event(EventType eventtype ) {
        this.eventType= eventtype;
    }

    //Probably, pass an event to this class to see which type of event it is and do the event handling here. if location has event, pass location to "eventHandler"
    // check what event and/or location() are here.

    //Started on this but wanted to check with aaron to see if he agrees event is the best location to deal with this stuff
    public boolean eventHandler(Location eventLocation){
       // if (eventLocation.)
        return true;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventType=" + eventType +
                '}';
    }
    public boolean riverEvent(Location eventLocation){



        return true;
    }
}
