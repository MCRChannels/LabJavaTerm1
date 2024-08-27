package two;

public class InventoryCart {

    private Product[] productArr ;
    private int proIndex = 0;

    public InventoryCart(int nump){
        
        productArr = new Product[nump];
    }
    
    public void add(Product a){
        productArr[proIndex++] =  a ;
    }
    public Product geProductAt(int index){
        return productArr[index];
    }
    public Product[] getAll(){
        return productArr ;
    }

}
