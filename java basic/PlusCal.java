import java.util.Scanner ; 
class PlusCal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        System.out.println ("첫 번째 수는?") ;
        int a , b , c , op = 0;
        a = scanner.nextInt ();
        System.out.println ("두 번째 수는?") ;
        b = scanner.nextInt ();
        System.out.println("연산 종류를 선택하세요 1. +   2. -   3. *   4. /  ");
        op = scanner.nextInt() ;
        if(op==1){
            c = a + b ;
            System.out.println (String.format ("%d + %d = %d" , a , b , c)) ;
        }else 
        if(op==2){
            c = a - b ;
            System.out.println (String.format ("%d - %d = %d" , a , b , c)) ;
        }else 
        if(op==3){
            c = a * b ;
            System.out.println (String.format ("%d * %d = %d" , a , b , c)) ;
        }if(op==4){
            c = a / b ; 
            System.out.println (String.format ("%d / %d = %d" , a , b , c)) ;
        }else{System.out.println("1번~4번 중 하나를 선택하세요");}
    }
}