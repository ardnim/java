public class pracitice {
    public static void main(String[] args) {
//    int a = 85;
//    if(a >=70 && a< 80) {
//        System.out.println("C학점");
//    }
//    else if(a >= 80 && a < 90) {
//        System.out.println("B학점");
//    }
//    else if(a >= 90) {
//        System.out.println("A학점");
//    }
//    else {
//        System.out.println("F학점");
//    }

        String str3 = String.valueOf(2.3);
        String str4 = String.valueOf(false);
        System.out.println(str3); //2.3
        System.out.println(str4); //false

        // @concat(): 문자열 연결
        String str5 = str3.concat(str4);
        System.out.println(str5); //2.3false

        // String.valueOf() + concat()
        String str6 = "안녕" + 3;
        String str7 = "안녕".concat(String.valueOf(3)); //str6 = str7 안녕3 동일

        // 문자열을 byte[] 또는 char[]로 변환.
        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        System.out.println(str8);
        System.out.println(str9);














    }
    }
