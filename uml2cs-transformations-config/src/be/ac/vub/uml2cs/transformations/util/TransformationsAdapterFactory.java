/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.transformations.util;

import be.ac.vub.uml2cs.transformations.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.ac.vub.uml2cs.transformations.TransformationsPackage
 * @generated
 */
public class TransformationsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "(C) 2007, Dennis Wagelaar, Vrije Universiteit Brussel";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TransformationsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TransformationsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationsSwitch modelSwitch =
		new TransformationsSwitch() {
			public Object caseTransformationConfig(TransformationConfig object) {
				return createTransformationConfigAdapter();
			}
			public Object caseMapping(Mapping object) {
				return createMappingAdapter();
			}
			public Object caseJavaMapping(JavaMapping object) {
				return createJavaMappingAdapter();
			}
			public Object caseJavaDataTypes(JavaDataTypes object) {
				return createJavaDataTypesAdapter();
			}
			public Object caseJava1DataTypes(Java1DataTypes object) {
				return createJava1DataTypesAdapter();
			}
			public Object caseJava2DataTypes(Java2DataTypes object) {
				return createJava2DataTypesAdapter();
			}
			public Object caseUML2Observer(UML2Observer object) {
				return createUML2ObserverAdapter();
			}
			public Object caseUML2JavaObserver(UML2JavaObserver object) {
				return createUML2JavaObserverAdapter();
			}
			public Object caseUML2Applet(UML2Applet object) {
				return createUML2AppletAdapter();
			}
			public Object caseUML2MIDlet(UML2MIDlet object) {
				return createUML2MIDletAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.TransformationConfig <em>Transformation Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.TransformationConfig
	 * @generated
	 */
	public Adapter createTransformationConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.Mapping
	 * @generated
	 */
	public Adapter createMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.JavaMapping <em>Java Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.JavaMapping
	 * @generated
	 */
	public Adapter createJavaMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.JavaDataTypes <em>Java Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.JavaDataTypes
	 * @generated
	 */
	public Adapter createJavaDataTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.Java1DataTypes <em>Java1 Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.Java1DataTypes
	 * @generated
	 */
	public Adapter createJava1DataTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.Java2DataTypes <em>Java2 Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.Java2DataTypes
	 * @generated
	 */
	public Adapter createJava2DataTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.UML2Observer <em>UML2 Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.UML2Observer
	 * @generated
	 */
	public Adapter createUML2ObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.UML2JavaObserver <em>UML2 Java Observer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.UML2JavaObserver
	 * @generated
	 */
	public Adapter createUML2JavaObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.UML2Applet <em>UML2 Applet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.UML2Applet
	 * @generated
	 */
	public Adapter createUML2AppletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link be.ac.vub.uml2cs.transformations.UML2MIDlet <em>UML2MI Dlet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see be.ac.vub.uml2cs.transformations.UML2MIDlet
	 * @generated
	 */
	public Adapter createUML2MIDletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TransformationsAdapterFactory
