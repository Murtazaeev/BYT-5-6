package BuilderPattern;

public class Tank implements TankPlan {
    private String tankShooter;
    private String tankHead;
    private String tankBody;
    private String tankWheels;
    @Override
    public void setTankShooter(String shooter) {
        tankShooter = shooter;
    }
    public String getTankShooter() {
        return tankShooter;
    }
    public String getTankHead() {
        return tankHead;
    }
    public String getTankBody() {
        return tankBody;
    }
    public String getTankWheels() {
        return tankWheels;
    }
    @Override
    public void setTankHead(String head) {
        tankHead = head;
    }
    @Override
    public void setTankBody(String body) {
        tankBody = body;
    }
    @Override
    public void setTankWheels(String wheels) {
        tankWheels = wheels;
    }
}
