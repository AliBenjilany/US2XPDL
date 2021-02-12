/**
 */
package UserStories.impl;

import UserStories.Task;
import UserStories.TeamMember;
import UserStories.UserStoriesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UserStories.impl.TaskImpl#getTeammembers <em>Teammembers</em>}</li>
 *   <li>{@link UserStories.impl.TaskImpl#getException <em>Exception</em>}</li>
 *   <li>{@link UserStories.impl.TaskImpl#getNext <em>Next</em>}</li>
 *   <li>{@link UserStories.impl.TaskImpl#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The cached value of the '{@link #getTeammembers() <em>Teammembers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeammembers()
	 * @generated
	 * @ordered
	 */
	protected EList<TeamMember> teammembers;

	/**
	 * The cached value of the '{@link #getException() <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getException()
	 * @generated
	 * @ordered
	 */
	protected UserStories.Exception exception;

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
	 * The cached value of the '{@link #getLast() <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLast()
	 * @generated
	 * @ordered
	 */
	protected Task last;

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
	public EList<TeamMember> getTeammembers() {
		if (teammembers == null) {
			teammembers = new EObjectWithInverseResolvingEList.ManyInverse<TeamMember>(TeamMember.class, this, UserStoriesPackage.TASK__TEAMMEMBERS, UserStoriesPackage.TEAM_MEMBER__TASKS);
		}
		return teammembers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserStories.Exception getException() {
		if (exception != null && exception.eIsProxy()) {
			InternalEObject oldException = (InternalEObject)exception;
			exception = (UserStories.Exception)eResolveProxy(oldException);
			if (exception != oldException) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserStoriesPackage.TASK__EXCEPTION, oldException, exception));
			}
		}
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStories.Exception basicGetException() {
		return exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetException(UserStories.Exception newException, NotificationChain msgs) {
		UserStories.Exception oldException = exception;
		exception = newException;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__EXCEPTION, oldException, newException);
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
	public void setException(UserStories.Exception newException) {
		if (newException != exception) {
			NotificationChain msgs = null;
			if (exception != null)
				msgs = ((InternalEObject)exception).eInverseRemove(this, UserStoriesPackage.EXCEPTION__TASKS, UserStories.Exception.class, msgs);
			if (newException != null)
				msgs = ((InternalEObject)newException).eInverseAdd(this, UserStoriesPackage.EXCEPTION__TASKS, UserStories.Exception.class, msgs);
			msgs = basicSetException(newException, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__EXCEPTION, newException, newException));
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
	public NotificationChain basicSetNext(Task newNext, NotificationChain msgs) {
		Task oldNext = next;
		next = newNext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__NEXT, oldNext, newNext);
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
	public void setNext(Task newNext) {
		if (newNext != next) {
			NotificationChain msgs = null;
			if (next != null)
				msgs = ((InternalEObject)next).eInverseRemove(this, UserStoriesPackage.TASK__LAST, Task.class, msgs);
			if (newNext != null)
				msgs = ((InternalEObject)newNext).eInverseAdd(this, UserStoriesPackage.TASK__LAST, Task.class, msgs);
			msgs = basicSetNext(newNext, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__NEXT, newNext, newNext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task getLast() {
		if (last != null && last.eIsProxy()) {
			InternalEObject oldLast = (InternalEObject)last;
			last = (Task)eResolveProxy(oldLast);
			if (last != oldLast) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UserStoriesPackage.TASK__LAST, oldLast, last));
			}
		}
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetLast() {
		return last;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLast(Task newLast, NotificationChain msgs) {
		Task oldLast = last;
		last = newLast;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__LAST, oldLast, newLast);
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
	public void setLast(Task newLast) {
		if (newLast != last) {
			NotificationChain msgs = null;
			if (last != null)
				msgs = ((InternalEObject)last).eInverseRemove(this, UserStoriesPackage.TASK__NEXT, Task.class, msgs);
			if (newLast != null)
				msgs = ((InternalEObject)newLast).eInverseAdd(this, UserStoriesPackage.TASK__NEXT, Task.class, msgs);
			msgs = basicSetLast(newLast, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UserStoriesPackage.TASK__LAST, newLast, newLast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UserStoriesPackage.TASK__TEAMMEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeammembers()).basicAdd(otherEnd, msgs);
			case UserStoriesPackage.TASK__EXCEPTION:
				if (exception != null)
					msgs = ((InternalEObject)exception).eInverseRemove(this, UserStoriesPackage.EXCEPTION__TASKS, UserStories.Exception.class, msgs);
				return basicSetException((UserStories.Exception)otherEnd, msgs);
			case UserStoriesPackage.TASK__NEXT:
				if (next != null)
					msgs = ((InternalEObject)next).eInverseRemove(this, UserStoriesPackage.TASK__LAST, Task.class, msgs);
				return basicSetNext((Task)otherEnd, msgs);
			case UserStoriesPackage.TASK__LAST:
				if (last != null)
					msgs = ((InternalEObject)last).eInverseRemove(this, UserStoriesPackage.TASK__NEXT, Task.class, msgs);
				return basicSetLast((Task)otherEnd, msgs);
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
			case UserStoriesPackage.TASK__TEAMMEMBERS:
				return ((InternalEList<?>)getTeammembers()).basicRemove(otherEnd, msgs);
			case UserStoriesPackage.TASK__EXCEPTION:
				return basicSetException(null, msgs);
			case UserStoriesPackage.TASK__NEXT:
				return basicSetNext(null, msgs);
			case UserStoriesPackage.TASK__LAST:
				return basicSetLast(null, msgs);
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
			case UserStoriesPackage.TASK__TEAMMEMBERS:
				return getTeammembers();
			case UserStoriesPackage.TASK__EXCEPTION:
				if (resolve) return getException();
				return basicGetException();
			case UserStoriesPackage.TASK__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
			case UserStoriesPackage.TASK__LAST:
				if (resolve) return getLast();
				return basicGetLast();
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
			case UserStoriesPackage.TASK__TEAMMEMBERS:
				getTeammembers().clear();
				getTeammembers().addAll((Collection<? extends TeamMember>)newValue);
				return;
			case UserStoriesPackage.TASK__EXCEPTION:
				setException((UserStories.Exception)newValue);
				return;
			case UserStoriesPackage.TASK__NEXT:
				setNext((Task)newValue);
				return;
			case UserStoriesPackage.TASK__LAST:
				setLast((Task)newValue);
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
			case UserStoriesPackage.TASK__TEAMMEMBERS:
				getTeammembers().clear();
				return;
			case UserStoriesPackage.TASK__EXCEPTION:
				setException((UserStories.Exception)null);
				return;
			case UserStoriesPackage.TASK__NEXT:
				setNext((Task)null);
				return;
			case UserStoriesPackage.TASK__LAST:
				setLast((Task)null);
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
			case UserStoriesPackage.TASK__TEAMMEMBERS:
				return teammembers != null && !teammembers.isEmpty();
			case UserStoriesPackage.TASK__EXCEPTION:
				return exception != null;
			case UserStoriesPackage.TASK__NEXT:
				return next != null;
			case UserStoriesPackage.TASK__LAST:
				return last != null;
		}
		return super.eIsSet(featureID);
	}

} //TaskImpl
