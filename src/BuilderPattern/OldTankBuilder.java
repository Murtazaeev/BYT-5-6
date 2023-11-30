package BuilderPattern;

public class OldTankBuilder implements TankBuilder {
    private Tank tank;
    public OldTankBuilder(){
        this.tank =new Tank();
    }
    @Override
    public void buildTankShooter() {
        tank.setTankShooter("Tin Head");
    }
    @Override
    public void buildTankHead() {
        tank.setTankHead("Leopard gunner");
    }
    @Override
    public void buildTankBody() {
        tank.setTankBody("German 2A7");
    }
    @Override
    public void buildTankWheels() {
        tank.setTankWheels("Continuous track");
    }
    public Tank getTank(){
        return this.tank;
    }

}
