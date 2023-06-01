public class Ex3_11 {
    public static void main(String args []){
        double pi = 3.141592;
//        double shortPi = Math.round(pi * 1000) / 1000.0;  // 여기까지만 하면 3.142(3141.592에서 반올림되서 3142가되고 나누기로 3.142)

//        System.out.println(pi);
//        System.out.println(pi * 1000);
//        System.out.println(Math.round(pi * 1000));
//        System.out.println(Math.round(pi * 1000)/1000); // 정수 3이 나옴. 1000.0을 해야 소수점이나온다.
//        System.out.println(Math.round(pi * 1000)/1000.0);

        //3.141로 얻고싶다면?
        System.out.println(pi * 1000);
        System.out.println((int)(pi * 1000)); // 형변환을 해서 일부로 값손실을 일으키면 된다. 이렇게 하면 3141이 남음.(괄호 중요!)
        System.out.println((int)(pi * 1000) / 1000.0); //1000으로 나누면 안됨.
    }
}
