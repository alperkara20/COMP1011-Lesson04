/**
 * 
 */

/**
 * @author Alper
 *
 */
public abstract class Vehicle {
	
	// INSTANCE VARIABLES (FIELDS) ++++++++++++++++++++++++
	private int _tireCount; // the underscore in the beginning of a 
							// variable means its a private variable.

	// PROPERTIES ++++++++++++++++++++++++++++++++++++++++++
	private int get_tireCount() {
		return _tireCount;
	}

	private void set_tireCount(int _tireCount) {
		this._tireCount = _tireCount;
	}

	// CONSTRUCTOR 
	public void Vehicle() {
		
	}
	
	// OVERRIDE PUBLIC METHOD toString from superclass Object
	
	@Override
	public String toString() {
		return "El vehiculo tienen " + this._tireCount + " neumaticos.";
	}

}
