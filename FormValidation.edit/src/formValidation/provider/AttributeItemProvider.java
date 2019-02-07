/**
 */
package formValidation.provider;


import formValidation.Attribute;
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
 * This is the item provider adapter for a {@link formValidation.Attribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeItemProvider 
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
	public AttributeItemProvider(AdapterFactory adapterFactory) {
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
			addLabelPropertyDescriptor(object);
			addMasterPropertyDescriptor(object);
			addIsClassRepresentingPropertyDescriptor(object);
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
				 getString("_UI_Attribute_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_name_feature", "_UI_Attribute_type"),
				 FormValidationPackage.Literals.ATTRIBUTE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_label_feature", "_UI_Attribute_type"),
				 FormValidationPackage.Literals.ATTRIBUTE__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Master feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMasterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_master_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_master_feature", "_UI_Attribute_type"),
				 FormValidationPackage.Literals.ATTRIBUTE__MASTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Class Representing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsClassRepresentingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_isClassRepresenting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_isClassRepresenting_feature", "_UI_Attribute_type"),
				 FormValidationPackage.Literals.ATTRIBUTE__IS_CLASS_REPRESENTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(FormValidationPackage.Literals.ATTRIBUTE__ATTRIBUTETYPE);
			childrenFeatures.add(FormValidationPackage.Literals.ATTRIBUTE__RULES);
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
	 * This returns Attribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Attribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Attribute_type") :
			getString("_UI_Attribute_type") + " " + label;
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

		switch (notification.getFeatureID(Attribute.class)) {
			case FormValidationPackage.ATTRIBUTE__NAME:
			case FormValidationPackage.ATTRIBUTE__LABEL:
			case FormValidationPackage.ATTRIBUTE__MASTER:
			case FormValidationPackage.ATTRIBUTE__IS_CLASS_REPRESENTING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormValidationPackage.ATTRIBUTE__ATTRIBUTETYPE:
			case FormValidationPackage.ATTRIBUTE__RULES:
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
				(FormValidationPackage.Literals.ATTRIBUTE__ATTRIBUTETYPE,
				 FormValidationFactory.eINSTANCE.createAttributeType()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createRequired()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createMinLength()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createMaxLength()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createLength()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createMinNumber()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createMinDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createMaxNumber()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createMaxDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createAcceptableValuesString()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createAcceptableValuesDate()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
				 FormValidationFactory.eINSTANCE.createStringPattern()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ATTRIBUTE__RULES,
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
