import java.util.Arrays;   // 윈도우에서 ctrl + shift +o 누르면 자동 생성됨.

public class Ex5_1_tmp3 {
    public static void main(String[] args) {
        int[] iArr = {100, 95, 80, 70, 60}; //길이가 5인 int배열
//        System.out.println(iArr); // 에러

        for (int i =0; i < iArr.length; i++){
            System.out.println(iArr[i]);
        }
        System.out.println(Arrays.toString(iArr));
    }
}
