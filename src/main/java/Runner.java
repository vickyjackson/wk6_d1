public class Runner {

    // main method - entry point into app
    public static void main(String[] args){

        // create new calculator object with values
        Calculator calculator = new Calculator(1, 2);

        // create new water bottle object with values
        WaterBottle waterbottle = new WaterBottle();

        // create new printer object with values
        Printer printer = new Printer(100);

        // print out the result of calling the Calculator methods on calculator object
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();

        // print out the result of calling the WaterBottle methods on waterbottle object
        waterbottle.drink();
        waterbottle.empty();
        waterbottle.fill();

        // print out the result of calling the Printer methods on printer object
        printer.print(10, 4);
        printer.refill();

    }
}
