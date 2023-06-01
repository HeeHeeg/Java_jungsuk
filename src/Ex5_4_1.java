import java.util.Arrays;

public class Ex5_4_1 {  //첫 번째 위치와 자리바꿈, 두번 째 위치와 자리바꿈.. 이런식으로 한 칸씩 옮가가며 섞임. numArr.length만큼 돌리고 numArr[i]일때
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i++) { // 배열의 길이만큼 돌림.
            int n = (int)(Math.random()*10); // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr[i];
            numArr[i] = numArr[n];       //위아래 세줄로 numArr[0]과 numArr[n]의 값을 서로 바꾼다.
            numArr[n] = tmp;

            System.out.println(Arrays.toString(numArr)); //여기서 출력하면 for문이 돌 때마다 출력
        }
//        System.out.println(Arrays.toString(numArr)); 여기서 출력하면 한 값만 나옴.
    }// main의 끝
}
