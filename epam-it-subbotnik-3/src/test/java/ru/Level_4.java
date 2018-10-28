package ru;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;

import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Rustam_Shavaliev
 */
public class Level_4 {
    @Test
    public void test() {
        final List<Integer> collect = IntStream
                .range(0, 3)
                .boxed()
                .collect(Collectors.toList());
        assertThat(collect, hasSize(3));
        assertThat(collect, containsInAnyOrder(0, 1, 2));

        IntStream
                .range(0, 3)
                .peek(value -> {
                    if (true) throw new IllegalArgumentException();
                });
    }
}
