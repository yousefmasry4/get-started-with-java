package AAST.sheet4x6;

public class GroceryItemOrder {

    final String _name ;
    final double _price_per_unit;

    int _quantity=1;


    public GroceryItemOrder(String name, double price_per_unit) {
        _name = name;

        _price_per_unit = price_per_unit;
    }


    public void setQuantity(int quantity){
        _quantity=quantity;
    }


    public double getCost(){
        return _price_per_unit*_quantity;
    }

    @Override
    public String toString() {
        return  String.format("      '%15s'\t                %5f\t          %9d" ,_name,_price_per_unit, _quantity);
    }
}
