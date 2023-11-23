package mediatorPattern;

public interface IAtc {
    public void registerTrip(TaxiTrip taxiTrip);
    public void registerDestination(Destination destination);
    public void setAvailabiltyStatus(Boolean status);
    public Boolean isAvailable();
}
