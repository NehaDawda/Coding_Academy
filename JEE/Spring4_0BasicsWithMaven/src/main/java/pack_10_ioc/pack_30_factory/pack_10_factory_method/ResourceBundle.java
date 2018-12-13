package pack_10_ioc.pack_30_factory.pack_10_factory_method;

public class ResourceBundle {
	private static ResourceBundle bundle;
	
	private GlobalInvestment companyDetails;
	private JNDIResource jndiResource;
	private ConnectionPoolResource connectionPool;
	
	private ResourceBundle(){
		System.out.println("Constructing resource bundle."+this.hashCode());
		companyDetails = new GlobalInvestment();
		jndiResource = new JNDIResource();
		connectionPool = new ConnectionPoolResource();
	}
	
	public static ResourceBundle getResources(){
		System.out.println("Factory method.");
		if (bundle == null){
			bundle = new ResourceBundle();
		}
		
		return bundle;
	}
	
	public static ResourceBundle getResources(String msg){
		System.out.println(msg);
		if (bundle == null){
			bundle = new ResourceBundle();
		}
		
		return bundle;
	}
}

class JNDIResource {
	
}

class ConnectionPoolResource{
	
}