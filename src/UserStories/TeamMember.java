/**
 */
package UserStories;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UserStories.TeamMember#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see UserStories.UserStoriesPackage#getTeamMember()
 * @model
 * @generated
 */
public interface TeamMember extends Person {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link UserStories.Task}.
	 * It is bidirectional and its opposite is '{@link UserStories.Task#getTeammembers <em>Teammembers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see UserStories.UserStoriesPackage#getTeamMember_Tasks()
	 * @see UserStories.Task#getTeammembers
	 * @model opposite="teammembers"
	 * @generated
	 */
	EList<Task> getTasks();

} // TeamMember
