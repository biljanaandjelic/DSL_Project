/*
 * generated by Xtext
 */
package org.xtext.example.domij.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.xtext.example.domij.ui.internal.ErDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ErDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ErDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ErDslActivator.getInstance().getInjector(ErDslActivator.ORG_XTEXT_EXAMPLE_DOMIJ_ERDSL);
	}
	
}
