public class Television extends ServiceCommunicator{
    public Television (String television) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + television);
    }

    public static void main(String[] argv){
        System.out.println(new Television("Martin").get());
    }
}
