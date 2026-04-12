package org.goplanit.xml.utils;

import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

public class PlanitNamespacePrefixMapper extends NamespacePrefixMapper {

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
    if (NAMESPACE_OPENGIS_URI.equals(namespaceUri)) {
      return NAMESPACE_OPENGIS_PREFIX;
    }
    return suggestion;
  }
}