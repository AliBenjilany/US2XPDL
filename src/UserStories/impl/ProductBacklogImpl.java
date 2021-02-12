/**
 */
package UserStories.impl;

import UserStories.ProductBacklog;
import UserStories.UserStoriesPackage;
import UserStories.UserStory;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserStoriesPackage.PRODUCT_BACKLOG__USERSTORIES:
				return ((InternalEList<?>)getUserstories()).basicRemove(otherEnd, msgs);
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
		}
		return super.eIsSet(featureID);
	}

} //ProductBacklogImpl
