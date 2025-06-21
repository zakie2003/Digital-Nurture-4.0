import java.util.Scanner;

public class Exercise_7 {
    public static double futureValue(double p,int time,double rate){
        if(time==0){
            return p;
        }
        return futureValue(p*(1+rate), time-1, rate);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current amount:");
        double principal = scanner.nextDouble();
        System.out.print("Enter the number of years:");
        int years = scanner.nextInt();
        System.out.println("The Future Value is "+futureValue(principal, years, 0.05));
    }
}
