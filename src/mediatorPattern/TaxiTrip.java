package mediatorPattern;

public class TaxiTrip implements Command {
    private IAtc atcMediator;
    TaxiTrip(IAtc atcMediator){
        this.atcMediator=atcMediator;
    }
    @Override
    public void arrivingDest() {
        if(atcMediator.isAvailable()){
            System.out.println("Arrived to the destination");
            atcMediator.setAvailabiltyStatus(false);
        }
        else {
            System.out.println("Waiting for a new Trip");
        }

    }

    public void OnTheWay(){
        System.out.println("On the way to the destination");
    }

    public void taxiArrrived(){
        System.out.println("Taxi is available");
        atcMediator.setAvailabiltyStatus(true);
    }
}
