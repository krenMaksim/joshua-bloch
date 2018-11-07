package joshua.bloch.thirdedition.article48;

import java.math.BigInteger;
import java.util.stream.Stream;

public class MainTest {

    static final BigInteger TWO = new BigInteger("2");

    static final BigInteger ONE = new BigInteger("1");

    public static void main(String[] args) {

	primes().map(p -> TWO.pow(p.intValueExact())
	                     .subtract(ONE))
	        .filter(mersenne -> mersenne.isProbablePrime(50))
	        .limit(20)
	        .forEach(System.out::println);
    }

    static Stream<BigInteger> primes() {
	return Stream.iterate(TWO, BigInteger::nextProbablePrime);
    }

}
