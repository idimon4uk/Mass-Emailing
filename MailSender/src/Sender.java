
public class Sender implements Person {

	String FirstName;
	String LastName;
	String Address;
	String Status;
	String Password;
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
		this.Password = Password;
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
	public void setPassword(String Password) /**Wrong for Receiver */
	{
		this.Password = Password;
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
		String result = "";
		char[] address = Address.toCharArray();
		for(int i =0;i<address.length;i++)
		{
			if(address[i]=='@')
			{
			 break;
			}
			result+=address[i];
		}
		return result;
	}
	@Override
	public String getPassword(){
		return Password;
	}
}
