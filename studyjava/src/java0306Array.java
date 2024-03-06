import java.util.Arrays;
import java.util.Scanner;
public class java0306Array {
    public static void main(String[] args) {

        // 3. 아래 과일 배열에 "사과"가 몇개 들어있는지 확인
//        String[] fruitList = {"배", "사과", "바나나", "딸기", "사과", "수박"};
//        int count = 0;
//        for (int i = 0; i < fruitList.length; i++) {
//            count = count + 1;
//        }
//        System.out.println(count);

        //자바에서 입력값을 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.println("0~6까지 숫자를 입력해주세요:");
//        int inputNumber = sc.nextInt();
//        if (inputNumber >= 0 && inputNumber <= 6) {
//            System.out.println(inputNumber);
//        } else {
//            System.out.println("잘못입력하셨습니다.");
//        }

        // 자바에서 문자열을 입력 받는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이름을 입력해주세요 : ");
//        String inputStr = sc.nextLine();
//        System.out.println(inputStr);

        // 4. 사용자로부터 0~6까지 숫자를 입력받아 아래 배열에 해당하는 요일을 출력
        char[] week = {'월','화','수','목','금','토','일'};
        Scanner scan = new Scanner(System.in);
        System.out.print("0~6까지 숫자를 입력해주세요 : ");
        int num = scan.nextInt();

        if (num >= 0 && num <= 6) {
            char day = week[num-2]; //토요일에서 -2 -> 목요일
            System.out.println("해당하는 요일은 :"+day+"요일입니다");
        } else {
            System.out.println("잘못입력하셨습니다.");
        }


        // 5. 사용자로부터 이름을 입력받아 아래 회원배열에 있는 이름이면
        // "~~~님 환영합니다"를 출력하고
        // 없으면 "회원가입해주세요"를 출력(단, 대소문자 구분하지 마시오)
        String[] members = {"Steve","Tom","Michael","Laura","Jessica","Annie"};


            // 회원 배열
            String[] member = {"Steve", "Tom", "Michael", "Laura", "Jessica", "Annie"};

            // Scanner 객체 생성
            Scanner scanner = new Scanner(System.in);

            // 사용자로부터 이름 입력 받기
            System.out.print("이름을 입력해주세요: ");
            String inputName = scanner.nextLine().toLowerCase(); // 입력된 이름을 소문자로 변환

            // 회원 배열에서 입력된 이름이 있는지 확인
            boolean Member = false; // 변수 이름 변경 및 초기화
            for (String name : members) { // 변수 이름 변경
                if (name.equalsIgnoreCase(inputName)) { // 대소문자를 구분하지 않고 비교
                    Member = true;
                    break;
                }
            }

            // 회원 여부에 따라 메시지 출력
            if (Member) {
                System.out.println(inputName + "님 환영합니다");
            } else {
                System.out.println(inputName + "님 회원가입해주세요");
            }

            // Scanner 객체 닫기
            scanner.close();

            if (i == members.length - 1) {
                System.out.println("회원가입해주세요");
            }
        }

    }

