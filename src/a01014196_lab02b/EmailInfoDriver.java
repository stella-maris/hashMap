

/**
 * @author a01014196 Mary Lee
 *
 */

public class EmailInfoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailInfo address = new EmailInfo();
		
		address.addFriend("Mary", "test@mailinator.com");
		address.addFriend("Bob", "bobloblaw@boblaw.com");
		address.addFriend("Hal", "halpal@helpahal.com");
		
		address.listAll();
		
		address.removeFriend("Mary");
		
		address.listAll();
		
		address.getAddress("Hal");
		
		address.addFriend("barb", "bobloblaw@boblaw.com");
		address.findFriends("bobloblaw@boblaw.com");
	}

}
