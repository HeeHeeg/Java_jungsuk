import java.util.Arrays;

public class Ex5_5_tmp {
    public static void main(String[] args) {
        // index: 0~3-1, 0~2  0=가위, 1=바위, 2=보
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < 10; i++) {
            int tmp = (int) (Math.random() * 3);
            System.out.println(tmp); // 0~2
            System.out.println(strArr[tmp]); // 숫자 대신 가위 바위 보 글자로 나오게 하려면 이렇게 하면 된다.
        }
    }
}
