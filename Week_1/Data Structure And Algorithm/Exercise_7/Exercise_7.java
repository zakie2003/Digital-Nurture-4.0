public class Exercise_7 {
    public static double futureValue(double p,int time,double rate){
        if(time==0){
            return p;
        }
        return futureValue(p*(1+rate), time-1, rate);
    }
    public static void main(String[] args) {
        System.out.println(futureValue(1000,5, 0.05));
    }
}
