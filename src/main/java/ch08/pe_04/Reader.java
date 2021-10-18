package ch08.pe_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private Scanner scanner;
    private ArrayList<String> buffer;

    public Reader() {
        scanner = new Scanner(System.in);
        buffer = new ArrayList<>();
    }

    // Checks whether there is another element
    public boolean hasMoreElements() {
        return !buffer.isEmpty();
    }

    // Yields the current element without consuming it
    public String getCurrent() {
        return buffer.remove(buffer.size()-1);
    }

    // Consumes the current element
    public void next() {
        String value = scanner.next();
        buffer.add(value);
    }
}
