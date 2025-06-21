
public class App {
    public static void main(String[] args) throws Exception {
        Logger logger1=Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        if(logger1 == logger2) {
            System.out.println("Both logger1 and logger2 are the same instance.");
        } else {
            System.out.println("logger1 and logger2 are different instances. ");
        }
    }
}
