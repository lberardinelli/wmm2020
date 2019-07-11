/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcCovering of the Data Model iai.
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
{@link PredefinedType}, 
{@link CoversSpaces}, 
{@link CoversElements}, 

* It provides of then following operations (getters and setters)
{@link getPredefinedType},
{@link getCoversSpaces},
{@link getCoversElements},
{@link setPredefinedType},
{@link setCoversSpaces},
{@link setCoversElements},
 */

@Description("")

public interface IfcCovering extends GenericEntity, ifc4.IfcBuildingElement {

	EntityType<IfcCovering> T = EntityTypes.T(IfcCovering.class);

	/* Constants for each property name. */
	java.lang.String PredefinedType = "PredefinedType";
	java.lang.String CoversSpaces = "CoversSpaces";
	java.lang.String CoversElements = "CoversElements";

	@Description("")
	@Mandatory
	ifc4.IfcCoveringTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcCoveringTypeEnum PredefinedType);
	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelCoversSpaces> getCoversSpaces();
	void setCoversSpaces(java.util.List<ifc4.IfcRelCoversSpaces> CoversSpaces);

	@Description("")
	@Mandatory
	java.util.List<ifc4.IfcRelCoversBldgElements> getCoversElements();
	void setCoversElements(java.util.List<ifc4.IfcRelCoversBldgElements> CoversElements);

}
