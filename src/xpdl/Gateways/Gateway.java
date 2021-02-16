/**
 */
package xpdl.Gateways;

import xpdl.FlowObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xpdl.Gateways.Gateway#getName <em>Name</em>}</li>
 *   <li>{@link xpdl.Gateways.Gateway#isSplit <em>Split</em>}</li>
 * </ul>
 *
 * @see xpdl.Gateways.GatewaysPackage#getGateway()
 * @model abstract="true"
 * @generated
 */
public interface Gateway extends FlowObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see xpdl.Gateways.GatewaysPackage#getGateway_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link xpdl.Gateways.Gateway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Split</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Split</em>' attribute.
	 * @see #setSplit(boolean)
	 * @see xpdl.Gateways.GatewaysPackage#getGateway_Split()
	 * @model default="True" required="true"
	 * @generated
	 */
	boolean isSplit();

	/**
	 * Sets the value of the '{@link xpdl.Gateways.Gateway#isSplit <em>Split</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Split</em>' attribute.
	 * @see #isSplit()
	 * @generated
	 */
	void setSplit(boolean value);

} // Gateway
