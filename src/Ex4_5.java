import java.util.Scanner;

public class Ex4_5 {
    public static void main(String agrs[]) {
        int score = 0;   // 정수를 저장하기 위한 변수
        char grade = ' ', opt = '0'; // 학점을 저장하기 위한 변수. 공백으로 초기화 한다. 공백에 c를 넣으면 맨 아래 els문을 지워서 줄일 수 있다.

        System.out.println("점수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장

        System.out.printf("당신의 점수는 %d입니다.%n", score);

        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
         } else if (score < 84) {
                opt = '-';
            }
         } else {
            grade = 'C';
        }
        System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
    }
}
