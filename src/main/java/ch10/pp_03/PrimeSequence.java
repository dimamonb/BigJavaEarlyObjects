package ch10.pp_03;

public class PrimeSequence implements Sequence {
    private int p;


    @Override
    public int next() {
        int prime = 0;
        p++;
        if (isPrime(p) && p != 0 ) prime = p;
        return prime;
    }

    private boolean isPrime(int digit) {
        if (digit <= 0) {
            return false;
        }
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }
}
