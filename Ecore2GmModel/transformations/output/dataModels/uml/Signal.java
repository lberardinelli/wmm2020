/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Signal of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link ownedAttribute}, 

* It provides of then following operations (getters and setters)
{@link getOwnedAttribute},
{@link setOwnedAttribute},
 */

@Description("A Signal is a specification of a kind of communication between objects in which a reaction is asynchronously triggered in the receiver without a reply.<p>From package UML::SimpleClassifiers.</p>")

public interface Signal extends GenericEntity, uml.Classifier {

	EntityType<Signal> T = EntityTypes.T(Signal.class);

	/* Constants for each property name. */
	java.lang.String ownedAttribute = "ownedAttribute";

	@Description("The attributes owned by the Signal.<p>From package UML::SimpleClassifiers.</p>")
	
	java.util.List<uml.Property> getOwnedAttribute();
	void setOwnedAttribute(java.util.List<uml.Property> ownedAttribute);

}