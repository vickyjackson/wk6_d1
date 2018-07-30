public class Calculator {

    // define variables
    private int num1;
    private int num2;

    // constructor
    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // add arg 1 + arg 2
    public void add(){
        int result = num1 + num2;
        System.out.println("The answer to " + num1 + " + " + num2 + " is " + result + ".");
    }

    // subtract arg 1 from arg 2
    public void subtract(){
        int result = num1 - num2;
        System.out.println("The answer to " + num1 + " - " + num2 + " is " + result + ".");
    }

    // multiply arg 1 with arg 2
    public void multiply(){
        int result = num1 * num2;
        System.out.println("The answer to " + num1 + " * " + num2 + " is " + result + ".");
    }

    // divide arg 1 by arg 2
    public void divide(){
        int result = num1 / num2;
        System.out.println("The answer to " + num1 + " / " + num2 + " is " + result + ".");
    }
}
