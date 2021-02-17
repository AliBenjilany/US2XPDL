/**
 */
package UserStories.impl;

import UserStories.Goal;
import UserStories.ProductBacklog;
import UserStories.Role;
import UserStories.UserStoriesPackage;
import UserStories.UserStory;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Backlog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UserStories.impl.ProductBacklogImpl#getUserstories <em>Userstories</em>}</li>
 *   <li>{@link UserStories.impl.ProductBacklogImpl#getName <em>Name</em>}</li>
 *   <li>{@link UserStories.impl.ProductBacklogImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link UserStories.impl.ProductBacklogImpl#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductBacklogImpl extends MinimalEObjectImpl.Container implements ProductBacklog {
	/**
	 * The cached value of the '{@link #getUserstories() <em>Userstories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserstories()
	 * @generated
	 * @ordered
	 */
	protected EList<UserStory> userstories;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals()
	 * @generated
	 * @ordered
	 */
	protected EList<Goal> goals;

	/**
	 * The cached value of the '{@link #getRoles() <em>Roles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoles()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> roles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductBacklogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStoriesPackage.Literals.PRODUCT_BACKLOG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<UserStory> getUserstories() {
		if (userstories == null) {
			userstories = new EObjectContainmentEList<UserStory>(UserStory.class, this, UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES);
		}
		return userstories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.PRODUCT_BACKLOG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Goal> getGoals() {
		if (goals == null) {
			goals = new EObjectContainmentEList<Goal>(Goal.class, this, UserStoriesPackage.PRODUCT_BACKLOG__GOALS);
		}
		return goals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRoles() {
		if (roles == null) {
			roles = new EObjectContainmentEList<Role>(Role.class, this, UserStoriesPackage.PRODUCT_BACKLOG__ROLES);
		}
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES:
				return ((InternalEList<?>)getUserstories()).basicRemove(otherEnd, msgs);
			case UserStoriesPackage.PRODUCT_BACKLOG__GOALS:
				return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
			case UserStoriesPackage.PRODUCT_BACKLOG__ROLES:
				return ((InternalEList<?>)getRoles()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES:
				return getUserstories();
			case UserStoriesPackage.PRODUCT_BACKLOG__NAME:
				return getName();
			case UserStoriesPackage.PRODUCT_BACKLOG__GOALS:
				return getGoals();
			case UserStoriesPackage.PRODUCT_BACKLOG__ROLES:
				return getRoles();
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
			case UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES:
				getUserstories().clear();
				getUserstories().addAll((Collection<? extends UserStory>)newValue);
				return;
			case UserStoriesPackage.PRODUCT_BACKLOG__NAME:
				setName((String)newValue);
				return;
			case UserStoriesPackage.PRODUCT_BACKLOG__GOALS:
				getGoals().clear();
				getGoals().addAll((Collection<? extends Goal>)newValue);
				return;
			case UserStoriesPackage.PRODUCT_BACKLOG__ROLES:
				getRoles().clear();
				getRoles().addAll((Collection<? extends Role>)newValue);
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
			case UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES:
				getUserstories().clear();
				return;
			case UserStoriesPackage.PRODUCT_BACKLOG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UserStoriesPackage.PRODUCT_BACKLOG__GOALS:
				getGoals().clear();
				return;
			case UserStoriesPackage.PRODUCT_BACKLOG__ROLES:
				getRoles().clear();
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
			case UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES:
				return userstories != null && !userstories.isEmpty();
			case UserStoriesPackage.PRODUCT_BACKLOG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UserStoriesPackage.PRODUCT_BACKLOG__GOALS:
				return goals != null && !goals.isEmpty();
			case UserStoriesPackage.PRODUCT_BACKLOG__ROLES:
				return roles != null && !roles.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProductBacklogImpl
