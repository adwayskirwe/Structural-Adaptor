
public class Adaptor implements TargetInterface {
        String bookname;
        int copies;
        public void addBook(String b,int c){
            bookname=b;
            copies=c;
            Adaptee adaptee=new Adaptee();
            adaptee.insertBook(copies,bookname);
        }
}
