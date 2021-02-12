/**
 */
package UserStories;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.Person#getUserstories <em>Userstories</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Userstories</b></em>' reference list.
	 * The list contents are of type {@link UserStories.UserStory}.
	 * It is bidirectional and its opposite is '{@link UserStories.UserStory#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userstories</em>' reference list.
	 * @see UserStories.UserStoriesPackage#getPerson_Userstories()
	 * @see UserStories.UserStory#getPerson
	 * @model opposite="person"
	 * @generated
	 */
	EList<UserStory> getUserstories();

} // Person
