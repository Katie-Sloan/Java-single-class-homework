public class Calculator {
    private int total;

    public Calculator(int total){
        this.total = total;
    }

    public int add(int a, int b) { return this.total + a + b; }

    public int subtract(int a, int b) { return this.total + a - b; }

    public int multiply(int a, int b) { return this.total + a * b; }
}


