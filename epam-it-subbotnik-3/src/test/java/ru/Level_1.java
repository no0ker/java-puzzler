package ru;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * @author Rustam_Shavaliev
 */
public class Level_1 {
    @Test
    public void test() {
        final TestInterfaceImpl testInterfaceImpl = new TestInterfaceImpl();
        assertTrue(testInterfaceImpl.equals(testInterfaceImpl));
        assertFalse(testInterfaceImpl.equals(""));
        assertTrue(testInterfaceImpl.equals((Object)""));
    }
}

interface TestInterface {
    default void foo() {
    }

    // default method 'equals' overrides a member of 'java.lang.Object'
    // default boolean equals(Object object) { return true; }
    // default String toString() { return ""; }

    default boolean equals(String object) {
        return false;
    }

    default boolean $equals(String object) {
        return true;
    }

    default boolean _equals(String object) {
        return true;
    }

    static void main(String[] args) {
    }
}

class TestInterfaceImpl implements TestInterface {

}