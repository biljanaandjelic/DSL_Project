/**
 */
package rdbms.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import rdbms.Action;
import rdbms.Column;
import rdbms.ForeignKey;
import rdbms.PKeyAndUnique;
import rdbms.RdbmsPackage;
import rdbms.ReferencingType;
import rdbms.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getRhsKey <em>Rhs Key</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getLhsAttr <em>Lhs Attr</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getRefersTo <em>Refers To</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getDeleteActionRHS <em>Delete Action RHS</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getUpdateActionRHS <em>Update Action RHS</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getFKTable <em>FK Table</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#getMatch <em>Match</em>}</li>
 *   <li>{@link rdbms.impl.ForeignKeyImpl#isInverseReferentialIntegrityCon <em>Inverse Referential Integrity Con</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyImpl extends ConstraintsImpl implements ForeignKey {
	/**
	 * The cached value of the '{@link #getRhsKey() <em>Rhs Key</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhsKey()
	 * @generated
	 * @ordered
	 */
	protected PKeyAndUnique rhsKey;

	/**
	 * The cached value of the '{@link #getLhsAttr() <em>Lhs Attr</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhsAttr()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> lhsAttr;

	/**
	 * The cached value of the '{@link #getRefersTo() <em>Refers To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefersTo()
	 * @generated
	 * @ordered
	 */
	protected Table refersTo;

	/**
	 * The default value of the '{@link #getDeleteActionRHS() <em>Delete Action RHS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteActionRHS()
	 * @generated
	 * @ordered
	 */
	protected static final Action DELETE_ACTION_RHS_EDEFAULT = Action.RESTRICT;

	/**
	 * The cached value of the '{@link #getDeleteActionRHS() <em>Delete Action RHS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteActionRHS()
	 * @generated
	 * @ordered
	 */
	protected Action deleteActionRHS = DELETE_ACTION_RHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateActionRHS() <em>Update Action RHS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateActionRHS()
	 * @generated
	 * @ordered
	 */
	protected static final Action UPDATE_ACTION_RHS_EDEFAULT = Action.RESTRICT;

	/**
	 * The cached value of the '{@link #getUpdateActionRHS() <em>Update Action RHS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateActionRHS()
	 * @generated
	 * @ordered
	 */
	protected Action updateActionRHS = UPDATE_ACTION_RHS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected static final ReferencingType MATCH_EDEFAULT = ReferencingType.DEFAULT;

	/**
	 * The cached value of the '{@link #getMatch() <em>Match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch()
	 * @generated
	 * @ordered
	 */
	protected ReferencingType match = MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #isInverseReferentialIntegrityCon() <em>Inverse Referential Integrity Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseReferentialIntegrityCon()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERSE_REFERENTIAL_INTEGRITY_CON_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverseReferentialIntegrityCon() <em>Inverse Referential Integrity Con</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverseReferentialIntegrityCon()
	 * @generated
	 * @ordered
	 */
	protected boolean inverseReferentialIntegrityCon = INVERSE_REFERENTIAL_INTEGRITY_CON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdbmsPackage.Literals.FOREIGN_KEY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKeyAndUnique getRhsKey() {
		if (rhsKey != null && rhsKey.eIsProxy()) {
			InternalEObject oldRhsKey = (InternalEObject)rhsKey;
			rhsKey = (PKeyAndUnique)eResolveProxy(oldRhsKey);
			if (rhsKey != oldRhsKey) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.FOREIGN_KEY__RHS_KEY, oldRhsKey, rhsKey));
			}
		}
		return rhsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PKeyAndUnique basicGetRhsKey() {
		return rhsKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhsKey(PKeyAndUnique newRhsKey) {
		PKeyAndUnique oldRhsKey = rhsKey;
		rhsKey = newRhsKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__RHS_KEY, oldRhsKey, rhsKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getLhsAttr() {
		if (lhsAttr == null) {
			lhsAttr = new EObjectResolvingEList<Column>(Column.class, this, RdbmsPackage.FOREIGN_KEY__LHS_ATTR);
		}
		return lhsAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getRefersTo() {
		if (refersTo != null && refersTo.eIsProxy()) {
			InternalEObject oldRefersTo = (InternalEObject)refersTo;
			refersTo = (Table)eResolveProxy(oldRefersTo);
			if (refersTo != oldRefersTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdbmsPackage.FOREIGN_KEY__REFERS_TO, oldRefersTo, refersTo));
			}
		}
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetRefersTo() {
		return refersTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefersTo(Table newRefersTo) {
		Table oldRefersTo = refersTo;
		refersTo = newRefersTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__REFERS_TO, oldRefersTo, refersTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getDeleteActionRHS() {
		return deleteActionRHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteActionRHS(Action newDeleteActionRHS) {
		Action oldDeleteActionRHS = deleteActionRHS;
		deleteActionRHS = newDeleteActionRHS == null ? DELETE_ACTION_RHS_EDEFAULT : newDeleteActionRHS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__DELETE_ACTION_RHS, oldDeleteActionRHS, deleteActionRHS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getUpdateActionRHS() {
		return updateActionRHS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateActionRHS(Action newUpdateActionRHS) {
		Action oldUpdateActionRHS = updateActionRHS;
		updateActionRHS = newUpdateActionRHS == null ? UPDATE_ACTION_RHS_EDEFAULT : newUpdateActionRHS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__UPDATE_ACTION_RHS, oldUpdateActionRHS, updateActionRHS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getFKTable() {
		if (eContainerFeatureID() != RdbmsPackage.FOREIGN_KEY__FK_TABLE) return null;
		return (Table)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFKTable(Table newFKTable, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFKTable, RdbmsPackage.FOREIGN_KEY__FK_TABLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFKTable(Table newFKTable) {
		if (newFKTable != eInternalContainer() || (eContainerFeatureID() != RdbmsPackage.FOREIGN_KEY__FK_TABLE && newFKTable != null)) {
			if (EcoreUtil.isAncestor(this, newFKTable))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFKTable != null)
				msgs = ((InternalEObject)newFKTable).eInverseAdd(this, RdbmsPackage.TABLE__TABLE_FKS, Table.class, msgs);
			msgs = basicSetFKTable(newFKTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__FK_TABLE, newFKTable, newFKTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencingType getMatch() {
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch(ReferencingType newMatch) {
		ReferencingType oldMatch = match;
		match = newMatch == null ? MATCH_EDEFAULT : newMatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__MATCH, oldMatch, match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverseReferentialIntegrityCon() {
		return inverseReferentialIntegrityCon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverseReferentialIntegrityCon(boolean newInverseReferentialIntegrityCon) {
		boolean oldInverseReferentialIntegrityCon = inverseReferentialIntegrityCon;
		inverseReferentialIntegrityCon = newInverseReferentialIntegrityCon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdbmsPackage.FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON, oldInverseReferentialIntegrityCon, inverseReferentialIntegrityCon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFKTable((Table)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				return basicSetFKTable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				return eInternalContainer().eInverseRemove(this, RdbmsPackage.TABLE__TABLE_FKS, Table.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdbmsPackage.FOREIGN_KEY__RHS_KEY:
				if (resolve) return getRhsKey();
				return basicGetRhsKey();
			case RdbmsPackage.FOREIGN_KEY__LHS_ATTR:
				return getLhsAttr();
			case RdbmsPackage.FOREIGN_KEY__REFERS_TO:
				if (resolve) return getRefersTo();
				return basicGetRefersTo();
			case RdbmsPackage.FOREIGN_KEY__DELETE_ACTION_RHS:
				return getDeleteActionRHS();
			case RdbmsPackage.FOREIGN_KEY__UPDATE_ACTION_RHS:
				return getUpdateActionRHS();
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				return getFKTable();
			case RdbmsPackage.FOREIGN_KEY__MATCH:
				return getMatch();
			case RdbmsPackage.FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON:
				return isInverseReferentialIntegrityCon();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdbmsPackage.FOREIGN_KEY__RHS_KEY:
				setRhsKey((PKeyAndUnique)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__LHS_ATTR:
				getLhsAttr().clear();
				getLhsAttr().addAll((Collection<? extends Column>)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__REFERS_TO:
				setRefersTo((Table)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__DELETE_ACTION_RHS:
				setDeleteActionRHS((Action)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__UPDATE_ACTION_RHS:
				setUpdateActionRHS((Action)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				setFKTable((Table)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__MATCH:
				setMatch((ReferencingType)newValue);
				return;
			case RdbmsPackage.FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON:
				setInverseReferentialIntegrityCon((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdbmsPackage.FOREIGN_KEY__RHS_KEY:
				setRhsKey((PKeyAndUnique)null);
				return;
			case RdbmsPackage.FOREIGN_KEY__LHS_ATTR:
				getLhsAttr().clear();
				return;
			case RdbmsPackage.FOREIGN_KEY__REFERS_TO:
				setRefersTo((Table)null);
				return;
			case RdbmsPackage.FOREIGN_KEY__DELETE_ACTION_RHS:
				setDeleteActionRHS(DELETE_ACTION_RHS_EDEFAULT);
				return;
			case RdbmsPackage.FOREIGN_KEY__UPDATE_ACTION_RHS:
				setUpdateActionRHS(UPDATE_ACTION_RHS_EDEFAULT);
				return;
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				setFKTable((Table)null);
				return;
			case RdbmsPackage.FOREIGN_KEY__MATCH:
				setMatch(MATCH_EDEFAULT);
				return;
			case RdbmsPackage.FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON:
				setInverseReferentialIntegrityCon(INVERSE_REFERENTIAL_INTEGRITY_CON_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdbmsPackage.FOREIGN_KEY__RHS_KEY:
				return rhsKey != null;
			case RdbmsPackage.FOREIGN_KEY__LHS_ATTR:
				return lhsAttr != null && !lhsAttr.isEmpty();
			case RdbmsPackage.FOREIGN_KEY__REFERS_TO:
				return refersTo != null;
			case RdbmsPackage.FOREIGN_KEY__DELETE_ACTION_RHS:
				return deleteActionRHS != DELETE_ACTION_RHS_EDEFAULT;
			case RdbmsPackage.FOREIGN_KEY__UPDATE_ACTION_RHS:
				return updateActionRHS != UPDATE_ACTION_RHS_EDEFAULT;
			case RdbmsPackage.FOREIGN_KEY__FK_TABLE:
				return getFKTable() != null;
			case RdbmsPackage.FOREIGN_KEY__MATCH:
				return match != MATCH_EDEFAULT;
			case RdbmsPackage.FOREIGN_KEY__INVERSE_REFERENTIAL_INTEGRITY_CON:
				return inverseReferentialIntegrityCon != INVERSE_REFERENTIAL_INTEGRITY_CON_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deleteActionRHS: ");
		result.append(deleteActionRHS);
		result.append(", updateActionRHS: ");
		result.append(updateActionRHS);
		result.append(", match: ");
		result.append(match);
		result.append(", inverseReferentialIntegrityCon: ");
		result.append(inverseReferentialIntegrityCon);
		result.append(')');
		return result.toString();
	}

} //ForeignKeyImpl
