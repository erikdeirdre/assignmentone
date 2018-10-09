package first;

public class Basket {
    private MarketProduct products[];

    public Basket() {
        this.products = new MarketProduct[0];

    }

    public MarketProduct[] getProducts() {
        return this.products.clone();

    }

    public void add(MarketProduct product) {
        MarketProduct newArray[] = new MarketProduct[this.products.length + 1];
        for (int i = 0; i < this.products.length; i++) {
            newArray[i] = this.products[i];
        }
        newArray[this.products.length] = product;
        this.products = newArray;
    }

    public boolean remove(MarketProduct product) {
        if (this.products.length == 0) {
            return false;
        }

        MarketProduct[] newArray = new MarketProduct[this.products.length - 1];
        int newarray_cnt = 0;
        for(int i = 0; i< this.products.length; i++) {
            if (this.products[i].getName() != product.getName())  {
                newArray[newarray_cnt] = this.products[i];
                newarray_cnt++;
            }
        }
        this.products = newArray;
        return true;
    }

    public void clear() {
        this.products = new MarketProduct[0];
    }

    public int getNumOfProducts() {
        return this.products.length;
    }

    public int getSubTotal() {
        int subTotal = 0;
        for (int i = 0; i< this.products.length; i++) {
            subTotal+= this.products[i].getCost();
        }
        return subTotal;
    }

    public int getTotalTax() {
        int tax = 0;
        for (int i = 0; i < this.products.length; i++) {
            tax += this.products[i].getCost() * this.products[i].getTaxRate();
        }
        return tax/100;
    }

    public int getTotalCost() {
        return this.getSubTotal() + this.getTotalTax();
    }

    public String toString() {
        String output = "\n";
        for (int i = 0; i< this.products.length; i++) {
            output += String.format("%-25s %10.2f\n", this.products[i].getName(), (float) this.products[i].getCost()/100);
        }

        output+= String.format("\n%-25s %10.2f\n", "Subtotal", (float)this.getSubTotal()/100);

        output+= String.format("%-25s %10.2f\n\n", "Total Tax", (float)this.getTotalTax()/100);

        output+= String.format("%-25s %10.2f\n", "Total Cost", (float) this.getTotalCost()/100);

        return output;
    }

}
