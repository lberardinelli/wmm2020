/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPersonAndOrganization of the Data Model iai.
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
{@link ThePerson}, 
{@link TheOrganization}, 
{@link Roles}, 

* It provides of then following operations (getters and setters)
{@link getThePerson},
{@link getTheOrganization},
{@link getRoles},
{@link setThePerson},
{@link setTheOrganization},
{@link setRoles},
 */

@Description("")

public interface IfcPersonAndOrganization extends GenericEntity, ifc4.IfcActorSelect, ifc4.IfcObjectReferenceSelect, ifc4.IfcResourceObjectSelect {

	EntityType<IfcPersonAndOrganization> T = EntityTypes.T(IfcPersonAndOrganization.class);

	/* Constants for each property name. */
	java.lang.String ThePerson = "ThePerson";
	java.lang.String TheOrganization = "TheOrganization";
	java.lang.String Roles = "Roles";

	@Description("")
	@Mandatory
	ifc4.IfcPerson getThePerson();
	void setThePerson(ifc4.IfcPerson ThePerson);
	@Description("")
	@Mandatory
	ifc4.IfcOrganization getTheOrganization();
	void setTheOrganization(ifc4.IfcOrganization TheOrganization);
	@Description("")
	
	java.util.List<ifc4.IfcActorRole> getRoles();
	void setRoles(java.util.List<ifc4.IfcActorRole> Roles);

}
