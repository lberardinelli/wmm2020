/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type EffectEvidenceSynthesisResultsByExposure of the Data Model fhir.
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
{@link variantState}, 
{@link riskEvidenceSynthesis}, 

* It provides of then following operations (getters and setters)
{@link getVariantState},
{@link getRiskEvidenceSynthesis},
{@link setVariantState},
{@link setRiskEvidenceSynthesis},
 */

@Description("The EffectEvidenceSynthesis resource describes the difference in an outcome between exposures states in a population where the effect estimate is derived from a combination of research studies.")

public interface EffectEvidenceSynthesisResultsByExposure extends GenericEntity, fhir.BackboneElement {

	EntityType<EffectEvidenceSynthesisResultsByExposure> T = EntityTypes.T(EffectEvidenceSynthesisResultsByExposure.class);

	/* Constants for each property name. */
	java.lang.String variantState = "variantState";
	java.lang.String riskEvidenceSynthesis = "riskEvidenceSynthesis";

	@Description("Used to define variant exposure states such as low-risk state.")
	@Mandatory
	fhir.CodeableConcept getVariantState();
	void setVariantState(fhir.CodeableConcept variantState);
	@Description("Reference to a RiskEvidenceSynthesis resource.")
	@Mandatory
	com.braintribe.model.generic.GenericEntity getRiskEvidenceSynthesis();
	void setRiskEvidenceSynthesis(com.braintribe.model.generic.GenericEntity riskEvidenceSynthesis);
}