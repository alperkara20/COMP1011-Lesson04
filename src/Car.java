
public class Car extends Vehicle implements HasStorage, UsesRoads {
	
	// INSTANCE VARS +++++++++++++++++++++++++++++
	
	private Boolean _trunk;

	// CONSRRUCTOR +++++++++++++++++++++++++++++++
	public Car(Boolean trunk) {
		this._trunk = trunk;
	}

	// OVERRIDDEN METHODS ++++++++++++++++++++++++++++++++++
	@Override
	public Boolean usesRoads() {

		return (this.getTireCount() > 0) ? true : false;
		
	}

	@Override
	public Boolean hasStorage() {
		
		return (this._trunk == true) ? true : false;
	}

}
