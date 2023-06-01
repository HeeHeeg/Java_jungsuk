public class Ex4_14 {
    public static void main(String[] args) {
        int num = 12345, sum = 0;

        // 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
//        System.out.println(num%10);

        // num = 12345, 1234, 123, 12, 1
        for (num=12345; num >0; num = num / 10 ){
            System.out.println(num%10);// %10을 안하면 12345, 1234, 123, 12, 1 이렇게 나옴.
            sum += num %10; // sum에다 나머지 값을 계속 누적
        }

        System.out.println("각 자리수의 합:"+ sum);
    }
}
