Quantity Measurement App — UC1

This folder contains a minimal implementation for UC1 (Feet measurement equality).

Quick commands to compile and run the tests locally:

```bash
# compile
mkdir -p out
javac -d out src/main/java/QuantityMeasurementApp.java src/test/java/QuantityMeasurementAppTest.java

# run tests
java -cp out QuantityMeasurementAppTest
```

Notes:
- This project uses a small, self-contained test harness (no external test frameworks).
- Branching: work for UC1 should be on branch `feature/UC1` per project convention.
