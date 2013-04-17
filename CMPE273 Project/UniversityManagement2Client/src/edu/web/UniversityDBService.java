/**
 * UniversityDBService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.web;

public interface UniversityDBService extends javax.xml.rpc.Service {
    public java.lang.String getUniversityDBAddress();

    public edu.web.UniversityDB getUniversityDB() throws javax.xml.rpc.ServiceException;

    public edu.web.UniversityDB getUniversityDB(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
