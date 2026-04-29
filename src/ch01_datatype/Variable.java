package ch01_datatype;
/*
 * 변수/상수/메서드 이름의 선정 규칙
 * 
 * [필수사항]
 * 1. 영문 대소문자, 한글 사용 가능(관습적으로 영문 권장)
 * 2. 특수문자는 '_', '$'만 가능
 * 3. 숫자 사용가능, 단 첫글자로는 올 수 없음
 * 4. 예약어(키워드) 사용 불가
 * 
 * [권고사항]
 * 1. 변수의 이름은 소문자로 시작
 * 2. 두개 이상의 단어가 결합된 경우 새 단어는 대문자로 시작
 * 3. 상수 이름은 모든 문자 대문자, 두개 이상의 단어는 _로 연결
 * 
 * [변수의 생존기간]
 * - 변수는 자신이 선언된 중괄호{ } 블록 내부에서만 사용 가능
 * - 블록을 벗어나면 메모리에서 소멸
 */
public class Variable {
	  // 상수 예제
    public static final int MAX_COUNT = 100;
    public static final String DEFAULT_NAME = "홍길동";
    
    public static void main(String[] args) {
        
        // ===== 올바른 변수명 =====
        int age = 20;                // 소문자 시작
        String userName = "김민수";   // 카멜케이스
        double totalScore = 95.5;    // 카멜케이스
        int user_id = 1001;          // '_' 사용 가능
        int $price = 5000;           // '$' 사용 가능
        String 이름 = "이명수";       // 한글 가능 (비권장)
        
        System.out.println(age);
        System.out.println(userName);
        System.out.println(totalScore);
        System.out.println(user_id);
        System.out.println($price);
        System.out.println(이름);
        
        // ===== 잘못된 변수명 (컴파일 에러) =====
        // int 2ndPlace = 2;         //  숫자로 시작 불가
        // String user-name = "a";   //  '-' 사용 불가
        // int class = 10;           //  예약어 사용 불가
        
        // ===== 변수의 생존기간 =====
        int outerVar = 100;
        
        {
            int innerVar = 200;
            System.out.println(outerVar);  //  외부 변수 접근 가능
            System.out.println(innerVar);  //  내부 변수 사용 가능
        }
        
        System.out.println(outerVar);      //  외부 변수 사용 가능
        // System.out.println(innerVar);   //  블록 벗어나 소멸됨
        
        // if, for 문에서의 생존기간
        if (true) {
            int ifVar = 10;
            System.out.println(ifVar);     //  if 블록 내부에서 사용
        }
        // System.out.println(ifVar);      //  if 블록 벗어남
        
        for (int i = 0; i < 3; i++) {
            System.out.println(i);         // for 블록 내부에서 사용
        }
        // System.out.println(i);          //  for 블록 벗어남  
    }
    
    // 메서드명: 동사로 시작, 카멜케이스
    public void printInfo() { }
    public int calculateSum(int a, int b) { return a + b; }
    public boolean isAdult(int age) { return age >= 19; }
}
