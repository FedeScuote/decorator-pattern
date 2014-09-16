package edu.um.aa.startickets;

import java.util.ArrayList;

/**
 * Created by fscuoteguazza on 15/09/14.
 */
public class StarticketsStub {

    public EventManagerDecorator decorator;

    public StarticketsStub(){
        Event event = new Event("Solei","Circus");
        Event event2 = new Event("Fashion tendencies","Talk");
        Event event3 = new Event("Back to the future","Movie");

        ArrayList<Event> arrayList = new ArrayList<Event>();

        arrayList.add(event);
        arrayList.add(event2);
        arrayList.add(event3);

        EventManager manager = new EventManager();

        decorator = new EventManagerDecorator(manager, arrayList);
    }

}
