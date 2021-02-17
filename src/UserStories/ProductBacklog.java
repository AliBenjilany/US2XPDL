/**
 */
package UserStories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Backlog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.ProductBacklog#getUserstories <em>Userstories</em>}</li>
 *   <li>{@link UserStories.ProductBacklog#getName <em>Name</em>}</li>
 *   <li>{@link UserStories.ProductBacklog#getGoals <em>Goals</em>}</li>
 *   <li>{@link UserStories.ProductBacklog#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getProductBacklog()
 * @model
 * @generated
 */
public interface ProductBacklog extends EObject {
	/**
	 * Returns the value of the '<em><b>Userstories</b></em>' containment reference list.
	 * The list contents are of type {@link UserStories.UserStory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userstories</em>' containment reference list.
	 * @see UserStories.UserStoriesPackage#getProductBacklog_Userstories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<UserStory> getUserstories();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UserStories.UserStoriesPackage#getProductBacklog_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UserStories.ProductBacklog#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
	 * The list contents are of type {@link UserStories.Goal}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals</em>' containment reference list.
	 * @see UserStories.UserStoriesPackage#getProductBacklog_Goals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Goal> getGoals();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link UserStories.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see UserStories.UserStoriesPackage#getProductBacklog_Roles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // ProductBacklog
