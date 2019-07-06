/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type PlanDefinitionParticipant of the Data Model fhir.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package fhir;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link role}, 

* It provides of then following operations (getters and setters)
{@link getRole},
{@link setRole},
 */

@Description("This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols.")

public interface PlanDefinitionParticipant extends GenericEntity, fhir.BackboneElement {

	EntityType<PlanDefinitionParticipant> T = EntityTypes.T(PlanDefinitionParticipant.class);

	/* Constants for each property name. */
	java.lang.String role = "role";

	@Description("The role the participant should play in performing the described action.")
	@Mandatory
	fhir.CodeableConcept getRole();
	void setRole(fhir.CodeableConcept role);
}