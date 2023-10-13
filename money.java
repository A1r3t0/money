import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class money {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int number = Integer.parseInt(number1);
        ArrayList<String> list = new ArrayList<>();
        if (number < 1 || number > 100000) {
            System.out.println("Число не входит в диапазон от 1 до 100_000");
            System.exit(0);
        }
        if (number == 100000) {
            System.out.println("Сто тысяч рублей");
            System.exit(0);
        }
        if ((number/10000)%10 == 1) {
            switch ((number/1000)%10) {
                case 0 -> list.add("десять тысяч");
                case 1 -> list.add("одиннадцать тысяч");
                case 2 -> list.add("двенадцать тысяч");
                case 3 -> list.add("тринадцать тысяч");
                case 4 -> list.add("четырнадцать тысяч");
                case 5 -> list.add("пятнадцать тысяч");
                case 6 -> list.add("шестнадцать тысяч");
                case 7 -> list.add("семнадцать тысяч");
                case 8 -> list.add("восемнадцать тысяч");
                case 9 -> list.add("девятнадцать тысяч");
            }
        }
        else {
            switch ((number / 10000) % 10) {
                case 2 -> list.add("двадцать");
                case 3 -> list.add("тридцать");
                case 4 -> list.add("сорок");
                case 5 -> list.add("пятьдесят");
                case 6 -> list.add("шестьдесят");
                case 7 -> list.add("семьдесят");
                case 8 -> list.add("восемьдесят");
                case 9 -> list.add("девяносто");
            }
        }
        if ((number/10000)%10 != 1) {
            switch ((number / 1000) % 10) {
                case 1 -> list.add("одна тысяча");
                case 2 -> list.add("две тысячи");
                case 3 -> list.add("три тысячи");
                case 4 -> list.add("четыре тысячи");
                case 5 -> list.add("пять тысяч");
                case 6 -> list.add("шесть тысяч");
                case 7 -> list.add("семь тысяч");
                case 8 -> list.add("восемь тысяч");
                case 9 -> list.add("девять тысяч");
            }
        }
        switch ((number / 100) % 10) {
            case 1 -> list.add("сто");
            case 2 -> list.add("двести");
            case 3 -> list.add("триста");
            case 4 -> list.add("четыреста");
            case 5 -> list.add("пятьсот");
            case 6 -> list.add("шестьсот");
            case 7 -> list.add("семьсот");
            case 8 -> list.add("восемьсот");
            case 9 -> list.add("девятьсот");
        }
        if ((number/10)%10 == 1) {
            switch (number%10) {
                case 0 -> list.add("десять рублей");
                case 1 -> list.add("одиннадцать рублей");
                case 2 -> list.add("двенадцать рублей");
                case 3 -> list.add("тринадцать рублей");
                case 4 -> list.add("четырнадцать рублей");
                case 5 -> list.add("пятнадцать рублей");
                case 6 -> list.add("шестнадцать рублей");
                case 7 -> list.add("семнадцать рублей");
                case 8 -> list.add("восемнадцать рублей");
                case 9 -> list.add("девятнадцать рублей");
            }
        }
        else {
            switch ((number / 10) % 10) {
                case 2 -> list.add("двадцать");
                case 3 -> list.add("тридцать");
                case 4 -> list.add("сорок");
                case 5 -> list.add("пятьдесят");
                case 6 -> list.add("шестьдесят");
                case 7 -> list.add("семьдесят");
                case 8 -> list.add("восемьдесят");
                case 9 -> list.add("девяносто");
            }
        }
        if ((number / 10) % 10 != 1) {
            switch (number%10) {
                case 0 -> list.add("рублей");
                case 1 -> list.add("один рубль");
                case 2 -> list.add("два рубля");
                case 3 -> list.add("три рубля");
                case 4 -> list.add("четыре рубля");
                case 5 -> list.add("пять рублей");
                case 6 -> list.add("шесть рублей");
                case 7 -> list.add("семь рублей");
                case 8 -> list.add("восемь рублей");
                case 9 -> list.add("девять рублей");
            }
        }
        String word = "";
        for (String s : list) {
            word = word + s + " ";
        }
        String result = word.substring(0, 1).toUpperCase() + word.substring(1);
        System.out.println(result);
    }
}
