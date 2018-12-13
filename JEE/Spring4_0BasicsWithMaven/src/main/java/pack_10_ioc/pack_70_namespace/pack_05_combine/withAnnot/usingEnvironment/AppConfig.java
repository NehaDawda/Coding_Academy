package pack_10_ioc.pack_70_namespace.pack_05_combine.withAnnot.usingEnvironment;

/*
 * There are two ways to use Property Overrider using annotations.
 * 
 * The Environment object is populated with the values of Properper Place holder.
 * 		These values are accessed and utilized
 */
import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:pack_10_ioc\\pack_70_namespace\\pack_05_combine\\withAnnot\\usingEnvironment\\db.properties")
public class AppConfig {

	///*
	// Comment field declaration through @Value for going with Environment object.
	@Inject
	private Environment env;
	
	private String jdbcUrl;
	private String driverClassName;
	private String username;
	private String password;
    //*/
	
    ///*
    // Necessary when @PropertySource is being used.
    // Must be static for getting loaded before AppConfig class instance being created.
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
     return new PropertySourcesPlaceholderConfigurer();
    }
    //*/
    @Bean(name="datasource")
    public DataSource datasource() {
    	
    	// Comment field declaration through @Value and un-comment normal field declaration.
    	jdbcUrl = env.getProperty("url");
		driverClassName = env.getProperty("driverClassName");
		username = env.getProperty("user");
		password = env.getProperty("password");
		
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
