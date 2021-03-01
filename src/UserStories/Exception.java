/**
 */
package UserStories;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link UserStories.Exception#getFollowed_by <em>Followed by</em>}</li>
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
	 * Returns the value of the '<em><b>Followed by</b></em>' reference list.
	 * The list contents are of type {@link UserStories.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Followed by</em>' reference list.
	 * @see UserStories.UserStoriesPackage#getException_Followed_by()
	 * @model
	 * @generated
	 */
	EList<Task> getFollowed_by();

} // Exception
