public class Ex5_10_1 {
    public static void main(String[] args) {
        //            01234
        String str = "ABCDE";
        char ch = str.charAt(0);   // 출력하고 싶은 문자 인덱스 입력.
        String str2 = str.substring(1,4); //BCD              from -> 1 / to -> 4
        String str3 = str.substring(1); //1~4  to를 생략하면 1붙 뒤에가 쫙 나온다.
        String str4 = str.substring(1, str.length()); // str3과 str4은 같은 의미이다. 문자열의 길이를 알려는 것과 같기 때문에 5를 넣은 것과 같음.
                                        //longht()는 상수가 아니라 메서드라서 ()를 해줘야 한다.  // 5를 넣으면 뒤에까지 모두 출력됨. 4까지 있기때문.

        System.out.println(ch);
        System.out.println(str3); //서브스트링 출력
    }
}
