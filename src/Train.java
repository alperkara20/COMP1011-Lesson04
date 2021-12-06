
public class Train extends Vehicle implements HasStorage, UsesRoads {

	// INSTANCE VARS +++++++++++++++++++++++++++++
	private Boolean _storageCompartment;
	
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++
	public Train(Boolean storage) {

		this._storageCompartment = storage;
	}

	
	// OVERRIDDEN METHODS ++++++++++++++++++++++++++++++++++
	@Override
	public Boolean usesRoads() {
		
		return (this.getPassengerCount() > 10) ? true : false;
	}

	@Override
	public Boolean hasStorage() {

		return (this._storageCompartment == true) ? true : false;
	}

}
