import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите процесс");
                String application_name = input.nextLine();
                ProcessBuilder pb = new ProcessBuilder(application_name); // конструктор
                Process process = pb.start(); // запускаем процесс
                System.out.println("Хотите вывести информацию о процессе? да/нет");
                String answer1 = input.nextLine();
                if (answer1.equals("да")){
                    System.out.println(process.info());
                }
                System.out.println("Хотите закрыть процесс? да/нет");
                String answer = input.nextLine();
                if (answer.equals("да")){
                process.destroy(); // Закрываем процесс
                System.out.println("Процесс закрыт");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}