package exercises;


public class Carrinho {
    private int id;
    private int count;
    private String describe;
    private  double price;


    /**
     * @param id
     * @param count
     * @param describe
     * @param price
     */
    public Carrinho(int id, int count, String describe, double price) {
        this.id = id;
        this.count = count;
        this.describe = describe;
        this.price = price;
    }

    Carrinho(){} //default


    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public String getDescribe() {
        return describe;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() + "\nCOUNT: " + getCount() + "\nDESCRIBE: " + getDescribe()
                + "\nPRICE: " + getPrice() ;
    }
}
