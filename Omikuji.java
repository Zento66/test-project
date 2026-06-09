import java.util.Random;
import java.util.Scanner; // 入力を受け取るための道具をインポート

public class Omikuji {
    public static void main(String[] args) {
        // 準備
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        // 1. 名前の入力
        System.out.println("名前を入力してください：");
        String name = scanner.nextLine(); // キーボードからの入力を受け取る

        System.out.println("\n" + name + "さんの運勢を占います...");
        System.out.println("---------------------------");

        // 2. 運勢の判定 (0〜4の乱数)
        int fortuneNum = rand.nextInt(5);
        String fortune;

        switch (fortuneNum) {
            case 0: fortune = "【大吉】 素晴らしい幸運が舞い降ります！"; break;
            case 1: fortune = "【中吉】 順調な一日になるでしょう。"; break;
            case 2: fortune = "【小吉】 穏やかに過ごせそうです。"; break;
            case 3: fortune = "【末吉】 謙虚な姿勢が吉を呼びます。"; break;
            default: fortune = "【凶】 慎重に行動すれば大丈夫。"; break;
        }

        // 3. ラッキーカラーの判定 (0〜3の乱数)
        int colorNum = rand.nextInt(4);
        String color;

        switch (colorNum) {
            case 0: color = "赤色"; break;
            case 1: color = "青色"; break;
            case 2: color = "黄色"; break;
            default: color = "緑色"; break;
        }

        // 4. 結果の表示
        System.out.println(fortune);
        System.out.println("今日のラッキーカラーは「" + color + "」です！");

        // 最後にScannerを閉じる（お作法として）
        scanner.close();
    }
}
