# PLANitXMLGenerator

Tool to generate Java classes from PLANit XML schemas to facilitate PLANitIO to parse PLANit input files. This repository uses JAXB to generate the Java classes that are populated based on the provided XML.

For more information on PLANit such as the user the manual, licensing, installation, getting started, reference documentation, and more, please visit [https://trafficplanit.github.io/PLANitManual/](https://trafficplanit.github.io/PLANitManual/)

## XSD and XJB Files

XJB files are used by JAXB to configure how JAXB creates Java files and to resolve naming clashes.

The src/main/resources directory contains the following files which are used by JAXB.  XSD files are in subdirectory "xsd" and XJB files are in subdirectory "xjb":

|File|Purpose|
|---| ---|
|planitlibrary.xsd|Common XML definitions used by the other XSD files|
|macroscopicinput.xsd|XSD schema defining the top-level <PLANit> element which contains the <macroscopicnetwork>, <macroscopicdemand> and <macroscopiczoning> elements
|macroscopicdemandinput.xsd|XSD schema for demand input XML, defines the <macroscopicdemand> element|
|macroscopiczoninginput.xsd|XSD schema for zoning input XML, defines the <macroscopiczoning> element|
|macroscopicintermodalinput.xsd|XSD schema for the intermodal aspect of zoning input XML, defines the <intermodal> element and is imported in `macroscopiczoninginput.xsd`|
|macroscopicnetworkinput.xsd|XSD schema for network input XML, defines the <macroscopicnetwork> element|
|metadata.xsd|XSD schema used for XML output|
|configuration.xjb|XJB file to define the package name for the generated Java classes which correspond to the definitions in the project's own XSD files|
|macroscopicdemandinput.xjb|XJB file to define the names of the generated Java classes related to demand input|
|macroscopiczoninginput.xjb|XJB file to define the names of the generated Java classes related to zoning input|
|macroscopicintermodalinput.xjb|XJB file to define the names of the generated Java classes related to intermodal (zoning) input|
|macroscopicnetworkinput.xjb|XJB file to define the names of the generated Java classes related to network input|
|linkmetadata.xjb|XJB file to define the names of the generated Java classes related to output|    
|gml-v_3_1_1.xjb|XJB file to resolve name clashes which appear when XJC is run on GML files|
|xlink-v_1_0.xjb|XJB file to resolve name clashes which appear when XJC is run on GML files|                

The last two files are taken from the OCG Schemas project (https://github.com/highsource/ogc-schemas).  This project was created to address known problems which arise when running the XJC 
compiler on schemas defined by the Open Geospatial Consortium (OGC).  PLANit uses GML, which is one of the OGC schemas.  If these XJB files were not present, the Maven-JAXB2-Plugin would 
not generate Java classes.

The XJB files had the following additions for this project:

gml-v_3_1_1.xjb:

```xml
		<jaxb:bindings node="xs:element[@name='Arc']">
			<jaxb:factoryMethod name="GmlArc"/>
		</jaxb:bindings>
		
		<jaxb:bindings node="xs:element[@name='animate']">
			<jaxb:factoryMethod name="SmilAnimate"/>
		</jaxb:bindings>
		<jaxb:bindings node="xs:element[@name='animateMotion']">
			<jaxb:factoryMethod name="SmilAnimateMotion"/>
		</jaxb:bindings>
		<jaxb:bindings node="xs:element[@name='animateColor']">
			<jaxb:factoryMethod name="SmilAnimateColor"/>
		</jaxb:bindings>
		<jaxb:bindings node="xs:element[@name='set']">
			<jaxb:factoryMethod name="SmilSet"/>
		</jaxb:bindings>
```

## Generated Java classes

The Maven build uses JAXB to generate Java classes from the XSD schema files described in the previous section.  These classes generated  are placed in package named `org.planit.xml.generated`.  The Java classes are all given names which begin with "XMLElement".  These names are set in the XJB files.

The build also creates several enumerations for input values, and a class `ObjectFactory` which JAXB uses internally.

Due to the OCG Schemas project mentioned above, JAXB also creates several "extra" packages which you do not need, namely:

* net.opengis.gml;
* org.w3._1999.xlink;
* org.w3._2001.smil20;
* org.w3._2001.smil20.language.

You can ignore the contents of all these packages, but do not delete them.  You will get compilation error if you delete any of their contents.

## Maven parent

Projects need to be built from Maven before they can be run. The common maven configuration can be found in the PLANitParentPom project which acts as the parent for this project's pom.xml.

> Make sure you install the PLANitParentPom pom.xml before conducting a maven build (in Eclipse) on this project, otherwise it cannot find the references dependencies, plugins, and other resources.

## Maven JAXB2 Plugin

This project uses JAXB to generate Java classes from XSD files.  JAXB is run using the Maven JAXB2 Plugin (https://github.com/highsource/maven-jaxb2-plugin).

The Maven JAXB2 Plugin is run by running Maven with goals "clean install" on the code.

## Git Branching model

We adopt GitFlow as per https://nvie.com/posts/a-successful-git-branching-model/
