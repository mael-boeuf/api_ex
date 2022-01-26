package aia.api_ex.model;

public class Vol {

    private String id;
    private String departure;
    private String arrival;
    private int departureTime;

    public Vol() {

    }

    public Vol(String _id, String _departure, String _arrival, int _departureTime) {
        this.id = _id;
        this.departure = _departure;
        this.arrival = _arrival;
        this.departureTime = _departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }
}
