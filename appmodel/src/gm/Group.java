package gm;

import java.io.File;
import java.security.Key;
import java.util.List;

import basic.User;

/**
 * Class representing a group. It contains all the information regarding the group,
 * from id and owner to settings and keys 
 * @author adriana
 *
 */
public class Group {
	/** the group's unique identifier*/
	private long gid;
	/** the name of the group's main folder, so the name of the group */
	private String folderName;
	/** the hidden file containing the group's information */
	private File infoFile;
	/** the group's owner, there can be only one owner */
	private User owner;
	/** the group's new owner after completing the ownership transfer */
	private User pendingOwner;
	/** the group's members (users not their devices!) */
	private List<User> members;
	/** the users to which the owner has sent invitations but for which there are no replies yet */
	private List<User> pendingMembers;
	/** the group's keys */
	private List<Key> keys; 
	
	public long getGid() {
		return gid;
	}
	public void setGid(long gid) {
		this.gid = gid;
	}
	public String getFolderName() {
		return folderName;
	}
	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	public File getInfoFile() {
		return infoFile;
	}
	public void setInfoFile(File infoFile) {
		this.infoFile = infoFile;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public User getPendingOwner() {
		return pendingOwner;
	}
	public void setPendingOwner(User pendingOwner) {
		this.pendingOwner = pendingOwner;
	}
	public List<User> getMembers() {
		return members;
	}
	public void setMembers(List<User> members) {
		this.members = members;
	}
	public List<User> getPendingMembers() {
		return pendingMembers;
	}
	public void setPendingMembers(List<User> pendingMembers) {
		this.pendingMembers = pendingMembers;
	}
	public List<Key> getKeys() {
		return keys;
	}
	public void setKeys(List<Key> keys) {
		this.keys = keys;
	}
	
}