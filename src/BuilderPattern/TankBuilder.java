package BuilderPattern;

public interface TankBuilder {
    public void buildTankShooter();
    public void buildTankHead();
    public void buildTankBody();
    public void buildTankWheels();
    public Tank getTank();
}
