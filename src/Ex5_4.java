import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 10; i++) { // 두 요소 값 바꾸기를 100번 하는 것.
            int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다.
            //int n = 3; 이렇게 한 값만 넣고 돌리면 값이 어떻게 돌아가는지 볼 수 있음.

            int tmp = numArr[0];
            numArr[0] = numArr[n];       //위아래 세줄로 numArr[0]과 numArr[n]의 값을 서로 바꾼다.
            numArr[n] = tmp;

            System.out.println(Arrays.toString(numArr)); //여기서 출력하면 for문이 돌 때마다 출력
        }
//        System.out.println(Arrays.toString(numArr)); 여기서 출력하면 한 값만 나옴.
    }// main의 끝
}
