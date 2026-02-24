# QuantityMeasurementApp

> A Java application developed using **Test-Driven Development (TDD)** to progressively design and refine a quantity measurement system. The project emphasizes incremental development, clean object-oriented design, and progressive architectural refactoring to build a flexible and maintainable domain model over time.

---

## 📖 Overview

- Modular Java project focused on modelling multi-category quantity measurements (Length, Weight, Volume, and Temperature).
- Organized around incremental **Use Cases (UCs)** evolving from simple equality checks to a scalable, capability-aware measurement architecture.
- Emphasizes clarity, consistency, and maintainable structure as the system grows.

---

## 🧩 UC1 – Feet Equality

- Implements value-based equality for feet measurements using an overridden `equals()` method.
- Establishes object equality semantics as the foundation for future unit comparisons.

---

## 🧩 UC2 – Inches Equality

- Extends value-based equality comparison to inches measurements using a dedicated `Inches` class.
- Maintains independent unit validation while reinforcing equality behaviour across measurement types.

---

## 🧩 UC3 – Generic Length

- Refactors unit-specific classes into a unified `Length` abstraction using a `LengthUnit` enum.
- Eliminates duplicated logic using the **DRY principle** while enabling cross-unit equality comparison.

---

## 🧩 UC4 – Extended Unit Support

- Adds Yards and Centimeters to the `LengthUnit` enum with conversion factors.
- Demonstrates scalability by enabling seamless cross-unit equality without introducing new classes.

---

## 🧩 UC5 – Unit-to-Unit Conversion

- Introduces explicit conversion operations between supported length units.
- Extends the Length API while preserving mathematical equivalence and precision.

---

## 🧩 UC6 – Length Addition Operation

- Introduces addition between length measurements with automatic unit normalization.
- Returns a new immutable `Length` result while preserving mathematical accuracy.

---

## 🧩 UC7 – Addition with Target Unit Specification

- Allows explicit specification of result units independent of operand units.
- Enhances API flexibility while preserving immutability and precision.

---

## 🧰 Tech Stack

- Java
- Object-Oriented Programming (OOPS)
- Test-Driven Development (TDD)
- JUnit Testing
- Clean Architecture Principles









