package calculator;

public class Numbers {
    private int num1;
    private int num2;
    private String calculationType;
    public Numbers(int newNum1, int newNum2, String calcType) {
        num1 = newNum1;
        num2 = newNum2;
        calculationType = calcType;
    }
    public int getNum1(){return num1;}
    public int getNum2(){return num2;}
    public String getCalcType(){return calculationType;}
}
