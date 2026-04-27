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

        // Cross-unit tests
        try {
            testCrossUnitEquality_SameValue();
            System.out.println("testCrossUnitEquality_SameValue passed");
        } catch (AssertionError e) {
            System.err.println("testCrossUnitEquality_SameValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testCrossUnitEquality_DifferentValue();
            System.out.println("testCrossUnitEquality_DifferentValue passed");
        } catch (AssertionError e) {
            System.err.println("testCrossUnitEquality_DifferentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testCrossUnit_InvalidUnit();
            System.out.println("testCrossUnit_InvalidUnit passed");
        } catch (AssertionError e) {
            System.err.println("testCrossUnit_InvalidUnit failed: " + e.getMessage());
            failures++;
        }

        // Yard and centimeter tests
        try {
            testYardEquality_SameValue();
            System.out.println("testYardEquality_SameValue passed");
        } catch (AssertionError e) {
            System.err.println("testYardEquality_SameValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testYardEquality_DifferentValue();
            System.out.println("testYardEquality_DifferentValue passed");
        } catch (AssertionError e) {
            System.err.println("testYardEquality_DifferentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testYardToFeet_EquivalentValue();
            System.out.println("testYardToFeet_EquivalentValue passed");
        } catch (AssertionError e) {
            System.err.println("testYardToFeet_EquivalentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testYardToInches_EquivalentValue();
            System.out.println("testYardToInches_EquivalentValue passed");
        } catch (AssertionError e) {
            System.err.println("testYardToInches_EquivalentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testYardToFeet_NonEquivalentValue();
            System.out.println("testYardToFeet_NonEquivalentValue passed");
        } catch (AssertionError e) {
            System.err.println("testYardToFeet_NonEquivalentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testCentimetersToInches_EquivalentValue();
            System.out.println("testCentimetersToInches_EquivalentValue passed");
        } catch (AssertionError e) {
            System.err.println("testCentimetersToInches_EquivalentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testCentimetersToFeet_NonEquivalentValue();
            System.out.println("testCentimetersToFeet_NonEquivalentValue passed");
        } catch (AssertionError e) {
            System.err.println("testCentimetersToFeet_NonEquivalentValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testMultiUnit_TransitiveProperty();
            System.out.println("testMultiUnit_TransitiveProperty passed");
        } catch (AssertionError e) {
            System.err.println("testMultiUnit_TransitiveProperty failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_YardWithNullUnit();
            System.out.println("testEquality_YardWithNullUnit passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_YardWithNullUnit failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_YardSameReference();
            System.out.println("testEquality_YardSameReference passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_YardSameReference failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_YardNullComparison();
            System.out.println("testEquality_YardNullComparison passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_YardNullComparison failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_CentimetersWithNullUnit();
            System.out.println("testEquality_CentimetersWithNullUnit passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_CentimetersWithNullUnit failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_CentimetersSameReference();
            System.out.println("testEquality_CentimetersSameReference passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_CentimetersSameReference failed: " + e.getMessage());
            failures++;
        }
        try {
            testEquality_CentimetersNullComparison();
            System.out.println("testEquality_CentimetersNullComparison passed");
        } catch (AssertionError e) {
            System.err.println("testEquality_CentimetersNullComparison failed: " + e.getMessage());
            failures++;
        }

        // Conversion tests (UC5)
        try {
            testConversion_FeetToInches();
            System.out.println("testConversion_FeetToInches passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_FeetToInches failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_InchesToFeet();
            System.out.println("testConversion_InchesToFeet passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_InchesToFeet failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_YardsToInches();
            System.out.println("testConversion_YardsToInches passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_YardsToInches failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_InchesToYards();
            System.out.println("testConversion_InchesToYards passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_InchesToYards failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_CentimetersToInches();
            System.out.println("testConversion_CentimetersToInches passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_CentimetersToInches failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_FeetToYard();
            System.out.println("testConversion_FeetToYard passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_FeetToYard failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_RoundTrip_PreservesValue();
            System.out.println("testConversion_RoundTrip_PreservesValue passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_RoundTrip_PreservesValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_ZeroValue();
            System.out.println("testConversion_ZeroValue passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_ZeroValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_NegativeValue();
            System.out.println("testConversion_NegativeValue passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_NegativeValue failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_InvalidUnit_Throws();
            System.out.println("testConversion_InvalidUnit_Throws passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_InvalidUnit_Throws failed: " + e.getMessage());
            failures++;
        }
        try {
            testConversion_NaNOrInfinite_Throws();
            System.out.println("testConversion_NaNOrInfinite_Throws passed");
        } catch (AssertionError e) {
            System.err.println("testConversion_NaNOrInfinite_Throws failed: " + e.getMessage());
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
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(a.equals(b), "1.0 ft should equal 1.0 ft");
        assertTrue(b.equals(a), "Equality should be symmetric");
    }

    static void testFeetEquality_DifferentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(!a.equals(b), "1.0 ft should not equal 2.0 ft");
    }

    static void testFeetEquality_NullComparison() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(!a.equals(null), "Object should not equal null");
    }

    static void testFeetEquality_NonNumericInput() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        Object o = "1.0"; // non-numeric object
        assertTrue(!a.equals(o), "Feet should not equal object of different type");
    }

    static void testFeetEquality_SameReference() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(a.equals(a), "Reflexive property failed");
    }

    // Inches tests
    static void testInchesEquality_SameValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(a.equals(b), "1.0 in should equal 1.0 in");
        assertTrue(b.equals(a), "Equality should be symmetric");
    }

    static void testInchesEquality_DifferentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(!a.equals(b), "1.0 in should not equal 2.0 in");
    }

    static void testInchesEquality_NullComparison() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(!a.equals(null), "Object should not equal null");
    }

    static void testInchesEquality_NonNumericInput() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        Object o = "1.0"; // non-numeric object
        assertTrue(!a.equals(o), "Inches should not equal object of different type");
    }

    static void testInchesEquality_SameReference() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(a.equals(a), "Reflexive property failed");
    }

    // Yard tests
    static void testYardEquality_SameValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(a.equals(b), "1.0 yd should equal 1.0 yd");
    }

    static void testYardEquality_DifferentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(!a.equals(b), "1.0 yd should not equal 2.0 yd");
    }

    static void testYardToFeet_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(a.equals(b), "1.0 yd should equal 3.0 ft");
        assertTrue(b.equals(a), "Symmetric equality should hold");
    }

    static void testYardToInches_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(a.equals(b), "1.0 yd should equal 36.0 in");
    }

    static void testYardToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(!a.equals(b), "1.0 yd should not equal 2.0 ft");
    }

    // Centimeter tests
    static void testCentimetersToInches_EquivalentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETER);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(0.393701, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(a.equals(b), "1.0 cm should equal 0.393701 in");
    }

    static void testCentimetersToFeet_NonEquivalentValue() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETER);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(!a.equals(b), "1.0 cm should not equal 1.0 ft");
    }

    static void testMultiUnit_TransitiveProperty() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength c = new QuantityMeasurementApp.QuantityLength(36.0, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(a.equals(b), "1 yd == 3 ft");
        assertTrue(b.equals(c), "3 ft == 36 in");
        assertTrue(a.equals(c), "Transitive: 1 yd == 36 in");
    }

    static void testEquality_YardWithNullUnit() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.compare(1.0, null, 1.0, "in");
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Null unit should throw IllegalArgumentException");
    }

    static void testEquality_YardSameReference() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(a.equals(a), "Reflexive property failed");
    }

    static void testEquality_YardNullComparison() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(!a.equals(null), "Object should not equal null");
    }

    static void testEquality_CentimetersWithNullUnit() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.compare(1.0, "cm", 1.0, null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Null unit should throw IllegalArgumentException");
    }

    static void testEquality_CentimetersSameReference() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETER);
        assertTrue(a.equals(a), "Reflexive property failed");
    }

    static void testEquality_CentimetersNullComparison() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.CENTIMETER);
        assertTrue(!a.equals(null), "Object should not equal null");
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

    // Cross-unit tests
    static void testCrossUnitEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.compare(1.0, "ft", 12.0, "in"), "1 ft should equal 12 in");
        assertTrue(QuantityMeasurementApp.compare(12.0, "in", 1.0, "ft"), "12 in should equal 1 ft");
    }

    static void testCrossUnitEquality_DifferentValue() {
        assertTrue(!QuantityMeasurementApp.compare(1.0, "ft", 11.0, "in"), "1 ft should not equal 11 in");
    }

    static void testCrossUnit_InvalidUnit() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.compare(1.0, "meter", 100.0, "cm");
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Unknown unit should throw IllegalArgumentException");
    }

    // UC5 Conversion tests
    static void testConversion_FeetToInches() {
        double out = QuantityMeasurementApp.convert(1.0, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Double.compare(out, 12.0) == 0, "1 ft -> 12 in");
    }

    static void testConversion_InchesToFeet() {
        double out = QuantityMeasurementApp.convert(24.0, QuantityMeasurementApp.LengthUnit.INCH, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(Double.compare(out, 2.0) == 0, "24 in -> 2 ft");
    }

    static void testConversion_YardsToInches() {
        double out = QuantityMeasurementApp.convert(1.0, QuantityMeasurementApp.LengthUnit.YARD, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Double.compare(out, 36.0) == 0, "1 yd -> 36 in");
    }

    static void testConversion_InchesToYards() {
        double out = QuantityMeasurementApp.convert(72.0, QuantityMeasurementApp.LengthUnit.INCH, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(Double.compare(out, 2.0) == 0, "72 in -> 2 yd");
    }

    static void testConversion_CentimetersToInches() {
        double out = QuantityMeasurementApp.convert(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETER, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Math.abs(out - 1.0) < 1e-6, "2.54 cm -> ~1 in");
    }

    static void testConversion_FeetToYard() {
        double out = QuantityMeasurementApp.convert(6.0, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(Math.abs(out - 2.0) < 1e-9, "6 ft -> 2 yd");
    }

    static void testConversion_RoundTrip_PreservesValue() {
        double v = 5.5;
        double a = QuantityMeasurementApp.convert(v, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.INCH);
        double b = QuantityMeasurementApp.convert(a, QuantityMeasurementApp.LengthUnit.INCH, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(Math.abs(b - v) < 1e-9, "Round-trip preserves value within epsilon");
    }

    static void testConversion_ZeroValue() {
        double out = QuantityMeasurementApp.convert(0.0, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Double.compare(out, 0.0) == 0, "0 ft -> 0 in");
    }

    static void testConversion_NegativeValue() {
        double out = QuantityMeasurementApp.convert(-1.0, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Double.compare(out, -12.0) == 0, "-1 ft -> -12 in");
    }

    static void testConversion_InvalidUnit_Throws() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.convert(1.0, null, QuantityMeasurementApp.LengthUnit.INCH);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Null source unit should throw IllegalArgumentException");
    }

    static void testConversion_NaNOrInfinite_Throws() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.convert(Double.NaN, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.INCH);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "NaN should throw IllegalArgumentException");
        thrown = false;
        try {
            QuantityMeasurementApp.convert(Double.POSITIVE_INFINITY, QuantityMeasurementApp.LengthUnit.FEET, QuantityMeasurementApp.LengthUnit.INCH);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Infinity should throw IllegalArgumentException");
    }
}
