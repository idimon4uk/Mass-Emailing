
interface Person {
	void setPerson(String FirstName, String LastName, String Status, String Address);/**  */
	void setPerson(String FirstName, String LastName, String Status, String Address, String Password);
	void setFirstName(String FirstName);
	void setLastName(String LastName);
	void setStatus(String Status);
	void setAddress(String Address);
	void setPassword(String Password);
	String getFirstName();
	String getLastName();
	String getStatus();
	String getAddress();
	String getUserName();
	String getPassword();
}
