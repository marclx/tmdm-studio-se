/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.ejb.local;

/**
 * Local home interface for TransformerCtrl.
 * @deprecated - use TransformerV2 package
 * @xdoclet-generated at 27-05-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface TransformerCtrlLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/TransformerCtrlLocal";
   public static final String JNDI_NAME="amalto/local/core/transformerctrl";

   public com.amalto.core.ejb.local.TransformerCtrlLocal create()
      throws javax.ejb.CreateException;

}
