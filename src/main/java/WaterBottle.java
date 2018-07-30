public class WaterBottle {

    // define variables
    private int volume = 100;

    // constructor
    public WaterBottle(){
        this.volume = volume;
    }

    // subtract 10 from volume
    public void drink(){
        int result = volume - 10;
        System.out.println("You drank 10 water and " + result + " water is left in the bottle!");
    }

    // set volume to 0
    public void empty(){
        volume = 0;
        System.out.println("You drank all the water and " + volume + " water is left in the bottle!");
    }

    // set volume to 100
    public void fill(){
        volume = 100;
        System.out.println("The bottle was refilled! There is now " + volume + " water in the bottle!");
    }
}
