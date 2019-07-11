/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type IfcRegularTimeSeries of the Data Model iai.
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
{@link TimeStep}, 
{@link TimeStepAsString}, 
{@link Values}, 

* It provides of then following operations (getters and setters)
{@link getTimeStep},
{@link getTimeStepAsString},
{@link getValues},
{@link setTimeStep},
{@link setTimeStepAsString},
{@link setValues},
 */

@Description("")

public interface IfcRegularTimeSeries extends GenericEntity, ifc4.IfcTimeSeries {

	EntityType<IfcRegularTimeSeries> T = EntityTypes.T(IfcRegularTimeSeries.class);

	/* Constants for each property name. */
	java.lang.String TimeStep = "TimeStep";
	java.lang.String TimeStepAsString = "TimeStepAsString";
	java.lang.String Values = "Values";

	@Description("")
	@Mandatory
	java.lang.Double getTimeStep();
	void setTimeStep(java.lang.Double TimeStep);
	@Description("")
	@Mandatory
	java.lang.String getTimeStepAsString();
	void setTimeStepAsString(java.lang.String TimeStepAsString);
	@Description("")
	
	java.util.List<ifc4.IfcTimeSeriesValue> getValues();
	void setValues(java.util.List<ifc4.IfcTimeSeriesValue> Values);

}
