package edu.um.aa.startickets;

import java.util.ArrayList;

/**
 * Created by fscuoteguazza on 15/09/14.
 */
public class EventManagerDecorator extends EventManager {

    protected EventManager decoratedEventManager;
    protected ArrayList<Event> cache;

    public EventManagerDecorator(EventManager manager, ArrayList<Event> cache){
        this.cache = cache;
        this.decoratedEventManager = manager;
    }

    //Decorated method.
    @Override
    public Event getEventByName(String name){
        for (Event cached: cache){
            if(cached.name.equals(name)){
                return cached;
            }
        }
        return decoratedEventManager.getEventByName(name);
    }
}
