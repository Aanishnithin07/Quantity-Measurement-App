public class QuantityMeasurementAppTest {

    public static void main(String[] args) {
        int failures = 0;
        try {
            testFeetEquality_SameValue();
            System.out.println("testFeetEquality_SameValue passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_SameValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testFeetEquality_DifferentValue();
            System.out.println("testFeetEquality_DifferentValue passed");
        } catch (AssertionError e) {
            System.err.println("testFeetEquality_DifferentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testFeetEquality_NullComparison();
            System.out.println("testFeetEquality_NullComparison passed");
        } catch (AssertionError e) {
            System.err.println("testFeetEquality_NullComparison failed: " + e.getMessage());
            failures++;
        }
        try {
            testFeetEquality_NonNumericInput();
            System.out.println("testFeetEquality_NonNumericInput passed");
        } catch (AssertionError e) {
            System.err.println("testFeetEquality_NonNumericInput failed: " + e.getMessage());
            failures++;
        }
        try {
            testFeetEquality_SameReference();
            System.out.println("testFeetEquality_SameReference passed");
        } catch (AssertionError e) {
            System.err.println("testFeetEquality_SameReference failed: " + e.getMessage());
            failures++;
        }
        // Inches tests
        try {
            testInchesEquality_SameValue();
            System.out.println("testInchesEquality_SameValue passed");
        } catch (AssertionError e) {
            System.err.println("testInchesEquality_SameValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testInchesEquality_DifferentValue();
            System.out.println("testInchesEquality_DifferentValue passed");
        } catch (AssertionError e) {
            System.err.println("testInchesEquality_DifferentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testInchesEquality_NullComparison();
            System.out.println("testInchesEquality_NullComparison passed");
        } catch (AssertionError e) {
            System.err.println("testInchesEquality_NullComparison failed: " + e.getMessage());
            failures++;
        }
        try {
            testInchesEquality_NonNumericInput();
            System.out.println("testInchesEquality_NonNumericInput passed");
        } catch (AssertionError e) {
            System.err.println("testInchesEquality_NonNumericInput failed: " + e.getMessage());
            failures++;
        }
        try {
            testInchesEquality_SameReference();
            System.out.println("testInchesEquality_SameReference passed");
        } catch (AssertionError e) {
            System.err.println("testInchesEquality_SameReference failed: " + e.getMessage());
            failures++;
        }

        // Static compare helper tests
        try {
            testStaticCompareFeet();
            System.out.println("testStaticCompareFeet passed");
        } catch (AssertionError e) {
            System.err.println("testStaticCompareFeet failed: " + e.getMessage());
            failures++;
        }
        try {
            testStaticCompareInches();
            System.out.println("testStaticCompareInches passed");
        } catch (AssertionError e) {
            System.err.println("testStaticCompareInches failed: " + e.getMessage());
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

    // Feet tests
    static void testFeetEquality_SameValue() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(a.equals(b), "1.0 ft should equal 1.0 ft");
        assertTrue(b.equals(a), "Equality should be symmetric");
    }

    static void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        QuantityMeasurementApp.Feet b = new QuantityMeasurementApp.Feet(2.0);
        assertTrue(!a.equals(b), "1.0 ft should not equal 2.0 ft");
    }

    static void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(!a.equals(null), "Object should not equal null");
    }

    static void testFeetEquality_NonNumericInput() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        Object o = "1.0"; // non-numeric object
        assertTrue(!a.equals(o), "Feet should not equal object of different type");
    }

    static void testFeetEquality_SameReference() {
        QuantityMeasurementApp.Feet a = new QuantityMeasurementApp.Feet(1.0);
        assertTrue(a.equals(a), "Reflexive property failed");
    }

    // Inches tests
    static void testInchesEquality_SameValue() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches b = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(a.equals(b), "1.0 in should equal 1.0 in");
        assertTrue(b.equals(a), "Equality should be symmetric");
    }

    static void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        QuantityMeasurementApp.Inches b = new QuantityMeasurementApp.Inches(2.0);
        assertTrue(!a.equals(b), "1.0 in should not equal 2.0 in");
    }

    static void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(!a.equals(null), "Object should not equal null");
    }

    static void testInchesEquality_NonNumericInput() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        Object o = "1.0"; // non-numeric object
        assertTrue(!a.equals(o), "Inches should not equal object of different type");
    }

    static void testInchesEquality_SameReference() {
        QuantityMeasurementApp.Inches a = new QuantityMeasurementApp.Inches(1.0);
        assertTrue(a.equals(a), "Reflexive property failed");
    }

    // Static compare helper tests
    static void testStaticCompareFeet() {
        assertTrue(QuantityMeasurementApp.compareFeet(1.0, 1.0), "compareFeet should return true for equal values");
        assertTrue(!QuantityMeasurementApp.compareFeet(1.0, 2.0), "compareFeet should return false for different values");
    }

    static void testStaticCompareInches() {
        assertTrue(QuantityMeasurementApp.compareInches(1.0, 1.0), "compareInches should return true for equal values");
        assertTrue(!QuantityMeasurementApp.compareInches(1.0, 2.0), "compareInches should return false for different values");
    }
}
