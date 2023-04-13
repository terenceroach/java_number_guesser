package java_number_guesser;

import org.junit.Assert;
import org.junit.Test;

public class NumberGuesserTest {
    @Test
    public void testGuessingTooLowReturnsHigher(){
        NumberGuesser game = new NumberGuesser(10);
        Assert.assertEquals("higher", game.guess(5));
    }

    @Test
    public void testGuessingTooHighReturnsLower(){
        NumberGuesser game = new NumberGuesser(10);
        Assert.assertEquals("lower", game.guess(12));
    }

    @Test
    public void testGuessingIsCorrectReturnsCorrect(){
        NumberGuesser game = new NumberGuesser(10);
        Assert.assertEquals("correct", game.guess(10));
    }
}
