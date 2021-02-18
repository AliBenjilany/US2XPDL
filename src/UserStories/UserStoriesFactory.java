/**
 */
package UserStories;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UserStories.UserStoriesPackage
 * @generated
 */
public interface UserStoriesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserStoriesFactory eINSTANCE = UserStories.impl.UserStoriesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Product Backlog</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Backlog</em>'.
	 * @generated
	 */
	ProductBacklog createProductBacklog();

	/**
	 * Returns a new object of class '<em>User Story</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Story</em>'.
	 * @generated
	 */
	UserStory createUserStory();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Role</em>'.
	 * @generated
	 */
	Role createRole();

	/**
	 * Returns a new object of class '<em>Goal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goal</em>'.
	 * @generated
	 */
	Goal createGoal();

	/**
	 * Returns a new object of class '<em>Start Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Event</em>'.
	 * @generated
	 */
	StartEvent createStartEvent();

	/**
	 * Returns a new object of class '<em>Intermediate Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Intermediate Event</em>'.
	 * @generated
	 */
	IntermediateEvent createIntermediateEvent();

	/**
	 * Returns a new object of class '<em>End Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Event</em>'.
	 * @generated
	 */
	EndEvent createEndEvent();

	/**
	 * Returns a new object of class '<em>Inclusive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inclusive</em>'.
	 * @generated
	 */
	Inclusive createInclusive();

	/**
	 * Returns a new object of class '<em>Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive</em>'.
	 * @generated
	 */
	Exclusive createExclusive();

	/**
	 * Returns a new object of class '<em>Parallel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel</em>'.
	 * @generated
	 */
	Parallel createParallel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UserStoriesPackage getUserStoriesPackage();

} //UserStoriesFactory
