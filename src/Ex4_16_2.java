public class Ex4_16_2 {
    public static void main(String[] args) { //16과 같은 결과값. 이렇게 바꿀 수 있음.
        int sum = 0;
        int i   = 0;

        for (; ;){ //sum이 100보다 작거나 같을 동안 반복.
            if (sum > 100)
                break;
            ++i;
            sum += i;
        } // end of while
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}
