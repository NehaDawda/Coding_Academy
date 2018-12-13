package pack_20_lifecycle.pack_10_bean_lifecycle.pack20_ini_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LeavesConfiguration implements InitializingBean, DisposableBean{
	private int maxPLAnnually;
	private int maxCLAnnually;
	private int maxMedicalAnnually;
	
	public int getMaxPLAnnually() {
		return maxPLAnnually;
	}
	public void setMaxPLAnnually(int maxPLAnnually) {
		this.maxPLAnnually = maxPLAnnually;
	}
	
	public int getMaxCLAnnually() {
		return maxCLAnnually;
	}
	public void setMaxCLAnnually(int maxCLAnnually) {
		this.maxCLAnnually = maxCLAnnually;
	}
	
	public int getMaxMedicalAnnually() {
		return maxMedicalAnnually;
	}
	public void setMaxMedicalAnnually(int maxMedicalAnnually) {
		System.out.println("In setter methods.");
		this.maxMedicalAnnually = maxMedicalAnnually;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("In after properties set.");
		if (maxPLAnnually>22)
			throw new Exception("Wrong configuraton of max PL");
		if (maxCLAnnually>12)
			throw new Exception("Wrong configuraton of max CL");
		if (maxMedicalAnnually>30)
			throw new Exception("Wrong configuraton of max Medical");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("In destroy method.");
	}
	
	@Override
	public String toString() {
		return "LibraryConfiguration [maxCLAnnually=" + maxCLAnnually
				+ ", maxMedicalAnnually=" + maxMedicalAnnually
				+ ", maxPLAnnually=" + maxPLAnnually + "]";
	}
	
}
