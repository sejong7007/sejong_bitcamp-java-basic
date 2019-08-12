import java.util.Scanner ;
class WhereLive {
    public static void main (String[] arge){
        System.out.println ("어디에 사니?"); 
        Scanner scanner = new Scanner (System.in);
        String live =  "" ;
        live = scanner.next() ;
        System.out.println ("내가 사는 곳은 " + live + "이야");
    }   
}