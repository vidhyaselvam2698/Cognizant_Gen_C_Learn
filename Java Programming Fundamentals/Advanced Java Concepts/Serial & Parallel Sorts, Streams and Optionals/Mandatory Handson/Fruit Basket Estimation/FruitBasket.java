public class FruitBasket {
    private String fruitName;
    private int weightInKgs;
    private int pricePerKg;

    public FruitBasket() {
    }

    public FruitBasket(String fruitName, int weightInKgs, int pricePerKg) {
        this.fruitName = fruitName;
        this.weightInKgs = weightInKgs;
        this.pricePerKg = pricePerKg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getWeightInKgs() {
        return weightInKgs;
    }

    public void setWeightInKgs(int weightInKgs) {
        this.weightInKgs = weightInKgs;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }
}
