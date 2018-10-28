package ru;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

/**
 * @author Rustam_Shavaliev
 */
public class Level_3 {
    @Test
    public void test() {
        assertThat(
                "1/2==" + 1 / 2 == "1/2==0",
                equalTo(true));
        assertThat(
                new String("111") == "111",
                equalTo(false));
        assertThat(
                new String("111").intern() == "111",
                equalTo(true));
        assertThat(
                "1" + "1" + "1" == "111",
                equalTo(true));
    }
}