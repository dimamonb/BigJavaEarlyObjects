package ch08.pe_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
    private int counter = 0;
    private Scanner scanner;
    private ArrayList<String> buffer;

    public Reader() {
        scanner = new Scanner(System.in);
        buffer = new ArrayList<>();
    }

    // Checks whether there is another element
    public boolean hasMoreElements() {
        System.out.println(counter);
        return counter != 0;
    }

    // Yields the current element without consuming it
    public String getCurrent() {
        String current = buffer.get(counter-1);
        counter--;
        return current;
    }

    // Consumes the current element
    public void next() {
        String value = scanner.next();
        buffer.add(value);
        counter = buffer.size();
    }
}
