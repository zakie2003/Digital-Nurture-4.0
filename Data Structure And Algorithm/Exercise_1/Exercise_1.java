
import java.util.ArrayList;
import java.util.Scanner;

class Products {
    int product_id;
    String product_name;
    int product_quantity;
    int product_price;

    public Products(int id,String product_name,int product_quantity,int product_price){
        this.product_id=id;
        this.product_name=product_name;
        this.product_quantity=product_quantity;
        this.product_price=product_price;
    }

    public static ArrayList<Products> add_product(ArrayList<Products> arr,Products p){
        arr.add(p);
        System.out.println("Item Added Successfully");
        return arr;
    }


    public static void display(ArrayList<Products> arr){
        for(Products p: arr){
            System.out.println(p.product_id+","+p.product_name+","+p.product_price+","+p.product_quantity);
        }
    }

    public static ArrayList<Products> delete_item(ArrayList<Products> arr,int index){
        if(index>=0 && index<arr.size()){
            arr.remove(index);
            System.out.println("Item Deleted at index:"+index);
        }
        else{
            System.out.println("Index Out Of Bound");
        }
        return arr;
    }

    public static ArrayList<Products> update_item(ArrayList<Products> arr,int index,String name,int quantity,int price){
        if(index>=0 && index<arr.size()){
            Products p=arr.get(index);
            p.product_name=name;
            p.product_price=price;
            p.product_quantity=quantity;

            System.out.println("Item Updated at index:"+index);
        }
        else{
            System.out.println("Index Out Of Bound");
        }
        return arr;
    }

}

public class Exercise_1 {
    public static void main(String[] args) {
        ArrayList<Products> arr_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (choice != 5) {
            System.out.println("\n==== Product Menu ====");
            System.out.println("1. Add Product");
            System.out.println("2. Delete Product by Index");
            System.out.println("3. Display List");
            System.out.println("4. Update Items");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter id:");
                int id=sc.nextInt();
                System.out.print("Enter name:");
                String name=sc.next();
                System.out.print("Enter quantity:");
                int quantity=sc.nextInt();
                System.out.print("Enter price:");
                int price=sc.nextInt();
                Products p=new Products(id, name, quantity, price);
                arr_list=Products.add_product(arr_list,p);
            } 
            else if (choice == 2) {
                System.out.print("Enter index to delete: ");
                int index = sc.nextInt();
                arr_list=Products.delete_item(arr_list, index);
            }
            else if(choice==3){
                Products.display(arr_list);
            }  
            else if(choice==4){
                System.out.print("Enter index to update: ");
                int index = sc.nextInt();
                System.out.print("Enter name:");
                String name=sc.next();
                System.out.print("Enter quantity:");
                int quantity=sc.nextInt();
                System.out.print("Enter price:");
                int price=sc.nextInt();
                arr_list=Products.update_item(arr_list, index,name,quantity,price);
            } 
            else if (choice == 5) {
                System.out.println("Exiting Program.");
            }
            else {
                System.out.println("Invalid choice. Please enter between 1 and 4.");
            }
        }

        sc.close();
    }
}
