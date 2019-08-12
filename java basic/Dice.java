import java.util.Scanner ;
class Dice {
    /**
     * 주사위를 던저서 홀수인지 짝수인지 맞추는 게임
     * 일단, 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 홀 또는 짝을 선택합니다.
     * 결과를 나타냅니다.
     */
    public static void main (String[] args) {
        System.out.println("홀수인지 짝수인지 맞춰보세요.");
        System.out.println("컴퓨터가 숫자를 선택했습니다. 홀수면 홀을 짝수면 짝을 선택해 주세요.");
        Scanner scanner = new Scanner (System.in) ;
        String choice = "" ;
        choice = scanner.next();
        if(choice.equals("홀")){
            System.out.println("정답입니다.");
        }else if(choice.equals("짝")){
            System.out.println("틀렸습니다.");
        }else {
            System.out.println("홀 또는 짝을 선택하세요");
        }
    }
}