public class Ex4_8 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) { // i부터 3까지 1씩증가. for(조건을 만족하는 동안) 괄호 {}안의 문장을 3번 반복
//        for (int i = 1; i <= 10; i= i +2) { // i = 1, 3, 5, 7, 9
//        for (int i = 1; i <= 10; i= i *2) { // i = 1, 2, 4, 8, 16은 조건에 부합해서 안나옴.
//        for (int i = 10; i >= 1; i--) {// 10부터 하나씩 감소. 가운데 i대신 1로 잘못 넣으면 무한반복에 빠짐(변수 i에 상관없이 항상 참이기 때문.)

//            System.out.println(i); //항상 예측해보고 돌리자. 내 예측과 다르게 나온다면 ()안에 i변수를 넣어서 무엇이 잘못됐는지 확인.
         for (int i = 1, j = 10; i <= 10; i++, j--) { //변수 i인 int i는  scope(범위) - 선언위치부터 선언된 블록의 끝까지.
             System.out.println("i=" + i + ",j=" + j);
//              int를 for문 위에 따로 빼고 for문의 조건식을 다 빼서 (; ;)가 되면(조건식 생략하면) true로 간주되어서 무한 반복문이 됨.
//              int i =1;
//              for (; ;){
//                System.out.println("i="+i);
////         }
        }
    }
}
