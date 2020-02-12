package model;

public class User {

	public static final String[] DOCUMENTTYPE = {"Cedula de ciudadania","Tarjeta de identidad", "Registro civil", "Pasaporte", "Cedula de extranjeria"};
	
	private String documentType, id, name, lastName, pNumber,address;

	/**
	 * @param documentType
	 * @param id
	 * @param name
	 * @param lastName
	 * @param pNumber
	 * @param address
	 */
	public User(String documentType, String id, String name, String lastName, String pNumber, String address) {
		super();
		this.documentType = documentType;
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.pNumber = pNumber;
		this.address = address;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	
	
	
}