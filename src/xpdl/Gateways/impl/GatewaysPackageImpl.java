/**
 */
package xpdl.Gateways.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xpdl.Activities.ActivitiesPackage;

import xpdl.Activities.impl.ActivitiesPackageImpl;

import xpdl.Events.EventsPackage;

import xpdl.Events.impl.EventsPackageImpl;
import xpdl.Gateways.Exclusive;
import xpdl.Gateways.Gateway;
import xpdl.Gateways.GatewaysFactory;
import xpdl.Gateways.GatewaysPackage;
import xpdl.Gateways.Inclusive;
import xpdl.Gateways.Parallel;
import xpdl.XpdlPackage;

import xpdl.impl.XpdlPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GatewaysPackageImpl extends EPackageImpl implements GatewaysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveEClass = null;

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
	 * @see xpdl.Gateways.GatewaysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GatewaysPackageImpl() {
		super(eNS_URI, GatewaysFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GatewaysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GatewaysPackage init() {
		if (isInited) return (GatewaysPackage)EPackage.Registry.INSTANCE.getEPackage(GatewaysPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGatewaysPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GatewaysPackageImpl theGatewaysPackage = registeredGatewaysPackage instanceof GatewaysPackageImpl ? (GatewaysPackageImpl)registeredGatewaysPackage : new GatewaysPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XpdlPackage.eNS_URI);
		XpdlPackageImpl theXpdlPackage = (XpdlPackageImpl)(registeredPackage instanceof XpdlPackageImpl ? registeredPackage : XpdlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(registeredPackage instanceof ActivitiesPackageImpl ? registeredPackage : ActivitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);
		EventsPackageImpl theEventsPackage = (EventsPackageImpl)(registeredPackage instanceof EventsPackageImpl ? registeredPackage : EventsPackage.eINSTANCE);

		// Create package meta-data objects
		theGatewaysPackage.createPackageContents();
		theXpdlPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theEventsPackage.createPackageContents();

		// Initialize created meta-data
		theGatewaysPackage.initializePackageContents();
		theXpdlPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theEventsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGatewaysPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GatewaysPackage.eNS_URI, theGatewaysPackage);
		return theGatewaysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGateway() {
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_Name() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGateway_Split() {
		return (EAttribute)gatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallel() {
		return parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInclusive() {
		return inclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExclusive() {
		return exclusiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GatewaysFactory getGatewaysFactory() {
		return (GatewaysFactory)getEFactoryInstance();
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
		gatewayEClass = createEClass(GATEWAY);
		createEAttribute(gatewayEClass, GATEWAY__NAME);
		createEAttribute(gatewayEClass, GATEWAY__SPLIT);

		parallelEClass = createEClass(PARALLEL);

		inclusiveEClass = createEClass(INCLUSIVE);

		exclusiveEClass = createEClass(EXCLUSIVE);
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
		gatewayEClass.getESuperTypes().add(theXpdlPackage.getFlowObject());
		parallelEClass.getESuperTypes().add(this.getGateway());
		inclusiveEClass.getESuperTypes().add(this.getGateway());
		exclusiveEClass.getESuperTypes().add(this.getGateway());

		// Initialize classes, features, and operations; add parameters
		initEClass(gatewayEClass, Gateway.class, "Gateway", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGateway_Name(), ecorePackage.getEString(), "Name", null, 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGateway_Split(), ecorePackage.getEBoolean(), "Split", "True", 1, 1, Gateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelEClass, Parallel.class, "Parallel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inclusiveEClass, Inclusive.class, "Inclusive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exclusiveEClass, Exclusive.class, "Exclusive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //GatewaysPackageImpl
