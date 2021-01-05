public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int drink() { return this.volume - 10; }
}
