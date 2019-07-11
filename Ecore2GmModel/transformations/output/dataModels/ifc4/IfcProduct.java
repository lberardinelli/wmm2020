/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcProduct of the Data Model iai.
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
{@link ObjectPlacement}, 
{@link Representation}, 
{@link ReferencedBy}, 

* It provides of then following operations (getters and setters)
{@link getObjectPlacement},
{@link getRepresentation},
{@link getReferencedBy},
{@link setObjectPlacement},
{@link setRepresentation},
{@link setReferencedBy},
 */

@Description("")

public interface IfcProduct extends GenericEntity, ifc4.IfcObject, ifc4.IfcProductSelect {

	EntityType<IfcProduct> T = EntityTypes.T(IfcProduct.class);

	/* Constants for each property name. */
	java.lang.String ObjectPlacement = "ObjectPlacement";
	java.lang.String Representation = "Representation";
	java.lang.String ReferencedBy = "ReferencedBy";

	@Description("")
	@Mandatory
	ifc4.IfcObjectPlacement getObjectPlacement();
	void setObjectPlacement(ifc4.IfcObjectPlacement ObjectPlacement);
	@Description("")
	@Mandatory
	ifc4.IfcProductRepresentation getRepresentation();
	void setRepresentation(ifc4.IfcProductRepresentation Representation);
	@Description("")
	
	java.util.List<ifc4.IfcRelAssignsToProduct> getReferencedBy();
	void setReferencedBy(java.util.List<ifc4.IfcRelAssignsToProduct> ReferencedBy);

}