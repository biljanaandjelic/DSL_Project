/**
 */
package formValidation.provider;


import formValidation.ClassAttribute;
import formValidation.FormValidationFactory;
import formValidation.FormValidationPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link formValidation.ClassAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassAttributeItemProvider 
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
	public ClassAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ClassAttribute_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ClassAttribute_name_feature", "_UI_ClassAttribute_type"),
				 FormValidationPackage.Literals.CLASS_ATTRIBUTE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTETYPE);
			childrenFeatures.add(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE);
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
	 * This returns ClassAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ClassAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ClassAttribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ClassAttribute_type") :
			getString("_UI_ClassAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(ClassAttribute.class)) {
			case FormValidationPackage.CLASS_ATTRIBUTE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTETYPE:
			case FormValidationPackage.CLASS_ATTRIBUTE__ATTRIBUTERULE:
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
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTETYPE,
				 FormValidationFactory.eINSTANCE.createAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createRequired()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createEmail()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createMinLength()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createMaxLength()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createMinNumber()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createMinDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createMaxNumber()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createMaxDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createAcceptableValuesString()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createAcceptableValuesDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createStringPattern()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.CLASS_ATTRIBUTE__ATTRIBUTERULE,
				 FormValidationFactory.eINSTANCE.createDatePattern()));
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
