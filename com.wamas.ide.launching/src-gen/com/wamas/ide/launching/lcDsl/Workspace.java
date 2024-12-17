/**
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.lcDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wamas.ide.launching.lcDsl.Workspace#getWorkspace <em>Workspace</em>}</li>
 * </ul>
 *
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject
{
  /**
   * Returns the value of the '<em><b>Workspace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace</em>' containment reference.
   * @see #setWorkspace(AnyPath)
   * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getWorkspace_Workspace()
   * @model containment="true"
   * @generated
   */
  AnyPath getWorkspace();

  /**
   * Sets the value of the '{@link com.wamas.ide.launching.lcDsl.Workspace#getWorkspace <em>Workspace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Workspace</em>' containment reference.
   * @see #getWorkspace()
   * @generated
   */
  void setWorkspace(AnyPath value);

} // Workspace
