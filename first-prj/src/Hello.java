import java.util.Scanner;

public class Hello {
    // 메인 메소드
    public static void main(String[] args) {
        // 화면에 문장을 출력
        System.out.println("Hello World!");
        System.out.println("안녕하세요~");
        // 키보드로 값입력
        Scanner scan = new Scanner(System.in);
        // 변수 설정 : 데이터 타입 + 변수 이름 = 기능 | 변수 설정 시 var, let, const 사용 안함!!
        int num = scan.nextInt();
        System.out.println("입력받은 값 : " + num);

        Car mycar = new Car(); // 인스터스 생성
        mycar.model = "소나타";
        mycar.company = "현대";
        mycar.tier = 4;
        mycar.color = "검정색";
        mycar.exel(100);
        mycar.stop();
    } // main end
} // class end
