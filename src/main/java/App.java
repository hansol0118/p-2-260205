import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private Scanner sc;
    private WiseSayingController wiseSayingController = new WiseSayingController(sc);
    private SystemController systemController = new SystemController();

    public App(Scanner sc) {
        this.sc = sc;
    }
    List<WiseSaying> wiseSayings = new ArrayList<>();
    int lastId = 0;

    public void run() {
        System.out.println("== 명언 앱 ==");


        while (true) {
            System.out.println("명령) ");
            String cmd = sc.nextLine();
            switch (cmd) {
                case "등록" -> wiseSayingController.actionAdd(sc);
                case "목록" -> wiseSayingController.actionList();
                case "종료" -> {
                    systemController.actionExit();
                    return;
                }
            }
        }
    }
}
