import java.io.File;

public class CreateDirectories {
    public static void main(String[] args) {
        // クラスファイルのカレントディレクトリパスを取得
        String basePath = "src/main/java/";

        // chapter1からchapter16までのディレクトリを作成
        for (int i = 1; i <= 16; i++) {
            String directoryPath = basePath + "Chapter" + i;
            File directory = new File(directoryPath);
            boolean created = directory.mkdirs();
            if (created) {
                System.out.println("Directory created: " + directoryPath);
            } else {
                System.out.println("Failed to create directory: " + directoryPath);
            }
        }
    }
}
