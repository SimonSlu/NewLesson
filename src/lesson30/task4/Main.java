package lesson30.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Не выходи из комнаты, не совершай ошибку. " +
                    "Зачем тебе Солнце, если ты куришь Шипку? " +
                    "За дверью бессмысленно всё, особенно — возглас счастья... " +
                    "Только в уборную — и сразу же возвращайся.\n" +
                    "О, не выходи из комнаты, не вызывай мотора." +
                    "Потому что пространство сделано из коридора" +
                    "и кончается счетчиком. А если войдет живая" +
                    "милка, пасть разевая, выгони не раздевая.";

        System.out.println(text + "\n");
        //System.out.println(Arrays.toString(splitParagraph(text)));
        System.out.println(Arrays.toString(splitSentence(text)));
        //System.out.println(Arrays.toString(splitWord(text)));

        Pattern p = Pattern.compile("\\.{3}");
        Matcher m = p.matcher(text);
        System.out.println(m.replaceAll("!"));

    }

    public static String[] splitParagraph(String text){
        Pattern pattern = Pattern.compile("\\n");
        return pattern.split(text);
    }

    public static String[] splitSentence(String text){
        //"[\\.!\\?(\\.\\.\\.)]"
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(text);
        String newText = matcher.replaceAll(" ");
        Pattern pattern1 = Pattern.compile("[\\.{3}!\\?]");
        return pattern1.split(newText);
    }

    public static String[] splitWord(String text){
        Pattern pattern = Pattern.compile("[\\n\\.!\\?,]");
        Matcher matcher = pattern.matcher(text);
        String newText = matcher.replaceAll(" ");
        Pattern pattern1 = Pattern.compile("\\s+");
        return pattern1.split(newText);
    }


}
