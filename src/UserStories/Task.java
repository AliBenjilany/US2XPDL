/**
 */
package UserStories;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.Task#getName <em>Name</em>}</li>
 *   <li>{@link UserStories.Task#getNext <em>Next</em>}</li>
 *   <li>{@link UserStories.Task#getFollowed_by <em>Followed by</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends Element {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UserStories.UserStoriesPackage#getTask_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UserStories.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Task)
	 * @see UserStories.UserStoriesPackage#getTask_Next()
	 * @model
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
	 * Returns the value of the '<em><b>Followed by</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UserStories.Exception#getFollowed_by <em>Followed by</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followed by</em>' reference.
	 * @see #setFollowed_by(UserStories.Exception)
	 * @see UserStories.UserStoriesPackage#getTask_Followed_by()
	 * @see UserStories.Exception#getFollowed_by
	 * @model opposite="followed_by"
	 * @generated
	 */
	UserStories.Exception getFollowed_by();

	/**
	 * Sets the value of the '{@link UserStories.Task#getFollowed_by <em>Followed by</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Followed by</em>' reference.
	 * @see #getFollowed_by()
	 * @generated
	 */
	void setFollowed_by(UserStories.Exception value);

} // Task
