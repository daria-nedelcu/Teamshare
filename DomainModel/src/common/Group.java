/**
 * 
 */
package common;

import java.util.List;
import java.util.Properties;

/**
 * The Group entity is defined by an unique ID and its group folder. In addition it folds attributes such as its owner, its list of users, 
 * security keys, settings.
 *
 */
public class Group {
	/**
	 * The group's unique identifier, not visible to users through the application's interface, used only internally to identify groups.
	 */
	public long groupID;
	/**
	 * The group folder's name is also the group's actual name. 
	 * This folder is the root for all the files and folders created by the group's users.
	 */
	public String folderName; 
	/**
	 * The groups owner.
	 */
	public User owner;
	/**
	 * A user that will become the group's owner after an ownership transfer. It is marked as pending only during the transfer.
	 */
	public User pendingOwner;
	/**
	 * For security mechanisms the group must have a series of keys, 
	 * but the details regarding encryption and authentication techniques are on the application level, at the domain level we only 
	 * that they are needed.
	 */
	public List<String> keys;
	/**
	 * The group's users.
	 */
	public List<User> users;	
	/**
	 * The group's settings, they are implementation dependent and the exact settings or their number is not set at domain level. 
	 * They should include properties such as the maximum number of users and the maximum storage capacity.
	 */
	public Properties settings;
}
