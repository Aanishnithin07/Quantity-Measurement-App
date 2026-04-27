public class QuantityMeasurementApp {

    public enum LengthUnit {
        INCH(1.0, "in", "inch", "inches"),
        FEET(12.0, "ft", "feet", "foot"),
        YARD(36.0, "yd", "yard", "yards"),
        CENTIMETER(0.393701, "cm", "centimeter", "centimeters");

        private final double inchesPerUnit;
        private final String[] aliases;

        LengthUnit(double inchesPerUnit, String... aliases) {
            this.inchesPerUnit = inchesPerUnit;
            this.aliases = aliases;
        }

        public double toInches(double value) {
            return value * inchesPerUnit;
        }

        public double getInchesPerUnit() {
            return inchesPerUnit;
        }

        public static LengthUnit parse(String unit) {
            if (unit == null) throw new IllegalArgumentException("unit is null");
            String u = unit.trim().toLowerCase();
            for (LengthUnit lu : values()) {
                if (lu.name().toLowerCase().equals(u)) return lu;
                for (String a : lu.aliases) if (a.equals(u)) return lu;
            }
            throw new IllegalArgumentException("Unknown unit: " + unit);
        }
    }

    public static final class QuantityLength {
        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit) {
            if (unit == null) throw new IllegalArgumentException("unit is null");
            this.value = value;
            this.unit = unit;
        }

        public double toInches() {
            return unit.toInches(value);
        }

        public QuantityLength convertTo(LengthUnit target) {
            double converted = QuantityMeasurementApp.convert(this.value, this.unit, target);
            return new QuantityLength(converted, target);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            QuantityLength other = (QuantityLength) obj;
            return Double.compare(this.toInches(), other.toInches()) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(toInches());
        }

        @Override
        public String toString() {
            return value + " " + unit.name();
        }

        public double getValue() { return value; }
        public LengthUnit getUnit() { return unit; }
    }

    // Backwards-compatible helpers
    public static boolean compareFeet(double a, double b) {
        return new QuantityLength(a, LengthUnit.FEET).equals(new QuantityLength(b, LengthUnit.FEET));
    }

    public static boolean compareInches(double a, double b) {
        return new QuantityLength(a, LengthUnit.INCH).equals(new QuantityLength(b, LengthUnit.INCH));
    }

    public static boolean compare(double value1, String unit1, double value2, String unit2) {
        LengthUnit u1 = LengthUnit.parse(unit1);
        LengthUnit u2 = LengthUnit.parse(unit2);
        return new QuantityLength(value1, u1).equals(new QuantityLength(value2, u2));
    }

    /**
     * Convert a numeric value from source unit to target unit.
     * @param value source numeric value
     * @param source source unit (non-null)
     * @param target target unit (non-null)
     * @return converted numeric value in target unit
     * @throws IllegalArgumentException for invalid inputs (null units, NaN, infinite)
     */
    public static double convert(double value, LengthUnit source, LengthUnit target) {
        if (source == null || target == null) throw new IllegalArgumentException("source and target units must be non-null");
        if (!Double.isFinite(value)) throw new IllegalArgumentException("value must be a finite number");
        // normalize to inches then to target
        double inches = source.toInches(value);
        return inches / target.getInchesPerUnit();
    }

    public static void main(String[] args) {
        QuantityLength f1 = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength f2 = new QuantityLength(1.0, LengthUnit.FEET);
        System.out.println("Feet Input: " + f1 + " and " + f2);
        System.out.println("Feet Equal: " + compareFeet(f1.getValue(), f2.getValue()));

        QuantityLength i1 = new QuantityLength(1.0, LengthUnit.INCH);
        QuantityLength i2 = new QuantityLength(1.0, LengthUnit.INCH);
        System.out.println("Inches Input: " + i1 + " and " + i2);
        System.out.println("Inches Equal: " + compareInches(i1.getValue(), i2.getValue()));

        // Cross-unit demonstrations
        System.out.println("Cross-unit 1 yd vs 36 in: " + compare(1.0, "yd", 36.0, "in"));
        System.out.println("Cross-unit 1 cm vs 0.393701 in: " + compare(1.0, "cm", 0.393701, "in"));
    }
}
