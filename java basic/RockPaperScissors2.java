import java.util.Scanner;
import java.util.Random;
class RockPaperScissors2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       Random random = new Random();
       System.out.println("가위 바위 보 게임");
       System.out.println("선택 : 1.가위  2.바위  3.보");
       int choice = 0 ;
       choice = scan.nextInt();
       int computer = 0 ;
       computer = random.nextInt(2)+1 ;
       if(choice==computer){
           System.out.println("무승부");
        }else if(choice==1 && computer==2){
            System.out.println("패배");
        }else if(choice==1 && computer==3){
            System.out.println("승리");
        }else if(choice==2 && computer==3){
            System.out.println("패배");
        }else if(choice==2 && computer==1){
            System.out.println("승리");
        }else if(choice==3 && computer==1){
            System.out.println("패배");
        }else if(choice==3 && computer==2){
            System.out.println("승리");
        }
    }
}