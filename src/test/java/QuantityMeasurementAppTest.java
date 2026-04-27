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

        // UC6: Addition tests
        try {
            testAddition_SameUnit_FeetPlusFeet();
            System.out.println("testAddition_SameUnit_FeetPlusFeet passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_SameUnit_FeetPlusFeet failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_SameUnit_InchPlusInch();
            System.out.println("testAddition_SameUnit_InchPlusInch passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_SameUnit_InchPlusInch failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_CrossUnit_FeetPlusInches();
            System.out.println("testAddition_CrossUnit_FeetPlusInches passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_CrossUnit_FeetPlusInches failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_CrossUnit_InchPlusFeet();
            System.out.println("testAddition_CrossUnit_InchPlusFeet passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_CrossUnit_InchPlusFeet failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_CrossUnit_YardPlusFeet();
            System.out.println("testAddition_CrossUnit_YardPlusFeet passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_CrossUnit_YardPlusFeet failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_CrossUnit_CentimeterPlusInch();
            System.out.println("testAddition_CrossUnit_CentimeterPlusInch passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_CrossUnit_CentimeterPlusInch failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_Commutativity();
            System.out.println("testAddition_Commutativity passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_Commutativity failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_WithZero();
            System.out.println("testAddition_WithZero passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_WithZero failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_NegativeValues();
            System.out.println("testAddition_NegativeValues passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_NegativeValues failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_NullSecondOperand();
            System.out.println("testAddition_NullSecondOperand passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_NullSecondOperand failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_LargeValues();
            System.out.println("testAddition_LargeValues passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_LargeValues failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_SmallValues();
            System.out.println("testAddition_SmallValues passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_SmallValues failed: " + e.getMessage());
            failures++;
        }

        // UC7: Addition with explicit target unit
        try {
            testAddition_ExplicitTargetUnit_Feet();
            System.out.println("testAddition_ExplicitTargetUnit_Feet passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_Feet failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_Inches();
            System.out.println("testAddition_ExplicitTargetUnit_Inches passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_Inches failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_Yards();
            System.out.println("testAddition_ExplicitTargetUnit_Yards passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_Yards failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_Centimeters();
            System.out.println("testAddition_ExplicitTargetUnit_Centimeters passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_Centimeters failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_SameAsFirstOperand();
            System.out.println("testAddition_ExplicitTargetUnit_SameAsFirstOperand passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_SameAsFirstOperand failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_SameAsSecondOperand();
            System.out.println("testAddition_ExplicitTargetUnit_SameAsSecondOperand passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_SameAsSecondOperand failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_Commutativity();
            System.out.println("testAddition_ExplicitTargetUnit_Commutativity passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_Commutativity failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_WithZero();
            System.out.println("testAddition_ExplicitTargetUnit_WithZero passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_WithZero failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_NegativeValues();
            System.out.println("testAddition_ExplicitTargetUnit_NegativeValues passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_NegativeValues failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_NullTargetUnit();
            System.out.println("testAddition_ExplicitTargetUnit_NullTargetUnit passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_NullTargetUnit failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_LargeToSmallScale();
            System.out.println("testAddition_ExplicitTargetUnit_LargeToSmallScale passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_LargeToSmallScale failed: " + e.getMessage());
            failures++;
        }
        try {
            testAddition_ExplicitTargetUnit_SmallToLargeScale();
            System.out.println("testAddition_ExplicitTargetUnit_SmallToLargeScale passed");
        } catch (AssertionError e) {
            System.err.println("testAddition_ExplicitTargetUnit_SmallToLargeScale failed: " + e.getMessage());
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

    // UC6: Addition test implementations
    static void testAddition_SameUnit_FeetPlusFeet() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 3.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.FEET, "1 ft + 2 ft = 3 ft");
    }

    static void testAddition_SameUnit_InchPlusInch() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(6.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(6.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 12.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.INCH, "6 in + 6 in = 12 in");
    }

    static void testAddition_CrossUnit_FeetPlusInches() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 2.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.FEET, "1 ft + 12 in = 2 ft");
    }

    static void testAddition_CrossUnit_InchPlusFeet() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 24.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.INCH, "12 in + 1 ft = 24 in");
    }

    static void testAddition_CrossUnit_YardPlusFeet() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 2.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.YARD, "1 yd + 3 ft = 2 yd");
    }

    static void testAddition_CrossUnit_CentimeterPlusInch() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETER);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        // Expect ~5.08 cm
        assertTrue(Math.abs(r.getValue() - 5.08) < 1e-3 && r.getUnit() == QuantityMeasurementApp.LengthUnit.CENTIMETER, "2.54 cm + 1 in = ~5.08 cm");
    }

    static void testAddition_Commutativity() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r1 = QuantityMeasurementApp.add(a, b);
        QuantityMeasurementApp.QuantityLength r2 = QuantityMeasurementApp.add(b, a);
        // r1 in feet, r2 in inches
        double r2InFeet = QuantityMeasurementApp.convert(r2.getValue(), r2.getUnit(), QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(Math.abs(r1.getValue() - r2InFeet) < 1e-9, "Addition should be commutative (values equal when converted)");
    }

    static void testAddition_WithZero() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(0.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 5.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.FEET, "5 ft + 0 in = 5 ft");
    }

    static void testAddition_NegativeValues() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(-2.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 3.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.FEET, "5 ft + -2 ft = 3 ft");
    }

    static void testAddition_NullSecondOperand() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.add(new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET), null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Null second operand should throw IllegalArgumentException");
    }

    static void testAddition_LargeValues() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1e6, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1e6, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 2e6) < 1e-3, "Large value addition should work");
    }

    static void testAddition_SmallValues() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(0.001, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(0.002, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b);
        assertTrue(Math.abs(r.getValue() - 0.003) < 1e-9, "Small value addition should work");
    }

    // UC7: Addition with explicit target unit - tests
    static void testAddition_ExplicitTargetUnit_Feet() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(Math.abs(r.getValue() - 2.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.FEET, "1 ft + 12 in = 2 ft (target ft)");
    }

    static void testAddition_ExplicitTargetUnit_Inches() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Math.abs(r.getValue() - 24.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.INCH, "1 ft + 12 in = 24 in (target in)");
    }

    static void testAddition_ExplicitTargetUnit_Yards() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.YARD);
        double expected = 2.0 / 3.0; // 2 ft = 0.666...
        assertTrue(Math.abs(r.getValue() - expected) < 1e-6 && r.getUnit() == QuantityMeasurementApp.LengthUnit.YARD, "1 ft + 12 in = ~0.667 yd (target yd)");
    }

    static void testAddition_ExplicitTargetUnit_Centimeters() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.CENTIMETER);
        assertTrue(Math.abs(r.getValue() - 5.08) < 1e-3 && r.getUnit() == QuantityMeasurementApp.LengthUnit.CENTIMETER, "1 in + 1 in = ~5.08 cm (target cm)");
    }

    static void testAddition_ExplicitTargetUnit_SameAsFirstOperand() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(Math.abs(r.getValue() - 3.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.YARD, "2 yd + 3 ft = 3 yd (target yd)");
    }

    static void testAddition_ExplicitTargetUnit_SameAsSecondOperand() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(2.0, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(3.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.FEET);
        assertTrue(Math.abs(r.getValue() - 9.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.FEET, "2 yd + 3 ft = 9 ft (target ft)");
    }

    static void testAddition_ExplicitTargetUnit_Commutativity() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r1 = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.YARD);
        QuantityMeasurementApp.QuantityLength r2 = QuantityMeasurementApp.add(b, a, QuantityMeasurementApp.LengthUnit.YARD);
        assertTrue(Math.abs(r1.getValue() - r2.getValue()) < 1e-9 && r1.getUnit() == r2.getUnit(), "Addition with explicit target unit should be commutative");
    }

    static void testAddition_ExplicitTargetUnit_WithZero() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(0.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.YARD);
        double expected = 5.0 / 3.0; // 1.666...
        assertTrue(Math.abs(r.getValue() - expected) < 1e-6 && r.getUnit() == QuantityMeasurementApp.LengthUnit.YARD, "5 ft + 0 in = ~1.667 yd (target yd)");
    }

    static void testAddition_ExplicitTargetUnit_NegativeValues() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(5.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(-2.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Math.abs(r.getValue() - 36.0) < 1e-9 && r.getUnit() == QuantityMeasurementApp.LengthUnit.INCH, "5 ft + -2 ft = 36 in (target in)");
    }

    static void testAddition_ExplicitTargetUnit_NullTargetUnit() {
        boolean thrown = false;
        try {
            QuantityMeasurementApp.add(new QuantityMeasurementApp.QuantityLength(1.0, QuantityMeasurementApp.LengthUnit.FEET), new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH), null);
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        assertTrue(thrown, "Null target unit should throw IllegalArgumentException");
    }

    static void testAddition_ExplicitTargetUnit_LargeToSmallScale() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(1000.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(500.0, QuantityMeasurementApp.LengthUnit.FEET);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.INCH);
        assertTrue(Math.abs(r.getValue() - 18000.0) < 1e-6 && r.getUnit() == QuantityMeasurementApp.LengthUnit.INCH, "1000 ft + 500 ft = 18000 in (target in)");
    }

    static void testAddition_ExplicitTargetUnit_SmallToLargeScale() {
        QuantityMeasurementApp.QuantityLength a = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength b = new QuantityMeasurementApp.QuantityLength(12.0, QuantityMeasurementApp.LengthUnit.INCH);
        QuantityMeasurementApp.QuantityLength r = QuantityMeasurementApp.add(a, b, QuantityMeasurementApp.LengthUnit.YARD);
        double expected = 24.0 / 36.0; // 2/3
        assertTrue(Math.abs(r.getValue() - expected) < 1e-6 && r.getUnit() == QuantityMeasurementApp.LengthUnit.YARD, "24 in = ~0.667 yd (target yd)");
    }
}
