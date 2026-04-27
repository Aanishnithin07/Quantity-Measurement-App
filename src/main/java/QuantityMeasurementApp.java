public class QuantityMeasurementApp {
    public static final class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " ft";
        }

        public double getValue() {
            return value;
        }
    }

    public static final class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }

        @Override
        public String toString() {
            return value + " in";
        }

        public double getValue() {
            return value;
        }
    }

    // Convenience static methods to compare same-unit quantities
    public static boolean compareFeet(double a, double b) {
        return new Feet(a).equals(new Feet(b));
    }

    public static boolean compareInches(double a, double b) {
        return new Inches(a).equals(new Inches(b));
    }

    /**
     * Compare two quantities that may use different units (ft/in).
     * Supported units: ft, feet, foot, in, inch, inches (case-insensitive).
     */
    public static boolean compare(double value1, String unit1, double value2, String unit2) {
        double v1 = toInches(value1, unit1);
        double v2 = toInches(value2, unit2);
        return Double.compare(v1, v2) == 0;
    }

    private static double toInches(double value, String unit) {
        if (unit == null) throw new IllegalArgumentException("unit is null");
        String u = unit.trim().toLowerCase();
        if (u.equals("ft") || u.equals("feet") || u.equals("foot")) return value * 12.0;
        if (u.equals("in") || u.equals("inch") || u.equals("inches")) return value;
        throw new IllegalArgumentException("Unknown unit: " + unit);
    }

    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);
        System.out.println("Feet Input: " + f1 + " and " + f2);
        System.out.println("Feet Equal: " + compareFeet(f1.getValue(), f2.getValue()));

        Inches i1 = new Inches(1.0);
        Inches i2 = new Inches(1.0);
        System.out.println("Inches Input: " + i1 + " and " + i2);
        System.out.println("Inches Equal: " + compareInches(i1.getValue(), i2.getValue()));

        // Cross-unit demonstrations
        System.out.println("Cross-unit 1 ft vs 12 in: " + compare(1.0, "ft", 12.0, "in"));
        System.out.println("Cross-unit 1 ft vs 11 in: " + compare(1.0, "ft", 11.0, "in"));
    }
}
