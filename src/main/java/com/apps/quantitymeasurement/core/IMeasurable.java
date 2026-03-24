package com.apps.quantitymeasurement.core;

public interface IMeasurable {
	double getConversionFactor();

	// Convert value in this unit to base unit
	double convertToBaseUnit(double value);

	// Convert value from base unit to this unit
	double convertFromBaseUnit(double baseValue);

	String getUnitName();

	// By default, all units support arithmetic
	SupportsArithmetic supportsArithmetic = () -> true;

	default boolean supportsArithmetic() {
		return supportsArithmetic.isSupported();
	}

	 /*
     * Default validation method.
     * Units that do NOT support arithmetic (Temperature) will override this.
     */
	default void validateOperationSupport(String operation) {
        if(!supportsArithmetic()) {
            throw new UnsupportedOperationException(
                operation + " is not supported for unit: " + getUnitName()
            );
        }
    }
}
