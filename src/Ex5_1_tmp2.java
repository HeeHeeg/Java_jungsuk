public class Ex5_1_tmp2 {
    public static void main(String[] args) {
        // index범위 : 0~9(10-1)
        int[] arr = new int[6];  //길이가 5인 int배열 arr을 생성
        System.out.println("arr.length=" + arr.length);

//        for (int i = 0; i< 10; i++){ // new int[9]로 바꾸면 여기10은 바꾸지 않았기 때문에 index범위를 벗어나서 에러나가 남.
            for (int i = 0; i< arr.length; i++){ // 10을 arr.lenght로 바꾸면 new int[]안에 숫자를 뭘로 변경하던지 에러가 나지 않음.
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
