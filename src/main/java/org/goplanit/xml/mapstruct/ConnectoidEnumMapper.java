package org.goplanit.xml.mapstruct;

public class ConnectoidEnumMapper {
  public static org.goplanit.xml.generated.v2.Connectoidtypetype map(org.goplanit.xml.generated.v1.Connectoidtypetype source) {
    if (source == null) return null;
    if ("traveller_access".equals(source.value())) {
      return org.goplanit.xml.generated.v2.Connectoidtypetype.ACCESS_EGRESS;
    }
    return org.goplanit.xml.generated.v2.Connectoidtypetype.fromValue(source.value());
  }
}
