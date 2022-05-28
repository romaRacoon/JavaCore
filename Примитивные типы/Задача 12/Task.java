import java.util.ArrayList;
import java.util.HashMap;

public class Task {
    public static void main(String[] args) {
        String[] roles = {"Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
        "Аммос Федорович: Как ревизор?",
        "Артемий Филиппович: Как ревизор?",
        "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
        "Аммос Федорович: Вот те на!",
        "Артемий Филиппович: Вот не было заботы, так подай!",
        "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }
    public static String printTextPerRole(String[] roles, String[] textLines) {
        int counter = 0;
        int index = 0;
        String name = "";
        String replice = "";
        boolean isFind = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].contains(roles[i])) {
                    if (isFind == false) {
                        isFind = true;
                        index = textLines[j].indexOf(":");
                        name = roles[i];
                        replice = name + ":" + "\n" + (j + 1) + ")"
                                + textLines[j].substring(index + 1, textLines[j].length()) + "\n";
                        stringBuilder.append(replice);
                        replice = "";
                        counter++;
                    } else if (isFind == true) {
                        index = textLines[j].indexOf(":");
                        replice = (j + 1) + ")" + textLines[j].substring(index + 1, textLines[j].length())
                                + "\n" + "\n";
                        stringBuilder.append(replice);
                        counter++;
                        replice = "";
                    }
                }
            }
            isFind = false;
            if (counter == 1) {
                stringBuilder.append("\n");
            }
            counter = 0;
        }

        return stringBuilder.toString();
    }
}