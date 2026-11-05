package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because every shipped item still has an id, a name and a price, and can be used anywhere a Product is expected.
// A ShoppingCart would NOT pass this test: a cart is not a product, it HAS products, so it should hold a List<Product> field instead of extending Product.
public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;
    private double discountedPrice;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price); // MUST be the first statement
        this.weightKg = weightKg;
        this.dimensions = dimensions;
        this.discountedPrice = price;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String getSummary() {
        return "Physical: " + getName()
                + " | Weight: " + weightKg + " kg";
    }

    @Override
    public void applyDiscount(double rate) {
        // Shipping is never discounted, so cap the rate at 20%.
        double capped = Math.min(rate, 0.20);
        this.discountedPrice = getPrice() * (1 - capped);
    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
