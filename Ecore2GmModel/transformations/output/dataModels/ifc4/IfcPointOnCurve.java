/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcPointOnCurve of the Data Model iai.
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
{@link BasisCurve}, 
{@link PointParameter}, 
{@link PointParameterAsString}, 
{@link Dim}, 

* It provides of then following operations (getters and setters)
{@link getBasisCurve},
{@link getPointParameter},
{@link getPointParameterAsString},
{@link getDim},
{@link setBasisCurve},
{@link setPointParameter},
{@link setPointParameterAsString},
{@link setDim},
 */

@Description("")

public interface IfcPointOnCurve extends GenericEntity, ifc4.IfcPoint {

	EntityType<IfcPointOnCurve> T = EntityTypes.T(IfcPointOnCurve.class);

	/* Constants for each property name. */
	java.lang.String BasisCurve = "BasisCurve";
	java.lang.String PointParameter = "PointParameter";
	java.lang.String PointParameterAsString = "PointParameterAsString";
	java.lang.String Dim = "Dim";

	@Description("")
	@Mandatory
	ifc4.IfcCurve getBasisCurve();
	void setBasisCurve(ifc4.IfcCurve BasisCurve);
	@Description("")
	@Mandatory
	java.lang.Double getPointParameter();
	void setPointParameter(java.lang.Double PointParameter);
	@Description("")
	@Mandatory
	java.lang.String getPointParameterAsString();
	void setPointParameterAsString(java.lang.String PointParameterAsString);
	@Description("")
	@Mandatory
	java.lang.Long getDim();
	void setDim(java.lang.Long Dim);
}