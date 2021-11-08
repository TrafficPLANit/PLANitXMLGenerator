# Release Log

PLANitXMLGenerator release log.

## 0.3.0

* length of connectoids is now a double instead of a float #9
* crs of zoning is now placed on root element, not on zones element, since we now have intermodal element as well #10
* unknown and none added to options for transferzonetype, with default none if not provided #11
* update default mode to car by updating xsd so this can be persisted as well (planitio/#8)
* add support for transferzonegroups (planitio/#16)
* add support for intermodal component of zoning (planitio/#15)
* document transfer zone groups in expanded examples + documentation + xsd on website based on newly added functionality that is now active (planitio/#17)
* allow transferzones to have not only polygon geometries but also linestring alternatively #8
* added id attributes to main components (zoning, network, demands etc.) #17
* added support for service networks built on top of a physical network #18
* linkSegmentTypes should not define speed limits per mode within the access element but via an accessgroup. This has been changed #20
* added support for inflow/outflow properties alongside the already existing flow property #66
* update packages to conform to new domain org.goplanit.* #21
* added support for routed services that route on the service network #19

## 0.2.0

** enhancements**
* add LICENSE.TXT to each repository so it is clearly licensed (planit/#33)
* move geometry from link segment to link (planitxmlgenerator/#1)
* Add support for predefined modes and physical and usability features to be persisted in the xml/xsd/xjb (planitxmlgenerator #2)
* update default mode to car + update xsd so this can be persisted as well (planitxmlgenerator/#8)
* add externalid element of type string as optional to all elements with an id (planitxxmlgenerator/#4)
* make all xsd schemas to be publiclly available (planitxmlgenerator/#1)
* id element must be string rather than number so that in the memory model we can add xmlId (planitxmlgenerator/#6)
* centroid element must become optional, since it is not strictly needed (planitio/#2)
* Document the currently implemented intermodal extension to the Zoning XML/XSD (planitxmlgenerator/#7)    

** bugs**
* change all link segment properties to double as memory model only utilises doubles (planitxmlgenerator/#3)  
 

## 0.1.0

* Created repository by splitting it off from PLANitIO (www.github.com/trafficplanit/PLANitXMLGenerator)
