public class Ex5_2 {
    public static void main(String[] args) {
        int sum = 0;         //총합을 저장하기 위한 변수
        float average = 0f; //평군을 저장하기 위한 변수

        int[] score = {100, 88, 100, 100, 90};

//        sum += score[0];
//        sum += score[1];
//        sum += score[2];
//        sum += score[3];
//        sum += score[4];
        //이거를 for문으로 돌리는 것. for문으로 바로 생각이 안날 때에는 이렇게 해보는게 좋다.

        for (int i = 0; i < score.length; i++){
            sum += score[i];  // 반복문을 이용해서 배열에 저장되어 있는 값들을 모두 더한다.
        }
        average = sum / (float)score.length; // 계산결과를 float타입으로 얻으려 형변환

        System.out.println("총합 :"+ sum);
        System.out.println("평균 :"+ average);
    }
}
