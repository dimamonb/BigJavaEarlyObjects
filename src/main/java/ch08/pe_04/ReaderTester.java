package ch08.pe_04;

public class ReaderTester {
    public static void main(String[] args) {
        Reader reader = new Reader();

        reader.next();
        reader.next();

        System.out.println(reader.getCurrent());
        System.out.println(reader.hasMoreElements());
        System.out.println(reader.getCurrent());
        System.out.println(reader.hasMoreElements());
    }
}
