package mediatorPattern;

public class DesignPattern {
    public static void main(String[] args) {

        IAtc atcMediator = new Atc();
        Destination destination =new Destination(atcMediator);

        TaxiTrip taxiTrip =new TaxiTrip((atcMediator));
        TaxiTrip taxiTrip11 =new TaxiTrip((atcMediator));

        atcMediator.registerTrip(taxiTrip11);
        atcMediator.registerDestination(destination);

        taxiTrip11.OnTheWay();
        destination.arrivingDest();
        taxiTrip11.arrivingDest();
        taxiTrip11.taxiArrrived();

    }
}
