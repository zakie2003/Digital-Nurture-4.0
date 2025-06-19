class Task{
    int task_id;
    String task_name;
    String status;
    Task next;
    public Task(int id,String name){
        this.task_id=id;
        this.task_name=name;
        this.status="active";
        this.next=null;
    }

}
public class Exercise_5 {
    Task root=new Task(0, "Doing Assignment");

    public void add_at_end(int id,String name){
        Task node=new Task(id, name);
        Task curr=root;
        if(root==null){
            root=node;
            return;
        }
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=node;
        return;
    }

    public void traversal(){
        Task curr=root;
        while (curr!=null) {
            System.out.println("Task:    "+curr.task_id+","+curr.task_name);
            curr=curr.next;
        }
    }

    public void delete_node(int id){
        Task prev=null;
        Task curr=root;
        while (curr!=null) {
            if(curr.task_id==id){
                if(root.next==null){
                    root=null;
                }
                else if(curr==root){
                    root=root.next;
                }
                else{
                    prev.next=prev.next.next;
                }
                System.out.println("Node deleted");
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        System.out.println("Node Not Found");
    }

    public static void main(String[] args) {
        Exercise_5 e=new Exercise_5();
        e.add_at_end(1, "hi");
        e.add_at_end(3, "done with degree");
        e.traversal();
        e.delete_node(1);
        e.traversal();
    }
}
