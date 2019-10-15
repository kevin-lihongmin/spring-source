package org.springframework;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextEvent;

/**
 *   上下文监听
 * @author lihongmin
 * @date 2018/11/18 19:25
 *
 * @see org.springframework.web.context.ContextLoaderListener
 */
public class ContextLoadListenerTest extends ContextLoaderListener {

	public ContextLoadListenerTest(WebApplicationContext context) {
		super(context);
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		super.contextDestroyed(event);
	}
}
