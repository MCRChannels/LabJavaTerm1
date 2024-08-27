package two;
public class Milk extends Product{
    
    public Milk(double price) {
        super(price);  
    }
    public String toString() {
        
        return this.getClass().getSimpleName()+"   "+this.getVolumn()+"\tcc";
    }
}
