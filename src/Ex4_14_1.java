public class Ex4_14_1 {
    public static void main(String[] args) {
        int num = 12345, sum = 0;

        // 10으로 나머지 연산을 하면 마지막 자리를 얻는다.
//        System.out.println(num%10);

        // num = 12345, 1234, 123, 12, 1
        //for문을 while문으로 바꾸기

        while (num >0){
            sum += num %10;
            System.out.println("sum=" + sum + ",num%10="+ num%10);// 이렇게 적으면 각 값이 어떻게 나오는지 확인할 수 있으니 귀찮아도 해보기!
            num = num /10;

        }
        System.out.println("각 자리수의 합:"+ sum);
    }
}
