package ss8_clean_code.thuc_hanh.thuc_hanh_3_cylinder_refactoring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCylinder {
    @Test
    @DisplayName("Testing getVolume(0, 0)")
    private void assertEquals(double expected, double result) {
    }

    void testGetVolume0And0() {
        int radius = 0;
        int height = 0;
        double expected = 0;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing getVolume(1, 2)")
    void testGetVolume1And2() {
        int radius = 1;
        int height = 2;
        double expected = 18.84955592153876;

        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result);
    }
}
