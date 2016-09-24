package com.google.firebase.codelab.friendlychat;

import java.util.Date;
import com.google.firebase.database.FirebaseDatabase;


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
        //upload code
        FirebaseDatabase database = FirebaseDatabase.getInstance();
    }
    public int getUpvotes(){
        return //get number from database;
    }
    public void updateUpvotes(boolean hasUpvoted){
        if (!(hasUpvoted)) {
                upvotes += 1;
                // upload new upvotes
        }
    }
    public void updateDescription(String des){
        eventDescription = des;
        // upload new description
    }
    public void updateName(String name){
        eventName = name;
    }
    public void updateStartTime(Date date){
        eventTimeStart = date;
    }
    public void updateEndTime(Date date){
        eventTimeEnd = date;
    }
    public void updateTags (String[] tags){
        eventTags = tags;
    }

}
