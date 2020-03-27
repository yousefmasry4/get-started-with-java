package aast.sheet4x6;

import java.util.*;

public class GroceryList {

    List<GroceryItemOrder> _data= new LinkedList<>();


    public void add(GroceryItemOrder item){
        if(_data.size() == 10) {
            System.out.println("The maximum number of elements has been  :(");
        }
        else
            _data.add(item);
    }


    public double getTotalCost(){
        //TODO:returns the total sum cost of all grocery item orders in this list.
        double cost=0;
        for(GroceryItemOrder i :_data)
            cost += i.getCost();
        return cost;
    }


    @Override
    public String toString() {
        StringBuilder s= new StringBuilder("\t\t----\t----\t\t\n");
        System.out.print("                        _name\t                _price_per_unit\t        _quantity\n");
        for(int i=0;i<_data.size();i++){
            s.append(String.format("[ %02d ]" + _data.get(i) + "\n", i));
        }
        return s.toString();
    }

}
