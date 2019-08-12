import java.util.Scanner ;
class Calc {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("첫 번째 수는?");
        int a, b, c = 0 ;
        String op = "";
        a = scanner.nextInt() ; 
        System.out.println("두 번째 수는?");
        b = scanner.nextInt() ;
        System.out.println("연산 종류를 선택하세요.  + , - , * , / ");
        op = scanner.next() ;
        if(op.equals("+")){
            c = a + b ;
            System.out.println(String.format("%d + %d = %d", a, b, c));
        }else if(op.equals("-")){
            c = a - b ;
            System.out.println(String.format("%d - %d = %d", a, b, c));
        }else if(op.equals("*")){
            c = a * b ;
            System.out.println(String.format("%d * %d = %d", a, b, c));
        } else if(op.equals("/")){
            c = a / b ;
            System.out.println(String.format("%d / %d = %d", a, b, c));
        }else{
            System.out.println("1번 ~ 4번 중 하나를 선택하세요.");
        }
    }
}