# Release Log

PLANitXMLGenerator release log.

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
