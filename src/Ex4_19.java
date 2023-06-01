public class Ex4_19 {
    public static void main(String[] args) {
        // for문에 Loop1이라는 이름을 붙였다.
        Loop1 : for (int i = 2; i <=9; i++){
                for (int j = 1; j <=9; j++){
                    if (j==5)  // 5가되면 브레이크.
                        break Loop1;  //이걸 주석처리 한 것과
//                        break ;         //이걸 주석처리 한 것을 비교해보면 됨.
//                        continue Loop1;
//                        continue;
                    System.out.println(i + "*" + j + "=" + i*j);
                } // end of for i
            System.out.println();
        }        // end of Loop1
    }
}
