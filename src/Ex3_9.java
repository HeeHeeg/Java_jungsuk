public class Ex3_9 {
    public static void main (String[] agrs){
        int a = 1_000_000;  // 1,000,000    1백만 = 10의 6제곱
        int b = 2_000_000;  // 2,000,000    2백만 = 10의 6제곱

        // 10의 12제곱. int의 범위는 10의 9제곱.  a*b = 2,000,000,000,000 ?
        long c = (long)a * b;   // 오버플로워가 발생해서 안됨. (int)로 형변환을 해도 이미 오류이기 떄문에 안됨. (long)을 붙여줘야함.

        System.out.println(c);
    }
}
