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
        assertThat("1/2==" + 1 / 2, equalTo("1/2==0"));
        assertThat("1/2==" + 1 / 2 == "1/2==0", equalTo(true));
    }
}