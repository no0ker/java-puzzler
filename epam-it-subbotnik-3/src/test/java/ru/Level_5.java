package ru;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rustam_Shavaliev
 */
public class Level_5 {
    @Test
    public void test() {
        anotherClass.main(new String[]{});
    }
}

class anotherClass {
    private static final List<String> CITIES = new ArrayList<String>() {
        {
            add("Perm");
            add("Saratov");
            assertNotNull(this);
            assertThat(this.getClass().getSimpleName(), equalTo(""));
            assertThat(this.getClass().toString(), equalTo("class ru.anotherClass$1"));

            assertNull(CITIES);
        }
    };

    static {
        assertNotNull(CITIES);
    }

    public static void main(String[] args) {

    }
}
