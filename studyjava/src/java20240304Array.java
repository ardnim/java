public class java20240304Array {

    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};
        System.out.println(intArray[0]);
        // 배열의 복사 (=참조복사)
        String[] str1 = {"black", "red", "blue"};
        String[] str2 = str1;
        System.out.println("1" + str2[0]);
        str2[0] = "white";
        System.out.println("2" + str2[0]);
        System.out.println("3" + str1[0]);
        // 기본자료형의 복사 (=값복사)
        int a = 3;
        int b = a;
        System.out.println("1 " + b);
        b =6;
        System.out.println("2 " + b);
        System.out.println("3 " + a);
    }
}
