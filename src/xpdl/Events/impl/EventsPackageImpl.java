/**
 */
package xpdl.Events.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import xpdl.Activities.ActivitiesPackage;

import xpdl.Activities.impl.ActivitiesPackageImpl;

import xpdl.Events.Event;
import xpdl.Events.EventEnd;
import xpdl.Events.EventIntermediate;
import xpdl.Events.EventStart;
import xpdl.Events.EventsFactory;
import xpdl.Events.EventsPackage;

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
public class EventsPackageImpl extends EPackageImpl implements EventsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventStartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventIntermediateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEndEClass = null;

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
	 * @see xpdl.Events.EventsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EventsPackageImpl() {
		super(eNS_URI, EventsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link EventsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EventsPackage init() {
		if (isInited) return (EventsPackage)EPackage.Registry.INSTANCE.getEPackage(EventsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEventsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EventsPackageImpl theEventsPackage = registeredEventsPackage instanceof EventsPackageImpl ? (EventsPackageImpl)registeredEventsPackage : new EventsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(XpdlPackage.eNS_URI);
		XpdlPackageImpl theXpdlPackage = (XpdlPackageImpl)(registeredPackage instanceof XpdlPackageImpl ? registeredPackage : XpdlPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ActivitiesPackage.eNS_URI);
		ActivitiesPackageImpl theActivitiesPackage = (ActivitiesPackageImpl)(registeredPackage instanceof ActivitiesPackageImpl ? registeredPackage : ActivitiesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GatewaysPackage.eNS_URI);
		GatewaysPackageImpl theGatewaysPackage = (GatewaysPackageImpl)(registeredPackage instanceof GatewaysPackageImpl ? registeredPackage : GatewaysPackage.eINSTANCE);

		// Create package meta-data objects
		theEventsPackage.createPackageContents();
		theXpdlPackage.createPackageContents();
		theActivitiesPackage.createPackageContents();
		theGatewaysPackage.createPackageContents();

		// Initialize created meta-data
		theEventsPackage.initializePackageContents();
		theXpdlPackage.initializePackageContents();
		theActivitiesPackage.initializePackageContents();
		theGatewaysPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEventsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EventsPackage.eNS_URI, theEventsPackage);
		return theEventsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventStart() {
		return eventStartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventIntermediate() {
		return eventIntermediateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventEnd() {
		return eventEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventsFactory getEventsFactory() {
		return (EventsFactory)getEFactoryInstance();
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
		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);

		eventStartEClass = createEClass(EVENT_START);

		eventIntermediateEClass = createEClass(EVENT_INTERMEDIATE);

		eventEndEClass = createEClass(EVENT_END);
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
		eventEClass.getESuperTypes().add(theXpdlPackage.getFlowObject());
		eventStartEClass.getESuperTypes().add(this.getEvent());
		eventIntermediateEClass.getESuperTypes().add(this.getEvent());
		eventEndEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventStartEClass, EventStart.class, "EventStart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventIntermediateEClass, EventIntermediate.class, "EventIntermediate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventEndEClass, EventEnd.class, "EventEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //EventsPackageImpl
