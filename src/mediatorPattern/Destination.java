package mediatorPattern;

public class Destination implements Command {
    private IAtc atcMediator;
    Destination(IAtc atcMediator){
        this.atcMediator=atcMediator;
    }
    @Override
    public void arrivingDest() {
        System.out.println("Almost arriving to the destionation");
        atcMediator.setAvailabiltyStatus(true);

    }
}
