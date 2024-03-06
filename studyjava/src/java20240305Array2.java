import java.util.Arrays;

public class java20240305Array2 {
    public static void main(String[] args) {
        // 기본자료형의 복사
        int a = 3;
        int b = a;
        System.out.println(a + " " + b); // 3, 3
        b = 5;
        System.out.println(a + " " + b); // 3, 5

        // 참조자료형의 복사 => 참조복사 또는 주소복사
        int[] intList1 = {3, 4, 5};
        int[] intList2 = intList1;
        System.out.println(Arrays.toString(intList2));
        intList2[0] = 10;
        System.out.println(Arrays.toString(intList2));
        System.out.println(Arrays.toString(intList1));

        // 배열과 for문의 사용
        for(int i =0; i<intList2.length; i++){
            System.out.println(intList2[i]);
        }

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.print("[" + intList2[i]);
            } else if (i == 2) {
                System.out.print(", " + intList2[i] + "]");
            } else {
                System.out.print(", " + intList2[i]);
            }
        }
        // String 객체 생성 1
        String str1 = new String("안농?");
        System.out.println(str1);


        // String 객체 생성 2
        String str2 = "핫에요";
        System.out.println(str2);
    }
}
