package ch10.pp_02;

public class SquareSequence implements Sequence {
    private int n;

    @Override
    public int next() {
        n++;
        return n * n;
    }
}
