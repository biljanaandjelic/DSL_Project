/**
 */
package formValidation.provider;


import formValidation.Entity;
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
 * This is the item provider adapter for a {@link formValidation.Entity} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityItemProvider 
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
	public EntityItemProvider(AdapterFactory adapterFactory) {
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
			addAttrPropertyDescriptor(object);
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
				 getString("_UI_Entity_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_name_feature", "_UI_Entity_type"),
				 FormValidationPackage.Literals.ENTITY__NAME,
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
				 getString("_UI_Entity_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_label_feature", "_UI_Entity_type"),
				 FormValidationPackage.Literals.ENTITY__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Entity_attr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Entity_attr_feature", "_UI_Entity_type"),
				 FormValidationPackage.Literals.ENTITY__ATTR,
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
			childrenFeatures.add(FormValidationPackage.Literals.ENTITY__ATTRIBUTES);
			childrenFeatures.add(FormValidationPackage.Literals.ENTITY__CLASSRULE);
			childrenFeatures.add(FormValidationPackage.Literals.ENTITY__FORMLAYOUT);
			childrenFeatures.add(FormValidationPackage.Literals.ENTITY__ADDITIONAL_SETTINGS);
			childrenFeatures.add(FormValidationPackage.Literals.ENTITY__OVERVIEWSETTINGS);
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
	 * This returns Entity.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Entity"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Entity)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Entity_type") :
			getString("_UI_Entity_type") + " " + label;
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

		switch (notification.getFeatureID(Entity.class)) {
			case FormValidationPackage.ENTITY__NAME:
			case FormValidationPackage.ENTITY__LABEL:
			case FormValidationPackage.ENTITY__ATTR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FormValidationPackage.ENTITY__ATTRIBUTES:
			case FormValidationPackage.ENTITY__CLASSRULE:
			case FormValidationPackage.ENTITY__FORMLAYOUT:
			case FormValidationPackage.ENTITY__ADDITIONAL_SETTINGS:
			case FormValidationPackage.ENTITY__OVERVIEWSETTINGS:
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
				(FormValidationPackage.Literals.ENTITY__ATTRIBUTES,
				 FormValidationFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__CLASSRULE,
				 FormValidationFactory.eINSTANCE.createNotEquals()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__CLASSRULE,
				 FormValidationFactory.eINSTANCE.createGreaterThan()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__CLASSRULE,
				 FormValidationFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__CLASSRULE,
				 FormValidationFactory.eINSTANCE.createLessThan()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__ADDITIONAL_SETTINGS,
				 FormValidationFactory.eINSTANCE.createAttributeSettings()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__ADDITIONAL_SETTINGS,
				 FormValidationFactory.eINSTANCE.createLabelSettings()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__ADDITIONAL_SETTINGS,
				 FormValidationFactory.eINSTANCE.createErrorMessageSettings()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__ADDITIONAL_SETTINGS,
				 FormValidationFactory.eINSTANCE.createNoteSettings()));

		newChildDescriptors.add
			(createChildParameter
				(FormValidationPackage.Literals.ENTITY__OVERVIEWSETTINGS,
				 FormValidationFactory.eINSTANCE.createOverviewSettings()));
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