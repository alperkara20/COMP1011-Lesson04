/**
 * @author Alper
 *
 */
public abstract class Vehicle {
	
	// INSTANCE VARIABLES (FIELDS) ++++++++++++++++++++++++
	private int _tireCount; // the underscore in the beginning of a 
							// variable means its a private variable.
	private int _passengerCount;

	// PROPERTIES ++++++++++++++++++++++++++++++++++++++++++
	public int getTireCount() {
		return _tireCount;
	}

	public void setTireCount(int _tireCount) {
		this._tireCount = _tireCount;
	}

	public int getPassengerCount() {
		return _passengerCount;
	}

	public void setPassengerCount(int _passengerCount) {
		this._passengerCount = _passengerCount;
	}
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++
	public void Vehicle() {
		
	}
	
	// OVERRIDE PUBLIC METHOD toString from superclass Object
	
	@Override
	public String toString() {
		return "El vehiculo tienen " + this._tireCount + " neumaticos.";
	}

	

}
