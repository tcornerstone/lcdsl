/**
 * generated by Xtext 2.28.0
 */
package com.wamas.ide.launching.lcDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Output Stream</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.wamas.ide.launching.lcDsl.LcDslPackage#getOutputStream()
 * @model
 * @generated
 */
public enum OutputStream implements Enumerator
{
  /**
   * The '<em><b>STDOUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STDOUT_VALUE
   * @generated
   * @ordered
   */
  STDOUT(0, "STDOUT", "stdout"),

  /**
   * The '<em><b>STDERR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STDERR_VALUE
   * @generated
   * @ordered
   */
  STDERR(1, "STDERR", "stderr"),

  /**
   * The '<em><b>BOTH</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOTH_VALUE
   * @generated
   * @ordered
   */
  BOTH(2, "BOTH", "both-out");

  /**
   * The '<em><b>STDOUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STDOUT
   * @model literal="stdout"
   * @generated
   * @ordered
   */
  public static final int STDOUT_VALUE = 0;

  /**
   * The '<em><b>STDERR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STDERR
   * @model literal="stderr"
   * @generated
   * @ordered
   */
  public static final int STDERR_VALUE = 1;

  /**
   * The '<em><b>BOTH</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOTH
   * @model literal="both-out"
   * @generated
   * @ordered
   */
  public static final int BOTH_VALUE = 2;

  /**
   * An array of all the '<em><b>Output Stream</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OutputStream[] VALUES_ARRAY =
    new OutputStream[]
    {
      STDOUT,
      STDERR,
      BOTH,
    };

  /**
   * A public read-only list of all the '<em><b>Output Stream</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OutputStream> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Output Stream</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutputStream get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutputStream result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Output Stream</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutputStream getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutputStream result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Output Stream</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static OutputStream get(int value)
  {
    switch (value)
    {
      case STDOUT_VALUE: return STDOUT;
      case STDERR_VALUE: return STDERR;
      case BOTH_VALUE: return BOTH;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OutputStream(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OutputStream
