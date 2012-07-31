package messaging;

import common.User;

/**
 * <html>
 * Represents a Message transmitted between Teamshare <b>users</b>.
 * </html>
 */
public class Message {
	/**
	 * The user that sends the message
	 */
	public User source;
	/**
	 * The user that receives the message in its <b>mailbox<b>
	 */
	public User destination;
	/**
	 * The message's status, if it is read, unread etc
	 */
	public MessageStatus status;
	/**
	 * The message's content, either generated by the application or input from the user (or combined)
	 */
	public String content;
	/**
	 * The message's type, currently just invitation or ownership transfer.
	 */
	public MessageType type;
}
