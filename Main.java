import java.util.Scanner;
import ru.netology.service.CustomsService;

class Main {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Добрый день!");
        System.out.print ("Представьтесь, пожалуйста! (Укажите свое имя):");
        String a = scanner.next ();
        System.out.println ("Здравствуйте," + a + "!" );
        System.out.print ("Введите цену товара (в руб.):");
        int price = scanner.nextInt ();
        System.out.print ("Введите вес товара (в кг.):");
        int weight = scanner.nextInt ();
        CustomsService.calculateCastoms (price, weight);
        System.out.println ("Спасибо за Ваше обращение!");
        int t = CustomsService.calculateCastoms(price, weight);
        System.out.println ("Ваша пошлина для провоза товара составляет:" + t + " руб.");
        System.out.println ("Хорошего дня, " + a + "!");
    }
}