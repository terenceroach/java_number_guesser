package java_number_guesser;

public class NumberGuesser {

    Integer num;

    public NumberGuesser(Integer num){
        this.num = num;
    }

    public String guess(Integer guessNum) {
        if (guessNum < this.num) {
            return "higher";
        } else if (guessNum > this.num) {
            return "lower";
        } else {
            return "correct";
        }
    }
}
