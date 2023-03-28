public class Event {

    public enum EventType{RIVERCROSSING,ENDOFPROTYPE,  XYZ}
    public EventType eventType;

    public Event(EventType eventtype ) {
        this.eventType= eventtype;
    }
}
