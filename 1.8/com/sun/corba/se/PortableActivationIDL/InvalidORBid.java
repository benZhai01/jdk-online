package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/InvalidORBid.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u101/7261/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, June 22, 2016 1:22:39 AM PDT
*/

public final class InvalidORBid extends org.omg.CORBA.UserException
{

  public InvalidORBid ()
  {
    super(InvalidORBidHelper.id());
  } // ctor


  public InvalidORBid (String $reason)
  {
    super(InvalidORBidHelper.id() + "  " + $reason);
  } // ctor

} // class InvalidORBid
