package innerclasses.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Cheese
 * @date : 2018/4/6
 * @description : TODO
 */
public class Controller {
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        while(eventList.size() > 0){
            for(Event e : new ArrayList<Event>(eventList)){
                if(e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
