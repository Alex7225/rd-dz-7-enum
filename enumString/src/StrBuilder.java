public class StrBuilder {
    StringBuilder str1 = new StringBuilder();
    CountStr arrWord = new CountStr();

    public String appendStr() {
        for (int i = 0; i < arrWord.wordArray.length; i++) {
            str1.append(arrWord.wordArray[i]);
            str1.append(" ");
        }
        return str1.toString();
    }
}