/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcMechanicalFastener of the Data Model iai.
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
{@link NominalDiameter}, 
{@link NominalDiameterAsString}, 
{@link NominalLength}, 
{@link NominalLengthAsString}, 
{@link PredefinedType}, 

* It provides of then following operations (getters and setters)
{@link getNominalDiameter},
{@link getNominalDiameterAsString},
{@link getNominalLength},
{@link getNominalLengthAsString},
{@link getPredefinedType},
{@link setNominalDiameter},
{@link setNominalDiameterAsString},
{@link setNominalLength},
{@link setNominalLengthAsString},
{@link setPredefinedType},
 */

@Description("")

public interface IfcMechanicalFastener extends GenericEntity, ifc4.IfcElementComponent {

	EntityType<IfcMechanicalFastener> T = EntityTypes.T(IfcMechanicalFastener.class);

	/* Constants for each property name. */
	java.lang.String NominalDiameter = "NominalDiameter";
	java.lang.String NominalDiameterAsString = "NominalDiameterAsString";
	java.lang.String NominalLength = "NominalLength";
	java.lang.String NominalLengthAsString = "NominalLengthAsString";
	java.lang.String PredefinedType = "PredefinedType";

	@Description("")
	@Mandatory
	java.lang.Double getNominalDiameter();
	void setNominalDiameter(java.lang.Double NominalDiameter);
	@Description("")
	@Mandatory
	java.lang.String getNominalDiameterAsString();
	void setNominalDiameterAsString(java.lang.String NominalDiameterAsString);
	@Description("")
	@Mandatory
	java.lang.Double getNominalLength();
	void setNominalLength(java.lang.Double NominalLength);
	@Description("")
	@Mandatory
	java.lang.String getNominalLengthAsString();
	void setNominalLengthAsString(java.lang.String NominalLengthAsString);
	@Description("")
	@Mandatory
	ifc4.IfcMechanicalFastenerTypeEnum getPredefinedType();
	void setPredefinedType(ifc4.IfcMechanicalFastenerTypeEnum PredefinedType);
}
