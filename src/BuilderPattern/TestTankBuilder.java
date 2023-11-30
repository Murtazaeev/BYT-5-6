package BuilderPattern;

public class TestTankBuilder {
    public static void main(String[] args) {
        TankBuilder oldStyleTank = new OldTankBuilder();
        TankEngineer tankEngineer = new TankEngineer(oldStyleTank);
        tankEngineer.makeTank();
        Tank firstTank = tankEngineer.getTank();
        System.out.println("Tank built");
        System.out.println("Tank Shooter Type: "+ firstTank.getTankShooter());
        System.out.println("Tank Head Type: "+ firstTank.getTankHead());
        System.out.println("Tank Body Type: "+ firstTank.getTankBody());
        System.out.println("Tank Wheels Type: "+ firstTank.getTankWheels());
    }
}
