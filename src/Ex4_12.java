public class Ex4_12 {
    public static void main(String[] args) {
        int i= 5; //반복할 횟수를 넣는다.

        while (i-- != 0){  //후위형으로 분리하려면 i!=0
            //i--;   이렇게 넣어주면 된다.
            System.out.println(i + "- I can do it.");
        }
    }
}
