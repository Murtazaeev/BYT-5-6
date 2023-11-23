package calculator;

public class Multiply implements Chain{
    private Chain nextInChain;
    @Override
    public void setNextChain(Chain nextChain) {}
    @Override
    public void calculate(Numbers request) {
        if (request.getCalcType() == "multiply") {
            System.out.println(request.getNum1()+" * "+ request.getNum2()+" = "+(request.getNum1()*request.getNum2()));
        } else{
            nextInChain.calculate(request);
        }
    }
}
