public abstract class Weekly extends Event {
    public Weekly(Date date, String name, String type) {
        super(date, name, type);
    }
    private String day;
    public void createDay(String day) {
        this.day = day;
    }


}
