/**
 * 
 */
package synchronization;
import java.util.List;

import common.Device;
/**
 * Interface that must be implemented by classes that perform piece-based synchronization
 * @author adriana
 *
 */
public interface PieceSyncTool {

	/**
	 * Starts the synchronization (downloads the file from the devices)
	 * @param path the path within the group's folder for the pulled file
	 * @param devices the devices from which to download pieces of the file
	 * @return the transfer identifier or null if the transfer could not be started.
	 */

	public Integer startSync(String path, List<Device> devices);
	/**
	 * Stops(terminates) a transfer, the transfer identifier is no longer valid. 
	 * @param transferID the transfer's identifier
	 */
	public void stop(int transferID);
	/**
	 * Resumes a paused transfer.
	 * @param transferID the transfer's identifier
	 */
	public void resume(int transferID);
	/**
	 * Pauses the transfer
	 * @param transferID the transfer's identifier
	 */
	public void pause(int transferID); 
	
}
