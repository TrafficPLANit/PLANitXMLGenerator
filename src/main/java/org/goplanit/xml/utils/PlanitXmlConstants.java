package org.goplanit.xml.utils;

/**
 * Shared XML constants for PLANit XML utilities.
 */
public class PlanitXmlConstants {

  /** PLANit namespace for v2 XML */
  public static final String XML_NAMESPACE_V2 = PlanitNamespacePrefixMapper.NAMESPACE_V2_URI;

  /** PLANit macroscopic network XML root element */
  public static final String XML_ROOT_MACROSCOPIC_NETWORK = "macroscopicnetwork";

  /** PLANit macroscopic zoning XML root element */
  public static final String XML_ROOT_MACROSCOPIC_ZONING = "macroscopiczoning";

  /** PLANit infrastructure layers XML element */
  public static final String XML_ELEMENT_INFRASTRUCTURE_LAYERS = "infrastructurelayers";

  /** PLANit CRS XML attribute */
  public static final String XML_ATTRIBUTE_SRS_NAME = "srsname";

  /**
   * Utility class.
   */
  private PlanitXmlConstants() {
  }
}
