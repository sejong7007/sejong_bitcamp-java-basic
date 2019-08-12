import java.util.Scanner ; 
class PlusCal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println ("더하고하 하는 첫 번째 수는?") ;
        int a = 0 ;
        a = scanner.nextInt () ;
        System.out.println ("더하고자 하는 두 번째 수는?") ;
        int b = 0 ;
        b = scanner.nextInt () ;
        int c = 0 ;
        c = a + b ; 
        System.out.println ( a + "  +  " + b + "  =  " + c );
    }
}