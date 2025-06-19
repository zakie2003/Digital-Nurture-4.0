import java.util.ArrayList;

class Orders{
    int order_id;
    String order_name;
    int order_price;

    public Orders(int id,String order_name,int order_price){
        this.order_id=id;
        this.order_name=order_name;
        this.order_price=order_price;
    }

    public String display(){
        return this.order_id+" "+this.order_name+" "+this.order_price;
    }
}

public class Excercise_3 {
    public static ArrayList<Orders> order_list=new ArrayList<>();

    public static void show_item(ArrayList<Orders> ord){
        for(Orders o:ord){
            System.out.println(o.order_id+":"+o.order_name+","+o.order_price);
        }
    }

    public static ArrayList<Orders> bubblesort(ArrayList<Orders> arr){
        int size=arr.size();
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr.get(j).order_price>arr.get(j+1).order_price){
                    Orders temp=arr.get(j);
                    arr.set(j,arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }
        return arr;
    }

    public static void quickSort(ArrayList<Orders> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1); 
            quickSort(arr, pi + 1, high);  
        }
    }

    private static int partition(ArrayList<Orders> arr, int low, int high) {
        Orders pivot = arr.get(high); 
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr.get(j).order_price <= pivot.order_price) {
                i++;
 
                Orders temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        Orders temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        return i + 1;
    }


    public static void main(String[] args) {
        order_list.add(new Orders(101, "Laptop",  60000));
        order_list.add(new Orders(102, "Smartphone",  30000));
        order_list.add(new Orders(103, "Headphones",  1500));
        order_list.add(new Orders(104, "Keyboard", 700));
        order_list.add(new Orders(105, "Monitor", 12000));
        show_item(order_list);
        System.out.println("");
        System.out.println("Sorted By Price using bubble sort");
        System.out.println("");
        // ArrayList<Orders> sorted_arr=bubblesort(order_list);
        quickSort(order_list, 0, order_list.size() - 1);
        show_item(order_list);
    }

}
