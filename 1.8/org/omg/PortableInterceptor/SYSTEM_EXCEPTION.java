package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/SYSTEM_EXCEPTION.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u101/7261/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, June 22, 2016 1:22:40 AM PDT
*/

public interface SYSTEM_EXCEPTION
{

  /**
   * Indicates a SystemException reply status. One possible value for 
   * <code>RequestInfo.reply_status</code>.
   * @see RequestInfo#reply_status
   * @see SUCCESSFUL
   * @see USER_EXCEPTION
   * @see LOCATION_FORWARD
   * @see TRANSPORT_RETRY
   */
  public static final short value = (short)(1);
}
