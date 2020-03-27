Write a class named GroceryList that represents a person’s list of items to buy from the market,
and another class named GroceryItemOrder that represents a request to purchase a particular
item in a given quantity (example: four boxes of cookies).


The GroceryList class has a list of grocery item orders and keeps track of its size (number of items in
the list so far). Assume that a grocery list will have no more than 10 items. A GroceryList object should
have the following methods and constructor:.
public GroceryList()


constructs a new empty grocery list.
public void add(GroceryltemOrder item)

adds the given item order to this list, if the list is not full (i.e., has fewer than 10 items).
public double getTotalCost()



returns the total sum cost of all grocery item orders in this list.
The GroceryltemOrder class should store an item name, quantity and a price per unit. A
GroceryltemOrder object should have the following :
public GroceryltemOrder (String name, double pricePerUnit)


constructs an item order to purchase the item with the given name, in the given quantity, which costs
the given price per unit.


returns the total cost of this item in its given quantity. For example, four boxes of cookies that cost 2.30
per unit have a total cost of 9.20.
public void setQuantity(int quantity)

sets this grocery item’s quantity to be the given value.


![Image description](https://scontent-hbe1-1.xx.fbcdn.net/v/t1.15752-9/89974866_212770073328098_9147229971868024832_n.png?_nc_cat=110&_nc_sid=b96e70&_nc_ohc=MPWrrP9rKkcAX-d64MK&_nc_ht=scontent-hbe1-1.xx&oh=db3f88260653e3e4c7532ea636369139&oe=5E97C28D)
