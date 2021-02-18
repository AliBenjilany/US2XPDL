/**
 */
package UserStories;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UserStories.UserStoriesFactory
 * @model kind="package"
 * @generated
 */
public interface UserStoriesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UserStories";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://userstories.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UserStories";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UserStoriesPackage eINSTANCE = UserStories.impl.UserStoriesPackageImpl.init();

	/**
	 * The meta object id for the '{@link UserStories.impl.ProductBacklogImpl <em>Product Backlog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.ProductBacklogImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getProductBacklog()
	 * @generated
	 */
	int PRODUCT_BACKLOG = 0;

	/**
	 * The feature id for the '<em><b>Userstories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG__USERSTORIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG__NAME = 1;

	/**
	 * The feature id for the '<em><b>Goals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG__GOALS = 2;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG__ROLES = 3;

	/**
	 * The number of structural features of the '<em>Product Backlog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Product Backlog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_BACKLOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.UserStoryImpl <em>User Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.UserStoryImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getUserStory()
	 * @generated
	 */
	int USER_STORY = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ROLE = 1;

	/**
	 * The feature id for the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__GOAL = 2;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY__ELEMENTS = 3;

	/**
	 * The number of structural features of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_STORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.ElementImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 14;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.TaskImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.RoleImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.GoalImpl <em>Goal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.GoalImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getGoal()
	 * @generated
	 */
	int GOAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Goal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.ExceptionImpl <em>Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.ExceptionImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__NAME = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION__TASK = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.EventImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = EXCEPTION__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TASK = EXCEPTION__TASK;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.StartEventImpl <em>Start Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.StartEventImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getStartEvent()
	 * @generated
	 */
	int START_EVENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT__TASK = EVENT__TASK;

	/**
	 * The number of structural features of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.IntermediateEventImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getIntermediateEvent()
	 * @generated
	 */
	int INTERMEDIATE_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT__TASK = EVENT__TASK;

	/**
	 * The number of structural features of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Intermediate Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERMEDIATE_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.EndEventImpl <em>End Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.EndEventImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getEndEvent()
	 * @generated
	 */
	int END_EVENT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT__TASK = EVENT__TASK;

	/**
	 * The number of structural features of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.ConditionImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = EXCEPTION__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TASK = EXCEPTION__TASK;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = EXCEPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = EXCEPTION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link UserStories.impl.InclusiveImpl <em>Inclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.InclusiveImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getInclusive()
	 * @generated
	 */
	int INCLUSIVE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE__TASK = CONDITION__TASK;

	/**
	 * The number of structural features of the '<em>Inclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Inclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUSIVE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.ExclusiveImpl <em>Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.ExclusiveImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getExclusive()
	 * @generated
	 */
	int EXCLUSIVE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__TASK = CONDITION__TASK;

	/**
	 * The number of structural features of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UserStories.impl.ParallelImpl <em>Parallel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UserStories.impl.ParallelImpl
	 * @see UserStories.impl.UserStoriesPackageImpl#getParallel()
	 * @generated
	 */
	int PARALLEL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL__TASK = CONDITION__TASK;

	/**
	 * The number of structural features of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link UserStories.ProductBacklog <em>Product Backlog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Backlog</em>'.
	 * @see UserStories.ProductBacklog
	 * @generated
	 */
	EClass getProductBacklog();

	/**
	 * Returns the meta object for the containment reference list '{@link UserStories.ProductBacklog#getUserstories <em>Userstories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Userstories</em>'.
	 * @see UserStories.ProductBacklog#getUserstories()
	 * @see #getProductBacklog()
	 * @generated
	 */
	EReference getProductBacklog_Userstories();

	/**
	 * Returns the meta object for the attribute '{@link UserStories.ProductBacklog#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserStories.ProductBacklog#getName()
	 * @see #getProductBacklog()
	 * @generated
	 */
	EAttribute getProductBacklog_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UserStories.ProductBacklog#getGoals <em>Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Goals</em>'.
	 * @see UserStories.ProductBacklog#getGoals()
	 * @see #getProductBacklog()
	 * @generated
	 */
	EReference getProductBacklog_Goals();

	/**
	 * Returns the meta object for the containment reference list '{@link UserStories.ProductBacklog#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see UserStories.ProductBacklog#getRoles()
	 * @see #getProductBacklog()
	 * @generated
	 */
	EReference getProductBacklog_Roles();

	/**
	 * Returns the meta object for class '{@link UserStories.UserStory <em>User Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Story</em>'.
	 * @see UserStories.UserStory
	 * @generated
	 */
	EClass getUserStory();

	/**
	 * Returns the meta object for the attribute '{@link UserStories.UserStory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see UserStories.UserStory#getId()
	 * @see #getUserStory()
	 * @generated
	 */
	EAttribute getUserStory_Id();

	/**
	 * Returns the meta object for the reference '{@link UserStories.UserStory#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Role</em>'.
	 * @see UserStories.UserStory#getRole()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Role();

	/**
	 * Returns the meta object for the reference '{@link UserStories.UserStory#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Goal</em>'.
	 * @see UserStories.UserStory#getGoal()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Goal();

	/**
	 * Returns the meta object for the containment reference list '{@link UserStories.UserStory#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see UserStories.UserStory#getElements()
	 * @see #getUserStory()
	 * @generated
	 */
	EReference getUserStory_Elements();

	/**
	 * Returns the meta object for class '{@link UserStories.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see UserStories.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link UserStories.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserStories.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for class '{@link UserStories.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see UserStories.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link UserStories.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserStories.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for class '{@link UserStories.Goal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goal</em>'.
	 * @see UserStories.Goal
	 * @generated
	 */
	EClass getGoal();

	/**
	 * Returns the meta object for the attribute '{@link UserStories.Goal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserStories.Goal#getName()
	 * @see #getGoal()
	 * @generated
	 */
	EAttribute getGoal_Name();

	/**
	 * Returns the meta object for class '{@link UserStories.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exception</em>'.
	 * @see UserStories.Exception
	 * @generated
	 */
	EClass getException();

	/**
	 * Returns the meta object for the attribute '{@link UserStories.Exception#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UserStories.Exception#getName()
	 * @see #getException()
	 * @generated
	 */
	EAttribute getException_Name();

	/**
	 * Returns the meta object for the reference '{@link UserStories.Exception#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Task</em>'.
	 * @see UserStories.Exception#getTask()
	 * @see #getException()
	 * @generated
	 */
	EReference getException_Task();

	/**
	 * Returns the meta object for class '{@link UserStories.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see UserStories.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link UserStories.StartEvent <em>Start Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Event</em>'.
	 * @see UserStories.StartEvent
	 * @generated
	 */
	EClass getStartEvent();

	/**
	 * Returns the meta object for class '{@link UserStories.IntermediateEvent <em>Intermediate Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intermediate Event</em>'.
	 * @see UserStories.IntermediateEvent
	 * @generated
	 */
	EClass getIntermediateEvent();

	/**
	 * Returns the meta object for class '{@link UserStories.EndEvent <em>End Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Event</em>'.
	 * @see UserStories.EndEvent
	 * @generated
	 */
	EClass getEndEvent();

	/**
	 * Returns the meta object for class '{@link UserStories.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see UserStories.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link UserStories.Inclusive <em>Inclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inclusive</em>'.
	 * @see UserStories.Inclusive
	 * @generated
	 */
	EClass getInclusive();

	/**
	 * Returns the meta object for class '{@link UserStories.Exclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive</em>'.
	 * @see UserStories.Exclusive
	 * @generated
	 */
	EClass getExclusive();

	/**
	 * Returns the meta object for class '{@link UserStories.Parallel <em>Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel</em>'.
	 * @see UserStories.Parallel
	 * @generated
	 */
	EClass getParallel();

	/**
	 * Returns the meta object for class '{@link UserStories.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see UserStories.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UserStoriesFactory getUserStoriesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UserStories.impl.ProductBacklogImpl <em>Product Backlog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.ProductBacklogImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getProductBacklog()
		 * @generated
		 */
		EClass PRODUCT_BACKLOG = eINSTANCE.getProductBacklog();

		/**
		 * The meta object literal for the '<em><b>Userstories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG__USERSTORIES = eINSTANCE.getProductBacklog_Userstories();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_BACKLOG__NAME = eINSTANCE.getProductBacklog_Name();

		/**
		 * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG__GOALS = eINSTANCE.getProductBacklog_Goals();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_BACKLOG__ROLES = eINSTANCE.getProductBacklog_Roles();

		/**
		 * The meta object literal for the '{@link UserStories.impl.UserStoryImpl <em>User Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.UserStoryImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getUserStory()
		 * @generated
		 */
		EClass USER_STORY = eINSTANCE.getUserStory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_STORY__ID = eINSTANCE.getUserStory_Id();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__ROLE = eINSTANCE.getUserStory_Role();

		/**
		 * The meta object literal for the '<em><b>Goal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__GOAL = eINSTANCE.getUserStory_Goal();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_STORY__ELEMENTS = eINSTANCE.getUserStory_Elements();

		/**
		 * The meta object literal for the '{@link UserStories.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.TaskImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '{@link UserStories.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.RoleImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '{@link UserStories.impl.GoalImpl <em>Goal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.GoalImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getGoal()
		 * @generated
		 */
		EClass GOAL = eINSTANCE.getGoal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

		/**
		 * The meta object literal for the '{@link UserStories.impl.ExceptionImpl <em>Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.ExceptionImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getException()
		 * @generated
		 */
		EClass EXCEPTION = eINSTANCE.getException();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPTION__NAME = eINSTANCE.getException_Name();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPTION__TASK = eINSTANCE.getException_Task();

		/**
		 * The meta object literal for the '{@link UserStories.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.EventImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link UserStories.impl.StartEventImpl <em>Start Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.StartEventImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getStartEvent()
		 * @generated
		 */
		EClass START_EVENT = eINSTANCE.getStartEvent();

		/**
		 * The meta object literal for the '{@link UserStories.impl.IntermediateEventImpl <em>Intermediate Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.IntermediateEventImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getIntermediateEvent()
		 * @generated
		 */
		EClass INTERMEDIATE_EVENT = eINSTANCE.getIntermediateEvent();

		/**
		 * The meta object literal for the '{@link UserStories.impl.EndEventImpl <em>End Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.EndEventImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getEndEvent()
		 * @generated
		 */
		EClass END_EVENT = eINSTANCE.getEndEvent();

		/**
		 * The meta object literal for the '{@link UserStories.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.ConditionImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link UserStories.impl.InclusiveImpl <em>Inclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.InclusiveImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getInclusive()
		 * @generated
		 */
		EClass INCLUSIVE = eINSTANCE.getInclusive();

		/**
		 * The meta object literal for the '{@link UserStories.impl.ExclusiveImpl <em>Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.ExclusiveImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getExclusive()
		 * @generated
		 */
		EClass EXCLUSIVE = eINSTANCE.getExclusive();

		/**
		 * The meta object literal for the '{@link UserStories.impl.ParallelImpl <em>Parallel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.ParallelImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getParallel()
		 * @generated
		 */
		EClass PARALLEL = eINSTANCE.getParallel();

		/**
		 * The meta object literal for the '{@link UserStories.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UserStories.impl.ElementImpl
		 * @see UserStories.impl.UserStoriesPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

	}

} //UserStoriesPackage
