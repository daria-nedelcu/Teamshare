package synchronization;

import groupmanagement.Group;

import java.util.List;
import change.Change;

/**
 * Interface that must be implemented by any class that implements a conflict resolution strategy.
 * @author adriana
 *
 */
public interface ConflictManager {

	public void solveConflict(Conflict conflict);
	public List<Conflict> getConflicts(Group group);
	public Boolean checkForConflict(Change change);
	
}
