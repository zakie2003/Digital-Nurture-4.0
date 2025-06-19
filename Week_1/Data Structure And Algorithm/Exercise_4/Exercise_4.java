import java.util.ArrayList;

class Employee{
    public int emp_id,emp_salary;
    public String emp_name;
    public String emp_postion;

    public Employee(int id,String emp_name,String emp_postion,int emp_salary){
        this.emp_id=id;
        this.emp_name=emp_name;
        this.emp_postion=emp_postion;
        this.emp_salary=emp_salary;
    }

}

public class Exercise_4 {
    ArrayList<Employee> arr=new ArrayList<>();
    public void add_employee(int id,String name,String position,int salary){
        Employee emp=new Employee(id, name, position, salary);
        arr.add(emp);
        System.out.println("Employee Added Successfully");
    }
    public void search(int id){
        for(Employee emp:arr){
            if(emp.emp_id==id){
                System.out.println("Employee Found:"+emp.emp_name+","+emp.emp_postion+","+emp.emp_salary);
                return;
            }
        }
        System.out.println("Employee Not Found");
    }

    public void traversal(){
        for(Employee emp:arr){
            System.out.println("Employee id"+emp.emp_id+"::"+emp.emp_name+","+emp.emp_postion+","+emp.emp_salary);
        }
    }

    public void delete_employee(int index){
        if(0<=index && index<arr.size()){
            arr.remove(index);
        }
        else{
            System.out.println("Invalid Index");
        }
    }

    public static void main(String[] args) {
        
    }
}
