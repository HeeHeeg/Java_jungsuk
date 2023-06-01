public class Ex4_11 {
    public static void main(String[] args) { //for문 중첩문.  ex)구구단
//
//        for(int i=2; i<=9; i++){
//            for (int j=1; j<=9; j++){
//                System.out.println(i+"*"+j+"="+(i*j));
//            }
//            System.out.println(); // 이게 없으면 구구단별로 띄어쓰기 없이 쭉 붙어서 나옴.
//        }
        for (int i =1; i<=10; i++){ // i 는 줄의 개수
//            System.out.print("*"); // 이거를 for중첩문으로 바꾸면
            for (int j= 1; j<=10; j++){ //j는 열의 개수  j<=10에서 10은 상수. 10대신i를 넣으면 i증가 시 j도 증가.
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈.
        }
    }
}
