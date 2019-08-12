import java.util.Scanner ;
import java.util.Random ;
class Dice {
    /**
     * 컴퓨터가 주사위 숫자중 하나를 램덤으로 선택하면 사용자가 홀, 짝을 맞추는 게임
     */
        public static void main (String[] args) {
        System.out.println("홀수인지 짝수인지 맞춰보세요.");
        System.out.println("컴퓨터가 숫자를 선택했습니다. 홀수면 홀을 짝수면 짝을 선택해 주세요.");
        Scanner scanner = new Scanner (System.in) ;
        Random random = new Random() ;
        int dice = 0 ;
        dice = random.nextInt(6)+1 ;
        String choice = "" ;
        choice = scanner.next() ;
        System.out.println(String.format("램덤으로 나온 수 %d" , dice));
        String answer = "" ;
        if(dice==1){
            answer = "홀" ;
        }else if(dice==2){
            answer = "짝" ; 
        }else if(dice==3){
            answer = "홀" ; 
        }else if(dice==4){
            answer = "짝" ; 
        }else if(dice==5){
            answer = "홀" ; 
        }else if(dice==6){
            answer = "짝" ; 
        }else {answer = "짝" ; }
        if(choice.equals(answer)){System.out.println("정답");}else{System.out.println("오답");}
    }
}