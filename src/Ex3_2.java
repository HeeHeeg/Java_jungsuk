public class Ex3_2 {
    public static void main (String[]agrs){
        int i = 5, j= 0;

//        j = i++; // 후위형
        // 이해가 안되면 분리하기 후위형이니까 아래로 분리
        j = i;    //대입 후 +함
        i++;
        System.out.println("j= i++; 실행 후, i=" + i + ",j=" + j);

        i = 5;  // 결과를 비교하기 위해, i와 j의 값을 다시 5와 0으로 변경
        j = 0;

//        j = ++i; // 전위형
        // 전위형이니까 위로 분리하기.
        ++i;    //이렇게 혼자 쓰을 때에는 차이가 없다.
        j = i;  // +하고난 뒤 대입함.
        System.out.println("j= ++i; 실행 후, i=" + i + ",j=" + j);

        i = -10;
        i = -i;
        System.out.println(i);   // -에 -가 만나서 +가 되는것.

    }
}
