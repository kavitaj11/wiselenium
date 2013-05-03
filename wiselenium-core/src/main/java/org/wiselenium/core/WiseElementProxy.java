package org.wiselenium.core;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsElement;

/**
 * The wiselenium proxy for elements.
 * 
 * @author Andre Ricardo Schaffer
 * @since 0.0.1
 */
public class WiseElementProxy implements MethodInterceptor {
	
	private static final String GET_WRAPPED_ELEMENT_METHOD_NAME = "getWrappedElement";
	private final WebElement element;
	
	
	private WiseElementProxy(WebElement element) {
		this.element = element;
	}
	
	static WiseElementProxy getInstance(WebElement element) {
		return new WiseElementProxy(element);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy)
		throws Throwable {
		
		if (GET_WRAPPED_ELEMENT_METHOD_NAME.equals(method.getName())) {
			if (!(obj instanceof WrapsElement)) throw new WebElementNotWrappedException(obj);
			return this.element;
		}
		
		return proxy.invokeSuper(obj, args);
	}
	
}