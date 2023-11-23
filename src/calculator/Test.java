package calculator;

public class Test {

    public static void main(String[] args) {
        Chain chainCalc1 = new Add();
        Chain chainCalc2 = new Subtract();
        Chain chainCalc3 = new Multiply();
        Chain chainCalc4 = new Divide();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers reqSub = new Numbers(18, 3, "sub");
        Numbers reqAdd = new Numbers(18, 3, "add");
        Numbers reqMul = new Numbers(18, 3, "multiply");
        Numbers reqDiv = new Numbers(18, 3, "divide");


        chainCalc1.calculate(reqAdd);
        chainCalc2.calculate(reqSub);
        chainCalc3.calculate(reqMul);
        chainCalc4.calculate(reqDiv);


    }
}
