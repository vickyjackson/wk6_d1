public class Printer {

    // define variables
    private int sheets;
    private int toner = 100;

    // constructor
    public Printer(int sheets){
        this.sheets = sheets;
    }

    // print new sheets and toner values if there's enough sheets and toner
    public void print(int copies, int pages){

        int required_sheets = copies * pages;
        if ((required_sheets <= sheets) && (toner >= 1)){
            sheets = sheets - required_sheets;
            toner = toner - 1;
            System.out.println("You printed some stuff. " + required_sheets + " sheets of paper were used and " + sheets + " are left!");
            System.out.println("You used 1 toner and " + toner + " toner is left.");
        }
        else{
            System.out.println("There's either not enough paper or toner for that print job! No paper or toner was used.");
        }
    }

    public void refill(){
        sheets = 100;
        System.out.println("The paper tray was refilled! There are now " + sheets + " sheets of paper.");
    }
}
