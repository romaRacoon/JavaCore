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
        ArrayList<String> strings = printTextPerRole(roles,textLines);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
    public static ArrayList<String> printTextPerRole(String[] roles, String[] textLines) {
        int counter = 0;
        String roleNumber = "";
        String name = "";
        HashMap<String, String> roleReplicNumbers = new HashMap<String, String>();
        ArrayList<String> results = new ArrayList<String>();
        for (int i = 0; i < roles.length; i++) {
            for (int j = 0; j < textLines.length; j++) {
                if(textLines[j].contains(roles[i])){
                    counter++;
                    name = roles[i];
                    roleNumber += (j + 1) + " ";
                }
            }

            if (counter >= 1) {
                String[] numbers = roleNumber.split(" ");
                roleReplicNumbers.put(name, roleNumber);

                String[] twoPartsOfLine = textLines[Integer.parseInt(numbers[0]) - 1].split(":");
                String[] second = textLines[Integer.parseInt(numbers[1])].split(":");
                String result = name + ":" + "\n"
                        + numbers[0] + ")" + twoPartsOfLine[1]
                        + "\n" + numbers[1] + ")" + second[1] + "\n";
                results.add(result);

                counter = 0;
                roleNumber = "";
            }
        }

        return results;
    }
}