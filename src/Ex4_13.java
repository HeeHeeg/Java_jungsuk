public class Ex4_13 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        // i를 1씩 증가시켜서 sum에 계속 더해나간다.
        while (sum <= 100) { // 몇번 반복해서 더해야 100이 되는지 알 수 없으니까 조건에 100이하를 써준다. 100을 넘지 않는 최대값.
            System.out.printf("%d - %d%n", i, sum);
            sum += i++;
        }
    }
}
