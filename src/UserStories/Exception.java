/**
 */
package UserStories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.Exception#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getException()
 * @model abstract="true"
 * @generated
 */
public interface Exception extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link UserStories.Task}.
	 * It is bidirectional and its opposite is '{@link UserStories.Task#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see UserStories.UserStoriesPackage#getException_Tasks()
	 * @see UserStories.Task#getException
	 * @model opposite="exception"
	 * @generated
	 */
	EList<Task> getTasks();

} // Exception
