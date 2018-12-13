package pack_40_aop.pack_20_pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutConfig {

	@Pointcut("execution(public * pack_40_aop.pack_20_pointcut.pack_service.*.*(..))") //This is a pointcut expression
    public void serviceComponents() {} //This is a name given to the pointcut expression
    
    @Pointcut("execution(* apply*(..))")
    public void applyMethods() {} 	
}
