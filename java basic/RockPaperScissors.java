import java.util.Scanner ;
class RockPaperScissors {
    public static void main(String[] args){
        System.out.println("가위 바위 보 게임");
        System.out.println("1.가위  2.바위  3.보");
        //컴퓨터는 바위를 냄
        int op = 0 ;
        Scanner scanner = new Scanner (System.in);
        op = scanner.nextInt();
        if(op==1){
            System.out.println("패배!!");
        }else if(op==2){
            System.out.println("무승부!!");
        }else if(op==3){
            System.out.println("승리");
        }else{
            System.out.println("1번 ~ 3번 중 하나를 선택하세요.");
        } 
    }
}