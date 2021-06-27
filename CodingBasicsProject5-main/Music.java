public class Music extends ServiceCommunicator {
    public Music(String music) {
        super("https://itunes.apple.com/search?term=" + music + "\\&limit=1"
        );
    }

    public static void main(String[] argv) {
        System.out.println(new Music("A-Love-Supreme").get());

    }
}