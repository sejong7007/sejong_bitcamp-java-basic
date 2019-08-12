import java.util.Scanner ; 
class SumTwoNumber {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println ("더하고하 하는 첫 번째 수는?") ;
        int a = 0 ;
        a = scanner.nextInt () ;
        System.out.println ("더하고자 하는 두 번째 수는?") ;
        int b = 0 ;
        b = scanner.nextInt () ;
        System.out.println ( a + "  +  " + b + "  =  " + (a+b));
        System.out.println ("빼고자 하는 첫 번째 수는?") ;
        int c = 0 ;
        c = scanner.nextInt () ;
        System.out.println ("빼고자 하는 두 번째 수는?") ; 
        int d = 0 ;
        d = scanner.nextInt () ;
        System.out.println (c + "  -  " + d + "  =  " +(c-d)) ; 
    }
}