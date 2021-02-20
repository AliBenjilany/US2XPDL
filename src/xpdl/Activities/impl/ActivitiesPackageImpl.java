/**
 */
package xpdl.Activities.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xpdl.Activities.ActivitiesFactory;
import xpdl.Activities.ActivitiesPackage;
import xpdl.Activities.Activity;
import xpdl.Activities.Call;
import xpdl.Activities.SubProcess;
import xpdl.Activities.Task;
import xpdl.Activities.Transaction;

import xpdl.Events.EventsPackage;

import xpdl.Events.impl.EventsPackageImpl;

import xpdl.Gateways.GatewaysPackage;

import xpdl.Gateways.impl.GatewaysPackageImpl;

import xpdl.XpdlPackage;

import xpdl.impl.XpdlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActivitiesPackageImpl extends EPackageImpl implements ActivitiesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subProcessEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see xpdl.Activities.ActivitiesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ActivitiesPackageImpl() {
		super(eNS_URI, ActivitiesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ActivitiesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ActivitiesPackage init() {
		if (isInited) return (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredActivitiesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ActivitiesPackageImpl theActivitiesPackage = registeredActivitiesPackage instanceof ActivitiesPackageImpl ? (ActivitiesPackageImpl)registeredActivitiesPackage : new ActivitiesPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XpdlPackage.eNS_URI);
		XpdlPackageImpl theXpdlPackage = (XpdlPackageImpl)(registeredPackage instanceof XpdlPackageImpl ? registeredPackage : XpdlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(registeredPackage instanceof EventsPackageImpl ? registeredPackage : EventsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GatewaysPackage.eNS_URI);
		GatewaysPackageImpl theGatewaysPackage = (GatewaysPackageImpl)(registeredPackage instanceof GatewaysPackageImpl ? registeredPackage : GatewaysPackage.eINSTANCE);

		// Create package meta-data objects
		theActivitiesPackage.createPackageContents();
		theXpdlPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theGatewaysPackage.createPackageContents();

		// Initialize created meta-data
		theActivitiesPackage.initializePackageContents();
		theXpdlPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theGatewaysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theActivitiesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ActivitiesPackage.eNS_URI, theActivitiesPackage);
		return theActivitiesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Name() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubProcess() {
		return subProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubProcess_SubProcess() {
		return (EReference)subProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivitiesFactory getActivitiesFactory() {
		return (ActivitiesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__NAME);

		taskEClass = createEClass(TASK);

		callEClass = createEClass(CALL);

		transactionEClass = createEClass(TRANSACTION);

		subProcessEClass = createEClass(SUB_PROCESS);
		createEReference(subProcessEClass, SUB_PROCESS__SUB_PROCESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XpdlPackage theXpdlPackage = (XpdlPackage)EPackage.Registry.INSTANCE.getEPackage(XpdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		activityEClass.getESuperTypes().add(theXpdlPackage.getFlowObject());
		taskEClass.getESuperTypes().add(this.getActivity());
		callEClass.getESuperTypes().add(this.getActivity());
		transactionEClass.getESuperTypes().add(this.getActivity());
		subProcessEClass.getESuperTypes().add(this.getActivity());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityEClass, Activity.class, "Activity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Name(), ecorePackage.getEString(), "name", null, 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subProcessEClass, SubProcess.class, "SubProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubProcess_SubProcess(), theXpdlPackage.getProcess(), null, "SubProcess", null, 1, 1, SubProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //ActivitiesPackageImpl
