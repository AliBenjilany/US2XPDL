/**
 */
package UserStories;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.Exception#getName <em>Name</em>}</li>
 *   <li>{@link UserStories.Exception#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getException()
 * @model abstract="true"
 * @generated
 */
public interface Exception extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UserStories.UserStoriesPackage#getException_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UserStories.Exception#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see UserStories.UserStoriesPackage#getException_Task()
	 * @model
	 * @generated
	 */
	Task getTask();

	/**
	 * Sets the value of the '{@link UserStories.Exception#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task value);

} // Exception
