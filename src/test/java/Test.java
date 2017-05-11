import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

/**
 * @ClassName: Test
 * @Description:.
 * @Company: Copyright (c) Pt mind
 * @version: 2.1
 * @date: 2017/5/11
 * @author: ptmind
 */
public class Test {

	public static void main(String[] args) {
		String[] configs = {"applicationContext.xml"};
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
		System.out.println(ctx.getMessage("greeting.common",null, Locale.US));
		System.out.println(ctx.getMessage("greeting.common",null, Locale.CHINA));
	}

}
