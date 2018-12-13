/**
 */
package formValidation.provider;


import formValidation.AttributeType;
import formValidation.FormValidationFactory;
import formValidation.FormValidationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link formValidation.AttributeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeTypeItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT);
			childrenFeatures.add(FormValidationPackage.Literals.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns AttributeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AttributeType_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AttributeType.class)) {
			case FormValidationPackage.ATTRIBUTE_TYPE__UI_COMPONENT:
			case FormValidationPackage.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createNumericUIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createDropDownList()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createCheckBox()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createDateUIComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createTextInput()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createTextArea()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createTelInput()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createEmailInput()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createPassword()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createFileInput()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createRefEntity()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createLoadValues()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__UI_COMPONENT,
				 FormValidationFactory.eINSTANCE.createAutocompleteComponent()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE,
				 FormValidationFactory.eINSTANCE.createPrimitiveDataType()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE_TYPE__ATTRIBUTE_DATA_TYPE,
				 FormValidationFactory.eINSTANCE.createNonPrimitiveDataType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FormValidationEditPlugin.INSTANCE;
	}

}
