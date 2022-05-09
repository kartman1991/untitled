import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(){{
            add("Нулевая строка");add("Первая строка");add("Вторая строка");}};

        System.out.println("add, delete,edit or list your deals");
        Scanner scanner = new Scanner(System.in);
        for(;;){
            String begin = scanner.nextLine();
            String command[] = begin.split("\\s");
            switch (command[0]){

                case "add":
                    if (command[1].length() < 2){
                        String b = command[1];
                        int c = Integer.parseInt(b);

                        if (c > list.size()){
                            String a = command[2];
                            list.add(a);
                        }else {
                            list.add(c, command[2]);
                        }

                    }else {
                        String a = command[1];
                        list.add(a);
                    }
                    break;

                case "delete":
                    String b = command[1];
                    int c = Integer.parseInt(b);
                    list.remove(c);
                    break;
                case "edit":
                    String a = command[2];
                    b = command[1];
                    c = Integer.parseInt(b);
                    list.remove(c);
                    list.add(c, a);
                    break;
                case "list":
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(i + " - " + list.get(i));
                    }
                    break;
                default:
                    System.out.println("input correct value!");
            }
        }}
}