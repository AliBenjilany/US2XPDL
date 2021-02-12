/**
 */
package UserStories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.Task#getTeammembers <em>Teammembers</em>}</li>
 *   <li>{@link UserStories.Task#getException <em>Exception</em>}</li>
 *   <li>{@link UserStories.Task#getNext <em>Next</em>}</li>
 *   <li>{@link UserStories.Task#getLast <em>Last</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Teammembers</b></em>' reference list.
	 * The list contents are of type {@link UserStories.TeamMember}.
	 * It is bidirectional and its opposite is '{@link UserStories.TeamMember#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teammembers</em>' reference list.
	 * @see UserStories.UserStoriesPackage#getTask_Teammembers()
	 * @see UserStories.TeamMember#getTasks
	 * @model opposite="tasks" required="true"
	 * @generated
	 */
	EList<TeamMember> getTeammembers();

	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UserStories.Exception#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(UserStories.Exception)
	 * @see UserStories.UserStoriesPackage#getTask_Exception()
	 * @see UserStories.Exception#getTasks
	 * @model opposite="tasks"
	 * @generated
	 */
	UserStories.Exception getException();

	/**
	 * Sets the value of the '{@link UserStories.Task#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(UserStories.Exception value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UserStories.Task#getLast <em>Last</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Task)
	 * @see UserStories.UserStoriesPackage#getTask_Next()
	 * @see UserStories.Task#getLast
	 * @model opposite="last"
	 * @generated
	 */
	Task getNext();

	/**
	 * Sets the value of the '{@link UserStories.Task#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Task value);

	/**
	 * Returns the value of the '<em><b>Last</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UserStories.Task#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last</em>' reference.
	 * @see #setLast(Task)
	 * @see UserStories.UserStoriesPackage#getTask_Last()
	 * @see UserStories.Task#getNext
	 * @model opposite="next"
	 * @generated
	 */
	Task getLast();

	/**
	 * Sets the value of the '{@link UserStories.Task#getLast <em>Last</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last</em>' reference.
	 * @see #getLast()
	 * @generated
	 */
	void setLast(Task value);

} // Task
