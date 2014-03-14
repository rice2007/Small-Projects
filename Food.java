
public class Food {

    protected double price;
    protected double quantity;
    protected double volume;
    protected double weight;
    protected String foodType;
    protected String volUnit;
    protected String weightUnit;

    public Food(double thePrice, double theQuantity, String theFoodType, String theUnit) {
        price = thePrice;
        quantity = theQuantity;
        foodType = theFoodType;
        if (theUnit.equals("oz") || theUnit.equals("gram")) {
            weightUnit = theUnit;
        } else {
            volUnit = theUnit;
        }
    }

    public static class VolumeFood extends Food {

        public VolumeFood(double thePrice, double theQuantity, String theFoodType, String theUnit, double theVolume) {
            super(thePrice, theQuantity, theFoodType, theUnit);
            volume = theVolume;
        }
    }

    public static class WeightFood extends Food {

        public WeightFood(double thePrice, double theQuantity, String theFoodType, String theUnit, double theWeight) {
            super(thePrice, theQuantity, theFoodType, theUnit);
            weight = theWeight;
        }
    }

    public static class HybridFood extends Food {

        private double weightUnit;

        public HybridFood(double thePrice, double theQuantity, String theFoodType,
                          String theVolUnit, String theWeightUnit, double theVolume, double theWeight) {
            super(thePrice, theQuantity, theFoodType, theWeightUnit);
            volume = theVolume;
            weight = theWeight;
            volUnit = theVolUnit;
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getVolUnit() {
        return volUnit;
    }

    public void setVolUnit(String volUnit) {
        this.volUnit = volUnit;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
}
