import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProgrammTest {

    int Feld1[], Feld2[], Feld3[], Feld4[];


    @Before
    public void setUp() throws Exception {
        Feld1 = new int[]{3, 4, 1, 2};
        Feld2 = new int[]{};
        Feld3 = new int[]{1, 3, 3, 2};
        Feld4 = new int[]{1, 2, 3, 4};
    }


    @Test
    public void QuickSort_unsorted() {
        Programm.QuickSort(Feld1);
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, Feld1));
    }

    @Test
    public void Quicksort_empty() {
        Programm.QuickSort(Feld2);
        assertTrue(Arrays.equals(new int[]{}, Feld2));
    }

    @Test
    public void Quicksort_doubles() {
        Programm.QuickSort(Feld3);
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 3}, Feld3));
    }

    @Test
    public void Quicksort_sorted() {
        Programm.QuickSort(Feld3);
        assertTrue(Arrays.equals(new int[]{1, 2, 3, 4}, Feld4));
    }


    @Test
    public void Mitte_test1() {
        assertEquals(2, Programm.IndexVonMitte(Feld1, 0, 3));
    }

    @Test
    public void Mitte_test2() {
        assertEquals(1, Programm.IndexVonMitte(Feld1, 0, 2));
    }

    @Test
    public void Mitte_empty() {
        assertEquals(0, Programm.IndexVonMitte(Feld2, 0, 0));
    }





}
