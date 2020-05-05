import java.text.DecimalFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        count++;//counting every time a product object created
    }

    // Get and set accessors for the code, description, and price instance variables

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Product.count = count;
    }

    @Override
    public String toString() {
        return "Code:                " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n";
    }

    public String getFormattedPrice(double price) {
        DecimalFormat format= new DecimalFormat("##.##");
        return format.format(price);

        // Use the NumberFormat class to format the price to 2 decimal places
    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }
}
