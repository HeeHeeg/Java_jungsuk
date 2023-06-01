public class Ex4_17 {
    public static void main(String[] args) { // 3의 배수는 조건에 만족하기 때문에 3, 6, 9는 나오지 않음.
        for (int i = 0; i <= 10; i++){
            if (i%3 ==0)  // 2로 바꾸면 홀수만 나옴.
                continue;
            System.out.println(i); //조건이 만족해서 continue를 만나면 시스템 아웃을 건너뛰고 다시 증감식으로 올라가서 반복.
        }
    }
}
