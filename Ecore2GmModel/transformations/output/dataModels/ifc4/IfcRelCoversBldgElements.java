/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRelCoversBldgElements of the Data Model iai.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package ifc4;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link RelatingBuildingElement}, 
{@link RelatedCoverings}, 

* It provides of then following operations (getters and setters)
{@link getRelatingBuildingElement},
{@link getRelatedCoverings},
{@link setRelatingBuildingElement},
{@link setRelatedCoverings},
 */

@Description("")

public interface IfcRelCoversBldgElements extends GenericEntity, ifc4.IfcRelConnects {

	EntityType<IfcRelCoversBldgElements> T = EntityTypes.T(IfcRelCoversBldgElements.class);

	/* Constants for each property name. */
	java.lang.String RelatingBuildingElement = "RelatingBuildingElement";
	java.lang.String RelatedCoverings = "RelatedCoverings";

	@Description("")
	@Mandatory
	ifc4.IfcElement getRelatingBuildingElement();
	void setRelatingBuildingElement(ifc4.IfcElement RelatingBuildingElement);
	@Description("")
	
	java.util.List<ifc4.IfcCovering> getRelatedCoverings();
	void setRelatedCoverings(java.util.List<ifc4.IfcCovering> RelatedCoverings);

}
