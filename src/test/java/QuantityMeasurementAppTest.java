public class QuantityMeasurementAppTest {

    public static void main(String[] args) {
        int failures = 0;
        try {
            testEquality_SameValue();
            System.out.println("testEquality_SameValue passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_SameValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_DifferentValue();
            System.out.println("testEquality_DifferentValue passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_DifferentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_NullComparison();
            System.out.println("testEquality_NullComparison passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_NullComparison failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_NonNumericInput();
            System.out.println("testEquality_NonNumericInput passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_NonNumericInput failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_SameReference();
            System.out.println("testEquality_SameReference passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_SameReference failed: " + e.getMessage());
            failures++;
        }

        if (failures == 0) {
            System.out.println("ALL TESTS PASSED");
        } else {
            System.err.println(failures + " test(s) failed");
            System.exit(1);
        }
    }

    private static void assertTrue(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }

    static void testEquality_SameValue() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(a.equals(b), "1.0 ft should equal 1.0 ft");
        assertTrue(b.equals(a), "Equality should be symmetric");
    }

    static void testEquality_DifferentValue() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(2.0);
        assertTrue(!a.equals(b), "1.0 ft should not equal 2.0 ft");
    }

    static void testEquality_NullComparison() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(!a.equals(null), "Object should not equal null");
    }

    static void testEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        Object o = "1.0"; // non-numeric object
        assertTrue(!a.equals(o), "Feet should not equal object of different type");
    }

    static void testEquality_SameReference() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(a.equals(a), "Reflexive property failed");
    }
}
