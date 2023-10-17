import java.util.Scanner;

public class ex2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );
    }

    public void exceptionDemo2(){
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (NumberFormatException e){
            System.out.println("Not correct number");
        }
    }

    public static void main(String[] args) {
        ex2 e2 = new ex2();
        e2.exceptionDemo2();
        e2.exceptionDemo();
    }
}
