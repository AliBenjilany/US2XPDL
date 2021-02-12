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

} // ProductBacklog
