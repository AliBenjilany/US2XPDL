/**
 */
package xpdl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xpdl.Activities.ActivitiesPackage;

import xpdl.Activities.impl.ActivitiesPackageImpl;

import xpdl.Events.EventsPackage;

import xpdl.Events.impl.EventsPackageImpl;

import xpdl.FlowObject;

import xpdl.Gateways.GatewaysPackage;

import xpdl.Gateways.impl.GatewaysPackageImpl;

import xpdl.Lane;
import xpdl.Pool;
import xpdl.XpdlFactory;
import xpdl.XpdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XpdlPackageImpl extends EPackageImpl implements XpdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowObjectEClass = null;

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
	 * @see xpdl.XpdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XpdlPackageImpl() {
		super(eNS_URI, XpdlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link XpdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static XpdlPackage init() {
		if (isInited) return (XpdlPackage)EPackage.Registry.INSTANCE.getEPackage(XpdlPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredXpdlPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		XpdlPackageImpl theXpdlPackage = registeredXpdlPackage instanceof XpdlPackageImpl ? (XpdlPackageImpl)registeredXpdlPackage : new XpdlPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(registeredPackage instanceof ActivitiesPackageImpl ? registeredPackage : ActivitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(registeredPackage instanceof EventsPackageImpl ? registeredPackage : EventsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GatewaysPackage.eNS_URI);
		GatewaysPackageImpl theGatewaysPackage = (GatewaysPackageImpl)(registeredPackage instanceof GatewaysPackageImpl ? registeredPackage : GatewaysPackage.eINSTANCE);

		// Create package meta-data objects
		theXpdlPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theEventsPackage.createPackageContents();
		theGatewaysPackage.createPackageContents();

		// Initialize created meta-data
		theXpdlPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();
		theGatewaysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXpdlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(XpdlPackage.eNS_URI, theXpdlPackage);
		return theXpdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcess() {
		return processEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcess_Objective() {
		return (EAttribute)processEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcess_Pool() {
		return (EReference)processEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPool() {
		return poolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPool_Name() {
		return (EAttribute)poolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPool_Lanes() {
		return (EReference)poolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLane() {
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLane_Name() {
		return (EAttribute)laneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLane_Flowobject() {
		return (EReference)laneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlowObject() {
		return flowObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFlowObject_Target() {
		return (EReference)flowObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XpdlFactory getXpdlFactory() {
		return (XpdlFactory)getEFactoryInstance();
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
		processEClass = createEClass(PROCESS);
		createEAttribute(processEClass, PROCESS__OBJECTIVE);
		createEReference(processEClass, PROCESS__POOL);

		poolEClass = createEClass(POOL);
		createEAttribute(poolEClass, POOL__NAME);
		createEReference(poolEClass, POOL__LANES);

		laneEClass = createEClass(LANE);
		createEAttribute(laneEClass, LANE__NAME);
		createEReference(laneEClass, LANE__FLOWOBJECT);

		flowObjectEClass = createEClass(FLOW_OBJECT);
		createEReference(flowObjectEClass, FLOW_OBJECT__TARGET);
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
		ActivitiesPackage theActivitiesPackage = (ActivitiesPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		EventsPackage theEventsPackage = (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		GatewaysPackage theGatewaysPackage = (GatewaysPackage)EPackage.Registry.INSTANCE.getEPackage(GatewaysPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theActivitiesPackage);
		getESubpackages().add(theEventsPackage);
		getESubpackages().add(theGatewaysPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(processEClass, xpdl.Process.class, "Process", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcess_Objective(), ecorePackage.getEString(), "objective", "No objective set for this process", 1, 1, xpdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcess_Pool(), this.getPool(), null, "pool", null, 1, -1, xpdl.Process.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poolEClass, Pool.class, "Pool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPool_Name(), ecorePackage.getEString(), "name", null, 1, 1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPool_Lanes(), this.getLane(), null, "lanes", null, 1, -1, Pool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(laneEClass, Lane.class, "Lane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLane_Name(), ecorePackage.getEString(), "name", null, 1, 1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLane_Flowobject(), this.getFlowObject(), null, "flowobject", null, 1, -1, Lane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowObjectEClass, FlowObject.class, "FlowObject", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlowObject_Target(), this.getFlowObject(), null, "target", null, 0, -1, FlowObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //XpdlPackageImpl
