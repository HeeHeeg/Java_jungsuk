import java.util.Scanner;

public class Ex4_15_1 {
    public static void main(String[] args) {  //사용자 입력을 받고 싶을 때 사용하는 코드.
        int input = 0, answer = 0;

        answer = (int)(Math.random() * 100) + 1; // 1~100 사이의 임의의 값
//        System.out.println("answer=" + answer); // 처음부터 정답을 알고 입력받고 싶으면 이걸 쓰면됨.
        Scanner scanner = new Scanner(System.in);

        // while문으로 바꾸기
        System.out.println("1과 100사이의 정수를 입력하세요.>");
        input = scanner.nextInt();   // 1.입력받은걸

        while (input != answer){  //2. 확인한 다음에

            if (input > answer){   // 3.평가를 해서 더 큰지 작은지를 알려주고
                System.out.println("더 작은 수로 다시 시도해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
            System.out.println("1과 100사이의 정수를 입력하세요.>");   //4. 또 입력받아야함. 코드 중복문이 생김. 그래서 이런 경우는 do - while문이 적합하다.
            input = scanner.nextInt();
        }
        System.out.println("정답입니다.");
    }
}
