package pack_10_ioc.pack_30_factory.pack_20_factory_pattern03;

import org.springframework.beans.factory.FactoryBean;

public class MyFactory implements FactoryBean<BankAcc> {

	public MyFactory(){
		System.out.println("MyFactory Object created."+this.hashCode());
	}
	
	public BankAcc getObject() throws Exception {
		
		// Make decisions
		// Create other depending objects
		BankAcc bcc = new BankAcc();
		// Set dependencies.
		return bcc;
	}

	public Class<?> getObjectType() {
		
		return BankAcc.class;
	}

	public boolean isSingleton() {
		
		return true;
	}
}
