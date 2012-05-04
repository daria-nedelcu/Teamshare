package topology;

import java.util.List;

import common.Device;
import common.DeviceStatus;

import groupmanagement.Group;

/**
 * Class representing a group's overlay: all devices, either online/offline and their logical connections.
 * @author adriana
 *
 */
public class Overlay {

	private Group group;
	private List<Device> onlineDevices;
	private List<Device> allDevices;
	private OverlayManager overlayManager;
	/**
	 * Sets the group for which this Overlay is created & maintained. 
	 * @param g the group
	 */
	public void setGroup(Group g){}
	/**
	 * Provides a list of online devices of all the users in the group.
	 * @return a list of devices, not necessarily ordered per user
	 */
	public List<Device> getOnlineDevices(){ return null;}
	/**
	 * Provides a list of all devices of all the users in the group, no matter their availability.
	 * @return a list of devices, not necessarily ordered per user
	 */
	public List<Device> getAllDevices(){ return null;}
	/**
	 * Sets the status(online/offline) of a device in the overlay .
	 * @param device
	 * @param status 
	 */
	public void setDeviceStatus(Device device, DeviceStatus status){}	
	
}
