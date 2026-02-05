import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        lab2();
    }
    public static void lab2(){
        System.out.println("숫");
        PrintStream ORIGINAL_OUT = System.out; // 기존 출력 경로 저장
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); // 출력을 쌓을 배열 생성
        PrintStream printStream = new PrintStream(byteArrayOutputStream); // 배열로 향하는 경로 저장

        System.setOut(printStream); // 이걸로 출력이 배열로 향하게 됨, 이후 sout 시 모니터가 아닌 배열로 저장, 모니터에는 아무것도 안 보임
        System.out.println("HihI");
        System.out.println("BBBBB");
        System.out.println("Ok");

        System.setOut(ORIGINAL_OUT); // 다시 모니터로 출력 방향 돌림

        String rst = byteArrayOutputStream.toString();

        if(rst.equals("1번 명언이 등록되었습니다."))
        System.out.println(rst);
    }
// 문자열 -> System.out.println -> 모니터
    // 문자열 -> System.out. -> 내 메모리 영역에 출력을 쌓아서 확인, 출력의 방향을 모니터가 아닌 나의 배열 메모리로 바꾸기
// PrintStream ORIGINAL_OUT = System.out;
    // ByteArrayOutputStream
    //    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()
 // System.setOut(printStream); // 이걸로 출력이 배열로 향하게 됨
    //       setout 설정 이후 println("aaa") -> 이제 모니터에 출력이 안됨
 //
        public static void lab1(){
        Scanner scan = new Scanner("""
                aaa
                bbb
                ccc
                eee
                """);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();
        String str4 = scan.nextLine();
        System.out.printf("%s %s %s %s",str1,str2,str3,str4);
    }
}
