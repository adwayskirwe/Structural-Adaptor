
public class Client {
    public static void main(String[] args) {
        TargetInterface tar = new Adaptor();
        tar.addBook("SADP in java", 1);
    }
}
