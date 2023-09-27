public abstract class Event {



    private String name;
    private Date date;
    private String type;
    public Event(Date date, String name, String type) {
        this.date = date;
        this.name = name;
        this.type = type;
    }

}

