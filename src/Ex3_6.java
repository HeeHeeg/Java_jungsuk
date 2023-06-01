public class Ex3_6 {
    public static void main(String[]agrs){
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b); // 정수 + 정수 = 정수줄바꿈, 정수a , 정수b, 정수 둘의 합
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); //어느 한쪽만 바꿔도 둘 다 float로 바뀜
    }
}
