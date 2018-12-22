/**
 */
package VariabilityFM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see VariabilityFM.VariabilityFMPackage#getNodeKind()
 * @model
 * @generated
 */
public enum NodeKind implements Enumerator {
	/**
	 * The '<em><b>ROOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROOT_VALUE
	 * @generated
	 * @ordered
	 */
	ROOT(0, "ROOT", "ROOT"),

	/**
	 * The '<em><b>COMPULSORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY_VALUE
	 * @generated
	 * @ordered
	 */
	COMPULSORY(1, "COMPULSORY", "COMPULSORY"),

	/**
	 * The '<em><b>EXCLUSIVE CHOICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE_CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUSIVE_CHOICE(2, "EXCLUSIVE_CHOICE", "EXCLUSIVE_CHOICE"),

	/**
	 * The '<em><b>OPTIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONAL(3, "OPTIONAL", "OPTIONAL");

	/**
	 * The '<em><b>ROOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROOT_VALUE = 0;

	/**
	 * The '<em><b>COMPULSORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPULSORY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPULSORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPULSORY_VALUE = 1;

	/**
	 * The '<em><b>EXCLUSIVE CHOICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCLUSIVE CHOICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUSIVE_CHOICE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUSIVE_CHOICE_VALUE = 2;

	/**
	 * The '<em><b>OPTIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPTIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONAL_VALUE = 3;

	/**
	 * An array of all the '<em><b>Node Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NodeKind[] VALUES_ARRAY =
		new NodeKind[] {
			ROOT,
			COMPULSORY,
			EXCLUSIVE_CHOICE,
			OPTIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Node Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NodeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Node Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NodeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Node Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NodeKind get(int value) {
		switch (value) {
			case ROOT_VALUE: return ROOT;
			case COMPULSORY_VALUE: return COMPULSORY;
			case EXCLUSIVE_CHOICE_VALUE: return EXCLUSIVE_CHOICE;
			case OPTIONAL_VALUE: return OPTIONAL;
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
	private NodeKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NodeKind
