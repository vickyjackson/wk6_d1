public class Runner {

    // main method - entry point into app
    public static void main(String[] args){

        // create new calculator object with values
        Calculator calculator = new Calculator(1, 2);

        // create new water bottle object with values
        WaterBottle waterbottle = new WaterBottle();

        // create new printer object with values
        Printer printer = new Printer(100);

        // call the Calculator methods on calculator object
        calculator.add();
        calculator.subtract();
        calculator.multiply();
        calculator.divide();

        // call the WaterBottle methods on waterbottle object
        waterbottle.drink();
        waterbottle.empty();
        waterbottle.fill();

        // call the Printer methods on printer object
        printer.print(10, 4);
        printer.refill();

    }
}
