/**
 */
package UserStories.impl;

import UserStories.Condition;
import UserStories.Event;
import UserStories.Person;
import UserStories.ProductBacklog;
import UserStories.Task;
import UserStories.TeamMember;
import UserStories.UserStoriesFactory;
import UserStories.UserStoriesPackage;
import UserStories.UserStory;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserStoriesFactoryImpl extends EFactoryImpl implements UserStoriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UserStoriesFactory init() {
		try {
			UserStoriesFactory theUserStoriesFactory = (UserStoriesFactory)EPackage.Registry.INSTANCE.getEFactory(UserStoriesPackage.eNS_URI);
			if (theUserStoriesFactory != null) {
				return theUserStoriesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UserStoriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStoriesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UserStoriesPackage.PRODUCT_BACKLOG: return createProductBacklog();
			case UserStoriesPackage.USER_STORY: return createUserStory();
			case UserStoriesPackage.TASK: return createTask();
			case UserStoriesPackage.PERSON: return createPerson();
			case UserStoriesPackage.TEAM_MEMBER: return createTeamMember();
			case UserStoriesPackage.CONDITION: return createCondition();
			case UserStoriesPackage.EVENT: return createEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProductBacklog createProductBacklog() {
		ProductBacklogImpl productBacklog = new ProductBacklogImpl();
		return productBacklog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserStory createUserStory() {
		UserStoryImpl userStory = new UserStoryImpl();
		return userStory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeamMember createTeamMember() {
		TeamMemberImpl teamMember = new TeamMemberImpl();
		return teamMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UserStoriesPackage getUserStoriesPackage() {
		return (UserStoriesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UserStoriesPackage getPackage() {
		return UserStoriesPackage.eINSTANCE;
	}

} //UserStoriesFactoryImpl
