package pack_20_lifecycle.pack_10_bean_lifecycle.pack30_annotate;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("leavesLimits")
public class LeavesConfiguration {
	private int maxPLAnnually;
	private int maxCLAnnually;
	private int maxMedicalAnnually;
	
	public LeavesConfiguration(){
		System.out.println("Bean created.");
	}
	
	public int getMaxPLAnnually() {
		return maxPLAnnually;
	}
	@Value("20")
	public void setMaxPLAnnually(int maxPLAnnually) {
		System.out.println("in setter method.");
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
		this.maxMedicalAnnually = maxMedicalAnnually;
	}
	
	@PostConstruct
	public void assignDefaultResources1() throws Exception {
		// Open persistence storage.
		System.out.println("PostConstruct: Resource opened1.");
	}
	
	@PostConstruct
	public void assignDefaultResources() throws Exception {
		// Open persistence storage.
		System.out.println("PostConstruct: Resource opened.");
	}
	
	@PreDestroy
	public void releaseResources() throws Exception {
		// Close persistence resources
		System.out.println("PreDestroy: Resource closed.");
	}
	
	@Override
	public String toString() {
		// Populate value from open resource
		return "LibraryConfiguration [maxCLAnnually=" + maxCLAnnually
				+ ", maxMedicalAnnually=" + maxMedicalAnnually
				+ ", maxPLAnnually=" + maxPLAnnually + "]";
	}
}
