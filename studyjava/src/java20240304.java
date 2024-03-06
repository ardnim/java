public class java20240304 {
    public static void main(String[] args) {
        int i = 0;
        for (; ; ) {
            if (i < 5) {
                System.out.print(i + "");
                i++;
            } else {
                break;
            }
        }
        System.out.println();
        // 멀티 조건식
        for (int a = 0, b = 0; a < 5 || b < 5; a++, b++) {
            System.out.print(a + "_" + b + " ");
        }
        // while문
        int count = 0;  //초기식
        while (count < 5) { //조건식
            System.out.print(count + " ");
            count++; // 증감식
        }
        // 의도적인 무한루프에서 while문은 자주 쓰임
//        while (true) {
//            // 무한루프
//            // 유저가 버튼 클릭할때까지 대기
//            // if (esc버튼 클릭)
//            //      break;
////        }
            // do ~ while 문
            int cnt1 = 5; // 초기식
            do {
                System.out.print(cnt1 + "");
                cnt1++;
            } while (cnt1 < 5);
            // 아래 while문과 비교하면,
//            반복문의 조건이 처음부터 false인 경우,
//        do~while문은 실행코드가 1회 실행되는 반면, while문은 실행되지 않음!!
            int cnt2 = 5;
            while (cnt2 < 5) {
                System.out.println(cnt2 + "");
                cnt2++;
            }

        //이중루프, 이중반복문
        for (int k=0; k<3; k++){
            for (int j=0; j<5; j++) {
                System.out.println("[k=" + k + ", j=" + j + "]");
            }
        }









    }
}

