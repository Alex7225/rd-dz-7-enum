public class Main {
    public static void main(String[] args) {

        System.out.println("ENUM print:");
        for (CardRank card : CardRank.values()) {
            System.out.println(card);
            System.out.println(card.getId());

        }
        int num = new CountStr().vowel();
        System.out.println("Vowels in this String = " + num);

        new CountStr().firstTree();

        String str = new CountStr().sentr();

        System.out.println("Modified string: " + str);

        StrBuilder out = new StrBuilder();
        System.out.println("String on Upper case:");
        System.out.println(out.appendStr().toUpperCase());

    }
}