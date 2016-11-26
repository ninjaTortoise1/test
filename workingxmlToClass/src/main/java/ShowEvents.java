/**
 * Created by ananta on 11/7/2016.
 */


public class ShowEvents {

    public String showEvent(HardwareEvent event){
        System.out.println("-----In showEvent -----");
        System.out.println("Event's name "+event.getEventId());
        System.out.println("Event's dept "+event.getEventName());
        System.out.println("Event's salary "+event.getEventValue());
        return event.toString();
    }
}