public class HotDrink extends BottleOfVatter {
    private int temperature;
    public HotDrink(int cost, String name, int volume, int temperature) {
        super(cost, name, volume);
        this.temperature = temperature;
    }
    public int getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
        return "HotDrink{" +
        "temperature=" + temperature +
        ", volume=" + super.getVolume() + 
        ", cost=" + super.getCost() +
        ", name='" + super.getName() + '\'' +
        "}";
    }    
}
