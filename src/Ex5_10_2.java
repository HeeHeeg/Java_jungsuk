import java.util.Arrays;

public class Ex5_10_2 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 0 ,2}; // 1차원 배열 arr
        //배열 정렬
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); //배열 arr을 오름차순으로 정렬
        System.out.println(Arrays.toString(arr));

        int[][] arr2D = {{11, 12}, {21, 22}}; // 2차원 배열

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2D)); // 이렇게 하면 오류. deepToString이 들어가야 한다.
        System.out.println(Arrays.deepToString(arr2D)); //2차원 이상의 배열일 때 사용.

        // equals배열 내용이 완전이 똑같을 때 같은지 비교.

        String[][] str2D = {{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(str2D==str2D2);  //이렇게 하면 false가 나온다. 두개 내용이 같은데도! equals를 써야함! '=='는 참조변수를 비교할 때 사용하는 것.
        System.out.println(Arrays.deepEquals(str2D,str2D2)); // 2차원이기 때문에 deepEquals를 사용해야 한다. aaa->ccc으로 바꿔보는 등 잘 작동하는지 테스트 해보는 것도 중요.

        //배열의 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length); // 배열 arr을 복사해서 arr2를 만드는 것. 몇개를 복하사나? arr.lenght만큼! (즉, arr 전체를 그대로 복사하는 것.)
        System.out.println(Arrays.toString(arr2)); //복사자 잘 됐는지 테스트.

        int[] arr3 = Arrays.copyOf(arr, 3); // arr.length 대신 3개만 복사하고 싶어서 3을 넣으면 [0, 1, 2]만 복사되는 것을 볼 수 있음.
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOf(arr, 7); // 배열의 길이 보다 넘어서는 숫자를 입력하면 나머지를 0으로 채워서 나온다. [0, 1, 2, 3, 4, 0, 0]
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // from ~ to임. 중간부터도 복사가 가능. copyOf는 처음부터 복사. to 포함 안됨 주의!
        System.out.println(Arrays.toString(arr5));

    }
}
