package org.calvin.String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneCombinationTest {

    private PhoneCombination fixture;

    @BeforeEach
    public void setUp() {
        fixture = new PhoneCombination();
    }

    @Test
    public void shouldComputeLetterCombinations() {
        System.out.println(fixture.letterCombinations("23"));
    }
}