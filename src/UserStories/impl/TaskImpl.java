/**
 */
package UserStories.impl;

import UserStories.Task;
import UserStories.UserStoriesPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UserStories.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link UserStories.impl.TaskImpl#getNext <em>Next</em>}</li>
 *   <li>{@link UserStories.impl.TaskImpl#getFollowed_by <em>Followed by</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ElementImpl implements Task {
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
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Task next;

	/**
	 * The cached value of the '{@link #getFollowed_by() <em>Followed by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollowed_by()
	 * @generated
	 * @ordered
	 */
	protected UserStories.Exception followed_by;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UserStoriesPackage.Literals.TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Task)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserStoriesPackage.TASK__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNext(Task newNext) {
		Task oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserStories.Exception getFollowed_by() {
		if (followed_by != null && followed_by.eIsProxy()) {
			InternalEObject oldFollowed_by = (InternalEObject)followed_by;
			followed_by = (UserStories.Exception)eResolveProxy(oldFollowed_by);
			if (followed_by != oldFollowed_by) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserStoriesPackage.TASK__FOLLOWED_BY, oldFollowed_by, followed_by));
			}
		}
		return followed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStories.Exception basicGetFollowed_by() {
		return followed_by;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFollowed_by(UserStories.Exception newFollowed_by, NotificationChain msgs) {
		UserStories.Exception oldFollowed_by = followed_by;
		followed_by = newFollowed_by;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__FOLLOWED_BY, oldFollowed_by, newFollowed_by);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollowed_by(UserStories.Exception newFollowed_by) {
		if (newFollowed_by != followed_by) {
			NotificationChain msgs = null;
			if (followed_by != null)
				msgs = ((InternalEObject)followed_by).eInverseRemove(this, UserStoriesPackage.EXCEPTION__FOLLOWED_BY, UserStories.Exception.class, msgs);
			if (newFollowed_by != null)
				msgs = ((InternalEObject)newFollowed_by).eInverseAdd(this, UserStoriesPackage.EXCEPTION__FOLLOWED_BY, UserStories.Exception.class, msgs);
			msgs = basicSetFollowed_by(newFollowed_by, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__FOLLOWED_BY, newFollowed_by, newFollowed_by));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserStoriesPackage.TASK__FOLLOWED_BY:
				if (followed_by != null)
					msgs = ((InternalEObject)followed_by).eInverseRemove(this, UserStoriesPackage.EXCEPTION__FOLLOWED_BY, UserStories.Exception.class, msgs);
				return basicSetFollowed_by((UserStories.Exception)otherEnd, msgs);
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
			case UserStoriesPackage.TASK__FOLLOWED_BY:
				return basicSetFollowed_by(null, msgs);
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
			case UserStoriesPackage.TASK__NAME:
				return getName();
			case UserStoriesPackage.TASK__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case UserStoriesPackage.TASK__FOLLOWED_BY:
				if (resolve) return getFollowed_by();
				return basicGetFollowed_by();
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
			case UserStoriesPackage.TASK__NAME:
				setName((String)newValue);
				return;
			case UserStoriesPackage.TASK__NEXT:
				setNext((Task)newValue);
				return;
			case UserStoriesPackage.TASK__FOLLOWED_BY:
				setFollowed_by((UserStories.Exception)newValue);
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
			case UserStoriesPackage.TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UserStoriesPackage.TASK__NEXT:
				setNext((Task)null);
				return;
			case UserStoriesPackage.TASK__FOLLOWED_BY:
				setFollowed_by((UserStories.Exception)null);
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
			case UserStoriesPackage.TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UserStoriesPackage.TASK__NEXT:
				return next != null;
			case UserStoriesPackage.TASK__FOLLOWED_BY:
				return followed_by != null;
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

} //TaskImpl
