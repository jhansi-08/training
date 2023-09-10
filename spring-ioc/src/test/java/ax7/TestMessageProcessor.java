package ax7;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageProcessor {

	@Test
	public void testProcess() {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("appctx.xml");
		
		MessageProcessor mp = (MessageProcessor) ctx.getBean("mp");
		
		mp.process("sms", "9801056789", "Howdy");
		mp.process("email", "deeksha380", "Bonjour");
		mp.process("wap", "@jhansi", "Aloha");
	}
}
