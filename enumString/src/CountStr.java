public class CountStr {
    public String inputWord = "I would like to have a dog";
    public String[] wordArray = sentr().split(" ");


    public String sentr() {
        return inputWord.toLowerCase().replace("dog", "cat");
    }

    public int vowel() {
        int count = 0;
        for (int i = 0; i < sentr().length(); i++) {
            char elementOfChar = sentr().charAt(i);
            if (sentr().charAt(i) == 'a' | sentr().charAt(i) == 'e' | sentr().charAt(i) == 'i' | sentr().charAt(i) == 'o' | sentr().charAt(i) == 'u') {
                count++;
            }

        }
        return count;
    }

    public void firstTree() {
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].length() > 3) {
                System.out.println(wordArray[i].substring(0, 3));
                i = wordArray.length;
            } else {
                System.out.println("This word contains less 3 symbols, we go to the next word!");
            }
        }
    }

}
