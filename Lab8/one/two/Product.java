package two;
public class Product {
    private int Volumn;
    private int Weight;
    private double price ;

   
    public  Product(double price) {
        
        this.price = price;
    }
    public double getPrice(){
        return price ;
    }
    public void setWeight(int Weight) {
        this.Weight= Weight;
    }
    public void setVolumn(int volumn) {
        this.Volumn = volumn;
    }
    public int getVolumn() {
        return Volumn;
    }
    public int getWeight() {
        return Weight;
    }
}