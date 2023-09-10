package ax4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {

	
	@Test
	public void testCycle() {
		ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("appctx.xml");
		
		appCtx.getBean(LifeCycle.class);
		appCtx.close();
	}
	
}
