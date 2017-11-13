
public class Receiver implements Person {
	String FirstName;
	String LastName;
	String Address;
	String Status;
	
	public Receiver(String FirstName, String LastName, String Status, String Address){
		this.Address = Address;
		this.Status = Status;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	public Receiver(){
		
	}
	
	@Override
	public void setPerson(String FirstName, String LastName, String Status, String Address) {
		this.Address = Address;
		this.Status = Status;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	@Override
	public void setPerson(String FirstName, String LastName, String Status, String Address, String Password) {
		this.Address = Address;
		this.Status = Status;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}

	@Override
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	@Override
	public void setLastName(String LastName) {
		this.LastName = LastName;

	}

	@Override
	public void setStatus(String Status) {
		this.Status = Status;
	}

	@Override
	public void setAddress(String Address) {
		this.Address = Address;

	}
	@Override
	public void setPassword(String Password) /**Wrong for Receiver */{
		
	}
	@Override
	public String getFirstName(){
		return FirstName;
	}
	@Override
	public String getLastName(){
		return LastName;
	}
	@Override
	public String getStatus(){
		return Status;
	}
	@Override
	public String getAddress(){
		return Address;
	}
	@Override
	public String getUserName(){
		return "";
	}
	@Override
	public String getPassword(){
		return "";
	}

}
