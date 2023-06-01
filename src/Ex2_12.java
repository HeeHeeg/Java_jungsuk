public class Ex2_12 {
    public static void main(String[]agrs){
        String str = "3";

        System.out.println(str.charAt(0) - '0'); // str.charAt(0)이 문자'3'이 되고 여기에 -'0'을 해줘서 숫자 3이 되는 것.
        System.out.println('3' - '0' + 1); // +1은 숫자가 맞는지 확인해보기 위해서 쓴것.
        System.out.println(Integer.parseInt("3") + 1); // 문자열을 숫자로 변환.
        System.out.println("3" + 1); // 문자열이기 때문에 3출력 +1출력 이므로 31
        System.out.println(3 + '0');  //0은 문자인데 문자를 더할 수 없으니까 '0'의 숫자 48을 더한 값으로 나옴.

    }
}
