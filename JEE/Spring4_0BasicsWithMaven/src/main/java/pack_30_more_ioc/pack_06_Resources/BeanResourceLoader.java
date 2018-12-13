package pack_30_more_ioc.pack_06_Resources;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class BeanResourceLoader implements ResourceLoaderAware {
	private ResourceLoader resourceLoader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
		
	}

	public Resource getResource(String location){
		return resourceLoader.getResource(location);
	}
}
