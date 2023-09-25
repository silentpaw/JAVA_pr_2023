
public class Main {

    // ex9
    /*
    Даны числа a и b. Определите, сколько существует последовательностей из a нулей и b единиц, в которых никакие два нуля не стоят рядом.
     */
    private static int count(int a, int b){
        if(a==0) return 1;
        if(a==1) return b+1;
        if(a>1 && b==0) return 0;
        return count(a-1, b-1) + count(a, b-1);
    }

//ex10
    /*
    Дано число n, десятичная запись которого не содержит нулей.
    Получите число, записанное теми же цифрами, но в противоположном порядке.
     */

    private static int revers(int num, int rev){
        if(num==0)return rev;
        return revers(num/10, 10*rev + num%10);
    }


    public static void main(String[] args) {

//ex9
        System.out.println("\nZeros");
        System.out.println(count(0,0));
        System.out.println(count(1,3));
        System.out.println(count(14,15));
//ex10
        System.out.println("\nReverse");
        System.out.println(revers(123,0));
        System.out.println(revers(1, 0));
        System.out.println(revers(9968123, 0));

    }
}