package pack_10_ioc.pack_70_namespace.pack_05_combine.withAnnot.usingAppConfig;

/*
 * There are two ways to use Property Overrider using annotations.
 * 
 * I. Using @PropertySource annotation.
 * 		This annotation always go in conjunction with @Configuration annotation.
 * 		Before this annotation takes an action, it must get object of 'PropertySourcesPlaceholderConfigurer'.  Observe, this object is created using 'static' method.
 * 		All property values declared db.properties are set in variables using @Value annotation.
 * 
 * II. The Programmatic approach
 * 		Comment @PropertySource and method placeHolderConfigurer()
 * 		Uncomment method properties()
 */
import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;

@Configuration
//@PropertySource("classpath:pack_10_ioc\\pack_70_namespace\\pack_05_combine\\withAnnot\\usingAppConfig\\db.properties")
public class AppConfig {
	
	// Reading values of Property place holder and placing them through @Value
	// This is an alternative for reading values from Environment variable.
	@Value( "${url}" ) 		    			private String jdbcUrl;
    @Value( "${driverClassName}" ) 			private String driverClassName;
    @Value( "${user}" ) 		private String username;
    @Value( "${password}" ) 		private String password;
	
	
	///*
    // Programmatic approach to create property place holder.
    @Bean
    public static PropertyPlaceholderConfigurer properties(){
      PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
      ClassPathResource[] resources = new ClassPathResource[ ] { new ClassPathResource( "pack_10_ioc\\pack_70_namespace\\pack_05_combine\\withAnnot\\usingAppConfig\\db.properties" ) };
      
      ppc.setLocations( resources );
      ppc.setIgnoreUnresolvablePlaceholders( true );
      return ppc;
    }
    //*/
    /*
    // Necessary when @PropertySource is being used.
    // Must be static for getting loaded before AppConfig class instance being created.
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
     return new PropertySourcesPlaceholderConfigurer();
    }
    */
    @Bean(name="datasource")
    public DataSource datasource() {
    	
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(driverClassName);
        ds.setUrl(jdbcUrl);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
    
    @Bean(name="empList")
    public EmpDao employeeDao() {
        EmpDao employeeDao =  new EmpDao();
        employeeDao.setDataSource(datasource());
        return employeeDao;
    }
}
