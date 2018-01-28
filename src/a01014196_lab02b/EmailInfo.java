/**
 * 
 */

import java.util.HashMap;
/**
 * @author a01014196 Mary Lee
 * A class which stores names and corresponding email addresses.
 *
 */
public class EmailInfo {
	private HashMap<String, String> addressBook;
	
	/**
	 *	Default constructor initializes HashMap addressBook.
	 */
	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}

	/**
	 * 
	 * @param name	A String containing the friend's name.
	 * @return	The properly formatted name.
	 */
	private String formatName(String name) {
	       String first = "";
	       String rest = "";
	       if(name != null && name.length() > 0) {
	           first = name.substring(0,1).toUpperCase(); // get first letter
	           if(name.length() > 1) {
	                rest = name.substring(1).toLowerCase(); // get the rest
	           }
	       } 
	       return first + rest;
	}
	
	/**
	 * 
	 * @param name	A string containing the name of friend.
	 * @param email	A string containing the email address of friend.
	 */
	public void addFriend(String name, String email) {
		if (name != null && email != null) {
			addressBook.put(formatName(name), email);
		}
	}
	
	/**
	 * 
	 * @param name	A string containing the name of friend to remove from addressBook.
	 */
	public void removeFriend(String name) {
		if (name != null) {
			String removeName = formatName(name);
			addressBook.remove(removeName);
		}
	}
	
	/**
	 * 
	 * @param name	A string containing the name of friend.
	 * @return	A string of friend's email address.
	 */
	public String getAddress(String name) {
		String getName = formatName(name);
		System.out.println("The email you were looking for:" + addressBook.get(getName));
		return addressBook.get(getName);
	}
	
	/**
	 * 
	 * @param email	A string containing the email address.
	 */
	public void findFriends(String email) {
		if (email != null) {
			System.out.println("Friend(s) with this email address:");
			for (String key : addressBook.keySet()) {
				if (addressBook.get(key).equals(email)) {
					System.out.println(key);
				}
			}
		}
	}
	
	public void listAll() {
		System.out.println("Friends in Address Book:");
        for(String name : addressBook.keySet()){
            String thisOne = addressBook.get(name);
            System.out.println(thisOne);
        }
	}
}
