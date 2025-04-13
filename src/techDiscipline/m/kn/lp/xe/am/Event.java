 
package techDiscipline.m.kn.lp.xe.am;
 
 

 

public class Event {
    
    private String eventId;
    private String eventName;

    private String eventCategory;
    private String date;
    private String duration;
    private String time ;

    public Event(String eventId, String eventName, String eventCategory, String date, String duration, String time) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventCategory = eventCategory;
        this.date = date;
        this.duration = duration;
        this.time = time;
    }

 

    
    
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

  

  
    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   
   
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        
        return  "Event Name :" + eventName +  
                "\nCategory :" + eventCategory +
                "\nDate :" + date + 
                "\nDuration :" + duration + 
                "\nTime :" + time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    
    
}
