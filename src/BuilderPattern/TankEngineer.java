package BuilderPattern;

public class TankEngineer {
    private TankBuilder tankBuilder;
    public TankEngineer(TankBuilder tankBuilder){
        this.tankBuilder = tankBuilder;
    }
    public Tank getTank(){
        return this.tankBuilder.getTank();
    }
    public void makeTank(){
        this.tankBuilder.buildTankShooter();
        this.tankBuilder.buildTankHead();
        this.tankBuilder.buildTankBody();
        this.tankBuilder.buildTankWheels();
    }
}
