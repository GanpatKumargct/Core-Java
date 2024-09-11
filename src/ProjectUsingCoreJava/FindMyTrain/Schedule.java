package ProjectUsingCoreJava.FindMyTrain;

public class Schedule {
    private Train train;
    private Station station;
    private String arrivalTime;
    private String departureTime;
    private Platfrom platfrom;

    public Schedule(Train train, Station station, String arrivalTime, String departureTime, Platfrom platfrom) {
        this.train = train;
        this.station = station;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.platfrom = platfrom;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Platfrom getPlatfrom() {
        return platfrom;
    }

    public void setPlatfrom(Platfrom platfrom) {
        this.platfrom = platfrom;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schedule{");
        sb.append("train=").append(train);
        sb.append(", station=").append(station);
        sb.append(", arrivalTime='").append(arrivalTime).append('\'');
        sb.append(", departureTime='").append(departureTime).append('\'');
        sb.append(", platfrom=").append(platfrom);
        sb.append('}');
        return sb.toString();
    }
}
