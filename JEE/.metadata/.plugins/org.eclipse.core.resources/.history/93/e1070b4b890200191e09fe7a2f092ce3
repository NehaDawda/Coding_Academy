package com.jp.hr.soap;

import javax.xml.ws.Endpoint;

import com.jp.hr.exceptions.HrException;
import com.jp.hr.updateInterfaces.EmpSoapServicesUpdate;
import com.jp.hr.viewInterfaces.EmpSoapServicesView;

//http://localhost:9898/viewHr?wsdl
//http://localhost:9898/updateHr?wsdl
public class PublishEmpServices {

	public static void main(String[] args) {
		try {
			EmpSoapServicesView viewServices = new EmpSoapServicesViewImpl();
			Endpoint.publish("http://localhost:9898/viewHr", viewServices);
			
			EmpSoapServicesUpdate updateServices = new EmpSoapServicesUpdateImpl();
			Endpoint.publish("http://localhost:9898/updateHr", updateServices);
			
			System.out.println("Services started");
		} catch (HrException e) {
			e.printStackTrace();
		}
		
	}

}
