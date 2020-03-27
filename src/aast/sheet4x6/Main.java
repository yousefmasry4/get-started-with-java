package aast.sheet4x6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var list =new GroceryList();


        while (true){
            System.out.println("enter ~ to finish or anything else to continue ");
            if(scanner.next().equals("~"))
                break;
            System.out.println("enter the data as name then the price");
            scanner.nextLine();
            GroceryItemOrder item=new GroceryItemOrder(scanner.nextLine(),scanner.nextDouble());
            System.out.println("Enter the quantity");
            item.setQuantity(scanner.nextInt());
            System.out.println("Are you sure you want to add?\n"+item.toString()+"\n[Y/N]");
            String temp=scanner.next();
            if(temp.equals("Y") || temp.equals("y"))
                    list.add(item);
            else if(temp.equals("N") || temp.equals("n")) {
                System.out.println("Do you want to \t\t\n[1]print items \n\t[2]add another item? \n\t[else]Exit");
                temp = scanner.next();
                switch (temp) {
                    case "1":System.out.print(list.toString());
                    break;
                    case "2": continue;
                    default: System.exit(0);
                }
            }
        }
        System.out.print(list.toString());
        System.out.println("\ntotal cost="+list.getTotalCost());
        System.out.print("thank you\n" +
                "jo supermarket :)");
        scanner.close();
    }
}
