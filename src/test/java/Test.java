import org.springframework.context.ApplicationContext;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

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
		ResourceBundleMessageSource messageSource = (ResourceBundleMessageSource) ctx.getBean("messageSource");
		System.out.println(ctx.getMessage("greeting.common",null, Locale.US));
		System.out.println(ctx.getMessage("greeting.common",null, Locale.CHINA));
		try {
			System.out.println(ctx.getMessage("greeting2.common",null, Locale.CHINA));
		} catch (NoSuchMessageException e) {
			System.out.println("not find greeting2.common");
		}

		messageSource.setBasenames("i18n/resource","ds/resource");
		System.out.println(ctx.getMessage("greeting.common",null, Locale.US));
		System.out.println(ctx.getMessage("greeting.common",null, Locale.CHINA));
		System.out.println(ctx.getMessage("greeting2.common",null, Locale.CHINA));
	}

}
