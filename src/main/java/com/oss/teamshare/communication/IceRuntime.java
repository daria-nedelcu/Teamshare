package com.oss.teamshare.communication;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.oss.teamshare.team.DeviceId;

public class IceRuntime implements Closeable {
  
  private static IceRuntime instance = null;

  private Ice.Communicator communicator;

  private Logger logger = LogManager.getLogger(IceRuntime.class);
  
  public IceRuntime() {
    try {
        communicator = Ice.Util.initialize();
    } catch (Ice.LocalException e) {
      logger.error("Failed to initialize Ice communicator: "
          + e.getMessage());
      try {
        close();
      } catch (IOException e1) {}
      System.exit(1);
    }
  }
  
  public static IceRuntime getInstance() {
    if (instance == null) {
      instance = new IceRuntime();
    }
    
    return instance;
  }
  
  public Ice.Communicator getCommunicator() {
    return communicator;
  }

  public Ice.ObjectPrx createObjectProxy(DeviceId id, InetSocketAddress address) {
    String strigifiedProxy = id + ":default -h " +
        address.getAddress().getHostAddress() + " -p " + address.getPort();
    logger.debug(strigifiedProxy);
    return communicator.stringToProxy(strigifiedProxy);
  }

  @Override
  public void close() throws IOException {
    if (communicator != null) {
      try {
        communicator.destroy();
        logger.info("Ice Runtime destroyed.");
      } catch (Ice.LocalException e) {
        logger.error("Failed to destroy Ice communicator: "
            + e.getMessage());
      }
    }
  }
}
