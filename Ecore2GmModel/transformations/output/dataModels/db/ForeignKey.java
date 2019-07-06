/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type ForeignKey of the Data Model DB.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package db;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link parent}, 
{@link child}, 
{@link isMany}, 

* It provides of then following operations (getters and setters)
{@link getParent},
{@link getChild},
{@link getIsMany},
{@link setParent},
{@link setChild},
{@link setIsMany},
 */

@Description("")

public interface ForeignKey extends GenericEntity, db.DatabaseElement {

	EntityType<ForeignKey> T = EntityTypes.T(ForeignKey.class);

	/* Constants for each property name. */
	java.lang.String parent = "parent";
	java.lang.String child = "child";
	java.lang.String isMany = "isMany";

	@Description("")
	@Mandatory
	db.Column getParent();
	void setParent(db.Column parent);
	@Description("")
	@Mandatory
	db.Column getChild();
	void setChild(db.Column child);
	@Description("")
	@Mandatory
	java.lang.Boolean getIsMany();
	void setIsMany(java.lang.Boolean isMany);
}