package ch10.workedexample;

public class RandomSequence implements Sequence {
    @Override
    public int next() {
        return (int) (Integer.MAX_VALUE * Math.random());
    }
}
