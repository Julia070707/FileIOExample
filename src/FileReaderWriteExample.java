import java.io.*;

class FileReadWriteExample {

    // Минимум: записать в файл и прочитать его
    public static void main(String[] args) {
        // Запись в файл
        writeToFile("hello.txt", "Hello world, I’m ваше_имя");

        // Чтение из файла
        String content = readFromFile("hello.txt");
        System.out.println("Содержимое файла:");
        System.out.println(content);
    }

    // Метод для записи строки в файл
    private static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для чтения содержимого файла в строку
    private static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
