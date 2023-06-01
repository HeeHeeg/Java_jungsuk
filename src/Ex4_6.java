import java.util.Scanner;

public class Ex4_6 {
    public static void main (String agrs[]){
        System.out.println("현재의 월을 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장

        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break; // 빼먹지 않게 조심하기!
            case 6: case 7: case 8:
                System.out.println("현재의 게절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
//            case 12: case 1: case 2:
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }  // main의 끝.
}
