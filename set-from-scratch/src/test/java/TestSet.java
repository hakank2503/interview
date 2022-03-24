import interview.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestSet {

    private Set set;

    @BeforeEach
    void setUp() {
        set = new Set();
    }

    @Test
    public void should_be_empty_when_initialized(){
        assertTrue(set.isEmpty());
    }

    @Test
    public void should_not_be_empty_when_added(){
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    public void should_contain_element_when_added(){
        set.add(1);
        assertTrue(set.contains(1));
    }

    @Test
    public void should_not_contain__irrelevant_element(){
        set.add(1);
        assertTrue(set.contains(1));
        assertFalse(set.contains(2));    }

    @Test
    public void should_reflect_size_when_added(){
        set.add(1);
        set.add(2);
        assertTrue(!set.isEmpty());
        assertTrue(set.contains(1));
        assertTrue(set.contains(2));
        assertEquals(2, set.size());
    }

    @Test
    public void should_shrink_when_added_multiple_elements(){
        Set set = new Set();
        for (int i = 0; i < 100; i++) {
            set.add(i);
        }
        assertEquals(100, set.size());
    }

    @Test
    public void should_reflect_when_removed_element(){
        Set set = new Set();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        set.remove(2);
        assertEquals(3, set.size());

    }

    @Test
    public void should_not_add_when_same_element(){
        Set set = new Set();
        set.add(1);
        set.add(1);
        assertEquals(1, set.size());
    }

    @Test
    public void should_define_type_when_initialize(){
        Set<Integer> set = new Set<>();
        set.add(1);
        set.add(1);
        assertEquals(1, set.size());

    }
}
