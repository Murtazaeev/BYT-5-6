package mediatorPattern;

public class Atc implements IAtc{

    private Destination destination;
    private TaxiTrip taxiTrip;
    public Boolean available;

    @Override
    public void registerTrip(TaxiTrip taxiTrip) {
        this.taxiTrip = taxiTrip;
    }

    @Override
    public void registerDestination(Destination flight) {
        this.destination = destination;
    }
    @Override
    public void setAvailabiltyStatus(Boolean status) {
        this.available=status;
    }
    @Override
    public Boolean isAvailable() {
        return available;
    }
}
