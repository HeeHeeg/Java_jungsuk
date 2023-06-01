public class Ex4_10 {
    public static void main(String[] args) {
        int sum = 0; // 합게를 저장하기 위한 변수.

//        sum += 1;     원래는 이런식으로 하나씩 해야 하는 것을 for문으로 간단하게 만다는 것.
//        sum += 2;     처음부터 for문으로 바로 만들 수 있으면 좋지만 잘 모를 때는 이렇게 제일 간단하게부터 만들고 그다음
//        sum += 3;     이것을 어떻게 for문으로 바꿀 수 있을지를 생각해 보면 된다.
//        sum += 4;
//        sum += 5;

        for(int i = 1; i <= 5; i++) {
            sum +=i; // sum = sum +i;
            System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
        }
    }
}
