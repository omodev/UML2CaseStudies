/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package be.ac.vub.uml2cs.instantmessenger.validation;

import be.ac.vub.uml2cs.instantmessenger.InstantMessengerConfiguration;

/**
 * A sample validator interface for {@link be.ac.vub.uml2cs.instantmessenger.Packaging}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PackagingValidator {
	boolean validate();

	boolean validateConfig(InstantMessengerConfiguration value);
}
