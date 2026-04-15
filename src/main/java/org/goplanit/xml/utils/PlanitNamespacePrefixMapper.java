package org.goplanit.xml.utils;

import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

public class PlanitNamespacePrefixMapper extends NamespacePrefixMapper {

  public static final String NAMESPACE_V1_URI = "http://www.goplanit.org/v1";
  public static final String NAMESPACE_V2_URI = "http://www.goplanit.org/v2";

  public static final String NAMESPACE_OPENGIS_URI = "http://www.opengis.net/gml";
  public static final String NAMESPACE_OPENGIS_PREFIX = "gml";

  /**
   * Map GML correctly
   * @param namespaceUri
   *      The namespace URI for which the prefix needs to be found.
   *      Never be null. "" is used to denote the default namespace.
   * @param suggestion
   *      When the content tree has a suggestion for the prefix
   *      to the given namespaceUri, that suggestion is passed as a
   *      parameter. Typicall this value comes from the QName.getPrefix
   *      to show the preference of the content tree. This parameter
   *      may be null, and this parameter may represent an already
   *      occupied prefix.
   * @param requirePrefix
   *      If this method is expected to return non-empty prefix.
   *      When this flag is true, it means that the given namespace URI
   *      cannot be set as the default namespace.
   *
   * @return string prefix if a match
   */
  @Override
  public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {

    // If we are writing V2, we want V2 to be the default namespace (no prefix)
    if (NAMESPACE_V2_URI.equals(namespaceUri)) {
      return "";
    }

    // If for some reason V1 is being marshalled, make it default too
    if (NAMESPACE_V1_URI.equals(namespaceUri)) {
      return "";
    }

    if (NAMESPACE_OPENGIS_URI.equals(namespaceUri)) {
      return NAMESPACE_OPENGIS_PREFIX;
    }
    return suggestion;
  }

}