/**
 * 
 */
package groupmanagement;

import java.util.List;

import common.User;


/**
 * 
 * The interface of the Group Management Component with the rest of the services 
 * (the entry-point of this component)
 * @author adriana
 *
 */
public class GroupManagement {

	private List<Group> groups;
	private MessageManager messageManager; 
	
	/**
	 * Starts an ownership transfer action. 
	 * @param group the group
	 * @param newOwner the new owner, one of the group's users 
	 */
	public void transferOwnership(Group group, User newOwner){
		
	}
	
	/**
	 * Method used to inform the Group Managemnt component that a change in the group's file has
	 * occurred, so it needs to reload the Group's object. (e.g. triggered by receiving a push with
	 * the Group Info File containing a new user)
	 * @param group the group for which the change occurred
	 */
	public void informChange(Group group){
		
	}
	/**
	 * Invoked when the user leaves the given group. It works only if the user is not the group's owner,
	 * otherwise will generate an exception(to be defined later).
	 * @param group
	 */
	public void leave(Group group) {
		
	}
	/**
	 * Invoked when the owner removes an user from the group. It works only if the user logged into
	 * the device is the group's owner.
	 * @param group the group from which to remove
	 * @param user the user that needs to be kicked-out from the group
	 */
	public void kickout(Group group, User user) {
		
	}
	
	/**
	 * Invoked when the owner wants to add a new member to the group. It works only if the user logged into
	 * the device is the group's owner.
	 * @param group
	 * @param userEmail the invited person's e-mail. The new member might not be using the system yet, so the only method of
	 * identification is the e-mail.
	 */
	public void invite(Group group, String userEmail) {
		
	}
	
	/** Invoked when creating a group. The given Group object contains basic info such as the filename
	 *  and the group management service fills/creates the other info, and stores the group information
	 *  in a file. 
	 *  @param group 
	 */
	public void createGroup(Group group) {		
	
	}
	
	/** Invoked when removing a group. It will generate an exception if the group has other 
	 * members except its owner 
	 */
	public void cleanupGroup(Group g) {
		
	}
	
	/**
	 * Used for informing the Group Management component that a message has arrived (e.g. it might be an
	 * invitation or a reply to an invitation etc)
	 * @param msg the message received
	 */
	public void receivedMessage(GroupMessage msg) {
		
		
	}
	
	/**
	 * Creates and sends a reply message for the given GroupMessage received, based on the user's
	 * input.
	 * @param msg the message for which to send response. Contains information such as the sender, the type of message etc
	 * @param choice the user's answer
	 */
	public void sendReply(GroupMessage msg, UserChoice choice){}
	
	
}
