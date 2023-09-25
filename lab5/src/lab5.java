public class lab5 {
    // ex 6
    /*
    Дано натуральное число n>1. Проверьте, является ли оно простым.
    Программа должна вывести слово YES, если число простое и NO, если число составное.
     */
    private static void isPrime(int number) {isPrime(number, 2);}
    private static void isPrime(int number, int div){
        if (number == 2) {
            System.out.println("YES");
            return;
        }
        if(number % div == 0) {
            System.out.println("NO");
            return;
        }
        if(div > Math.sqrt(number)){
            System.out.println("YES");
            return;
        }
        isPrime(number, div+1);
    }

    // ex7

    /*
Дано натуральное число n>1.
Выведите все простые множители этого числа в порядке не убывания с учетом кратности.
     */

    // methods without souts
    private static boolean isNumPrime(int number){
        return isNumPrime(number, 2);
    }
    private static boolean isNumPrime(int number, int div){
        if(number == 2) return true;
        if(number % div == 0) {
            return false;
        }
        if(div > Math.sqrt(number)){
            return true;
        }
        return isNumPrime(number, div+1);
    }

    private static void factorization(int number) {factorization(number, 2);}
    private static void factorization(int number, int div){
        if(number == 2) {
            System.out.println("2");
            return;
        }
        if(number <= 1) return;
        if(!isNumPrime(div)) {
            factorization(number, div+1);
            return;
        }
        if(number % div == 0){
            System.out.print(div +", ");
            factorization(number / div, div);
        }else factorization(number, div+1);
    }

    //ex8
    /*
    Дано слово, состоящее только из строчных латинских букв.
    Проверьте, является ли это слово палиндромом. Выведите YES или NO.
     */
    private static void isPalindrome(String s){
        if(s.length() == 1){
            System.out.println("YES"); return;
        }
        if(s.charAt(0) != s.charAt(s.length()-1)){
            System.out.println("NO"); return;
        }
        if(s.length()==2){
            System.out.println("YES"); return;
        }
        isPalindrome(s.substring(1, s.length()-1));
    }

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
