import java.util.ArrayList;

 class Products{
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

    public String display(){
        return this.product_id+" "+this.product_name+" "+this.product_price;
    }
}
public class Exercise_2 {
    public static ArrayList<Products> prod_list=new ArrayList<>();
    public static Products linearSearch(ArrayList<Products> arr,int id){
        Products p=null;
        for(Products prod:arr){
            if(prod.product_id==id){
                p=prod;
            }
        }
        return p;
    }

    public static Products binarySearch(ArrayList<Products> arr,int id){
        Products p=null;
        int left=0;
        int right=arr.size()-1;
        while(right>left){
            int mid=(left+right)/2;
            Products target=arr.get(mid);
            if(target.product_id==id){
                p=target;
                return p;
            }
            else if(target.product_id>id){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return p;
    }

    public static void main(String[] args) {
        prod_list.add(new Products(101, "Laptop", 5, 60000));
        prod_list.add(new Products(102, "Smartphone", 10, 30000));
        prod_list.add(new Products(103, "Headphones", 15, 1500));
        prod_list.add(new Products(104, "Keyboard", 8, 700));
        prod_list.add(new Products(105, "Monitor", 4, 12000));
        Products target=linearSearch(prod_list,12);
        if(target==null){
            System.out.println("Linear Search:");
            System.out.println("Product Not Found");
        }
        else{
            System.out.println("Linear Search:");
            System.out.println(target.toString());
        }

        target=linearSearch(prod_list,103);

        if(target==null){
            System.out.println("Linear Search:");
            System.out.println("Product Not Found");
        }
        else{
            System.out.println("Linear Search:");
            System.out.println(target.display());
        }

        target=binarySearch(prod_list,103);

        if(target==null){
            System.out.println("Product "+1+" Not Found");
        }
        else{
            System.out.println("Binary Search:");
            System.out.println(target.display());
        }

    }
}
