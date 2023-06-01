import java.nio.file.LinkOption;

public class Ex6_4 { // 사칙연산
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.max(5, 9);  //둘 중에 큰 값을 반환하는 메서드
        long result5 = mm.min(11, 8);
        long result1 = mm.add(5L, 3L);     //add 메서드 호출. 호출하면 5L는 long a에 3L은 long b에 복사된다. 그래서 계산작업을 마치면 호출한 곳으로 돌아온다.
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);;
        mm.printGugudan(4); // 구구단을 출력. 참조변수 mm. 꼭 써줘야 함.

        System.out.println("max(5L, 3L) = " + result);
        System.out.println("min(5L, 3L) = " + result5);
        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("double(5L, 3L) = " + result4);
    }
}

class MyMath {
    void printGugudan(int dan){
        if(!(2<=dan && dan <= 9))
            return; // 입력받은 단(dan)이 2~ 9가 아니면, 메서드 종료하고 돌아가기.

        for (int i = 1; i <= 9; i++){
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
        return; // 원래는 있어야 하는데 귀찮으니까 생략하는 것이다. void에서만!
    }

    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
    }
    // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
    long max(long a, long b){
//       long result = 0;       //먼저 작업 결과를 담을 변수 result 하나를 선언.
//        if (a > b){           // 만약 a가 b보다 크면
//            result = a;       // result에 a를 저장하고
//        } else {              //아니면
//            result = b;       //result에 b를 저장.
//        }
        // 3항 연산자로 바꾸면
        return a > b ? a: b;   // a가 b보다 크면(?) a 아니면(:) b 이걸 result에 저장. return a > b ? a : b; 이렇게 한 문장으로 쓸 수 있다.
//        return result;        //그리고 마지막에 return한다 result문을.                  //그럼 long result = 0;과 return = result 둘다 없어도 된다.
    }

    // 두 값을 받아서 둘중에 작은 값 반환하는 메서드를 작성하시오. (혼자 해보기!)
    long min(long a, long b) {
//        long result5 = 0;
//        if (a < b) {
//            result5 = a;
//        } else {
//            result5 = b;
//        }
//        return  result5;
        return a < b ? a : b;
    }

        long subtract ( long a, long b){
            return a - b;
        }
        long multiply ( long a, long b){
            return a * b;
        }
        double divide ( double a, double b){
            return a / b;}
    }
