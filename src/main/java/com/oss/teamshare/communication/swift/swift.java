/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.oss.teamshare.communication.swift;

public class swift {
  public static void Start(String sz_bind_addr, String sz_filename, String sz_tracker_addr, String sz_root_hash) {
    swiftJNI.Start(sz_bind_addr, sz_filename, sz_tracker_addr, sz_root_hash);
  }

  public static String GetRootHash(String sz_filename) {
    return swiftJNI.GetRootHash(sz_filename);
  }

}
