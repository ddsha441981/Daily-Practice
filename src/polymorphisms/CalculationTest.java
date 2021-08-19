package polymorphisms;

public class CalculationTest extends Calculation{
    public static void main(String[] args) {
        CalculationTest calculationTest = new CalculationTest();
        calculationTest.calculate(20);
        calculationTest.calculate(20,10);
        calculationTest.calculate("Deendayal",58800);
        calculationTest.calculate(25, 10,30);
        calculationTest.calculate(22,63.0);
    }
}
