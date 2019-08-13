import java.util.Scanner ;
class GenderChecker {
    public static void main (String[] args){
        System.out.println("주민번호를 적으세요. 예) 123456-1234567");
        String jmnumber = "" ;
        Scanner scanner = new Scanner(System.in) ;
        jmnumber = scanner.next() ; 
        String gender = jmnumber.substring(7,8) ;
        if(gender.equals("1")){
            System.out.println("1900 ~ 1999년에 태어난 남성");
        }else if(gender.equals("2")){
            System.out.println("1900 ~ 1999년에 태어난 여성");
        }else if(gender.equals("3")){
            System.out.println("2000 ~ 2099년에 태어난 남성");
        }else if(gender.equals("4")){
            System.out.println("2000 ~ 2099년에 태어난 여성");
        }else if(gender.equals("5")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 남성");
        }else if(gender.equals("6")){
            System.out.println("1900 ~ 1999년에 태어난 외국인 여성");
        }else if(gender.equals("7")){
            System.out.println("2000 ~ 2099년에 태어난 외국인 남성");
        }else if(gender.equals("8")){
            System.out.println("2000 ~ 2099년에 태어난 외국인 여성");
        }else if(gender.equals("9")){
            System.out.println("1800 ~ 1899년에 태어난 남성");
        }else if(gender.equals("0")){
            System.out.println("1800 ~ 1899년에 태어난 여성");
        }
    }
}
