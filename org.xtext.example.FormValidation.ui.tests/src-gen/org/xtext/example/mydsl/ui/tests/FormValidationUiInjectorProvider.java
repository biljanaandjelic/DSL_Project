/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;
import org.xtext.example.FormValidation.ui.internal.FormValidationActivator;

public class FormValidationUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FormValidationActivator.getInstance().getInjector("org.xtext.example.mydsl.FormValidation");
	}

}
