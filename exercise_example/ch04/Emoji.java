public class Emoji {

    void show(String args) {
        System.out.println(args);
    }
    public static void main(String [] args) {
        Emoji emoji = new Emoji();
        emoji.show("\uD83D\uDE00");
        emoji.show("\uD83D\uDCAF");
        emoji.show("\uD83C\uDF36");
    }
}