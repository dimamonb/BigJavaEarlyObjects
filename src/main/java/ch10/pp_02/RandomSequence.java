package ch10.pp_02;

public class RandomSequence implements Sequence {
    @Override
    public int next() {
        return (int) (Integer.MAX_VALUE * Math.random());
    }
}
