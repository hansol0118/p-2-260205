import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
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
