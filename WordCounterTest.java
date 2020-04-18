package main.java.leapyear.wordCounter;

import org.junit.Test;
import static org.junit.Assert.*;

public class WordCounterTest {
   WordCounter counter =  new WordCounter();

    @Test
    public void emptyStringHasWords(){
        counter.add("");
        assertEquals(0, counter.getUniqueWordsCount());
    }

    @Test
    public void singleWordStringHasOneWord(){
        counter.add("Hello");
        assertEquals(1, counter.getUniqueWordsCount());
    }

    @Test
    public void twoWordStringHasTwoWords(){
        counter.add("Hello");
        counter.add("World");

        assertEquals(2, counter.getUniqueWordsCount());
    }

    @Test
    public void multiWordStringHasCorrectWordCount(){
        counter.add("One Two three");
        assertEquals(3, counter.getUniqueWordsCount());
    }

    @Test
    public void spacedOutMultiWordStringHasCorrectWordCount(){
        counter.add("       One     Two three       ");
        assertEquals(3, counter.getUniqueWordsCount());
    }

    @Test
    public void severalMultiWordStringHasCorrectWordCount(){
        counter.add("One Two three");
        counter.add("Four Five Six");

        assertEquals(6, counter.getUniqueWordsCount());
    }

    @Test
    public void inputWithDuplicatesCountsOnlyIndiviualCases(){
        counter.add("Nine Nine Nine");
        assertEquals(1, counter.getUniqueWordsCount());
    }

    @Test
    public void inputWithMixedCaseDuplicatesCountsOnlyIndiviualCases(){
        counter.add("Nine nine NINE ");
        assertEquals(1, counter.getUniqueWordsCount());
    }

    @Test
    public void inputWithPunctuationStillSpotsDuplicates(){
        counter.add("Nine.");
        counter.add("Nine ten.");
        counter.add("Nine, ten, eleven.");

        assertEquals(3, counter.getUniqueWordsCount() );
    }


}

