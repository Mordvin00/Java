public class BottleOfVatter extends Product{
    private int volume;
    public BottleOfVatter(int cost, String name, int volume){
        super(cost, name);
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    @Override
    public String toString() {
        return "BottleOfVatter{" +
        "volume=" + volume + 
        ", cost=" + super.getCost() +
        ", name='" + super.getName() + '\'' +
        "}";
    }
    
}
