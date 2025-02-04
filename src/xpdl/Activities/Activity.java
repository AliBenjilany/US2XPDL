/**
 */
package xpdl.Activities;

import xpdl.FlowObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Activities.Activity#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see xpdl.Activities.ActivitiesPackage#getActivity()
 * @model abstract="true"
 * @generated
 */
public interface Activity extends FlowObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xpdl.Activities.ActivitiesPackage#getActivity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xpdl.Activities.Activity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Activity
