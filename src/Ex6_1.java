public class Ex6_1 {
    public static void main(String[] args) {
        Tv t;                             // Tv인스턴스를 참조하기 위한 변수 t를 선언          //객채 생성
        t = new Tv();                     // Tv인스턴스를 생성한다.                        //객체 생성
        t.channel = 7;                    // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.   // 객체 사용 - 변수 사용
        t.channelUp();                  // Tv인스턴스의 메서드 channelDown()을 호출.       // 객체 사용 - 메서드 사용
        System.out.println("현재의 채널은" + t.channel + "입니다.");
    }
}
class Tv{
    // Tv의 속성(멤버변수)
    String color;   // 색상
    boolean power;  // 전원상태(on/off)
    int channel;    // 채널

    // Tv의 기능(메서드)
    void power() { power = !power;}
    void channelUp()  {  ++channel; }
    void channelDown()  {  --channel;}
}

