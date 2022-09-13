public class VariableTest {
    public static void main(String[] args) {
        // 문자형(Character)
        char ch;
        ch = 'A'; // 반드시 '' 사용!
        char aaaaa;
        char AAAAA;
        char bbb;
        // 작명법 : 대소문자 구분. a~z, A~Z, 0~9, _, $만 사용가능
        // 숫자는 첫글자로 사용 불가, 글자 사이에 공백 X
        // 권장사항 : 첫글자는 반드시 소문자로 작성할 것.

        // 정수형 변수
        byte numByte;
        short numShort;
        int numInt; // 가장 많이 사용하는 형태
        // long bbb; // 타입이 달라도 같은 변수명을 쓸 수 없다.
        long numLong = 100L; // 접미사 'L', long 타입의 값을 표시 생략 가능

        // 실수형 변수
        float f = 0.0f; // 접미사 'f' 생략 불가
        double du = 0.0;

        float f2;
        int iva = 10;
        f2 = iva;
        System.out.println(f2);

        boolean b = true;
        boolean bb = false;

        // 참조형 String
        String str = "이건 문장입니다.";
        
    }
}
