package com.google.firebase.codelab.friendlychat;

import java.util.Date;

/**
 * Created by farhantoddywala on 9/24/16.
 */

public class Event {
    public String eventName;
    public String eventLocation;
    public String[] eventTags;
    public Date eventTimeStart;
    public Date eventTimeEnd;
    public String eventDescription;
    public int upvotes = 0;
    public void Event(String name, String location, String[] tags, Date timeStart, Date timeEnd, String description){
        eventName = name;
        eventLocation = location;
        eventTags = tags;
        eventTimeStart = timeStart;
        eventTimeEnd = timeEnd;
        eventDescription = description;
    }
    public int getUpvotes(){
        return upvotes
    }
    public 
}
