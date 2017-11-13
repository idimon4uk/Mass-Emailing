import java.util.ArrayList;

import javax.mail.Address;

public class AddressBook {
	ArrayList<Receiver> Addresses = new ArrayList<Receiver>();
	void add(String FirstName, String LastName, String Status, String Address){
		Addresses.add(new Receiver(FirstName,LastName,Status,Address));
	}
	void add(Receiver receiver){
		Addresses.add(receiver);
	}
	
	AddressBook choose(String Status){
		AddressBook myBook = new AddressBook();
		for(int i=0;i<Addresses.size();i++)
		{
			if(Addresses.get(i).getStatus() == Status)
			{
				myBook.add(Addresses.get(i));
			}
		}
		return myBook;
	}
	public int size(){
		return Addresses.size();
	}
	Receiver getReceiver(int index){
		return Addresses.get(index);
	}
	
}
