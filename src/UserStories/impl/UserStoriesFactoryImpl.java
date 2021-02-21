/**
 */
package UserStories.impl;

import UserStories.Event;
import UserStories.Exclusive;
import UserStories.Goal;
import UserStories.Inclusive;
import UserStories.Parallel;
import UserStories.ProductBacklog;
import UserStories.Role;
import UserStories.Task;
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
			case UserStoriesPackage.ROLE: return createRole();
			case UserStoriesPackage.GOAL: return createGoal();
			case UserStoriesPackage.EVENT: return createEvent();
			case UserStoriesPackage.INCLUSIVE: return createInclusive();
			case UserStoriesPackage.EXCLUSIVE: return createExclusive();
			case UserStoriesPackage.PARALLEL: return createParallel();
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
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Goal createGoal() {
		GoalImpl goal = new GoalImpl();
		return goal;
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
	public Inclusive createInclusive() {
		InclusiveImpl inclusive = new InclusiveImpl();
		return inclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exclusive createExclusive() {
		ExclusiveImpl exclusive = new ExclusiveImpl();
		return exclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parallel createParallel() {
		ParallelImpl parallel = new ParallelImpl();
		return parallel;
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
