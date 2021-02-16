/**
 */
package xpdl.Events;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see xpdl.Events.EventsPackage
 * @generated
 */
public interface EventsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EventsFactory eINSTANCE = xpdl.Events.impl.EventsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Event Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Start</em>'.
	 * @generated
	 */
	EventStart createEventStart();

	/**
	 * Returns a new object of class '<em>Event Intermediate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Intermediate</em>'.
	 * @generated
	 */
	EventIntermediate createEventIntermediate();

	/**
	 * Returns a new object of class '<em>Event End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event End</em>'.
	 * @generated
	 */
	EventEnd createEventEnd();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EventsPackage getEventsPackage();

} //EventsFactory
