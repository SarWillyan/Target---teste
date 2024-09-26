package QUEST_2;

public class StringCount {
    public static String contA(String string) {
        long count = 0;
        count = string.toLowerCase()
                .chars()
                .filter(c -> c == 'a')
                .count();

        if (count > 0)
            return "A letra 'a' existe, e aparece " +count+ " vezes.";
        else
            return "A letra 'a' não existe";
    }
}
