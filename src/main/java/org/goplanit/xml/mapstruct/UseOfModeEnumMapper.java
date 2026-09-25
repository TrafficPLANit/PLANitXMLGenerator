package org.goplanit.xml.mapstruct;

public class UseOfModeEnumMapper {

  public static org.goplanit.xml.generated.v2.UsedToType map(org.goplanit.xml.generated.v1.UsedToType source) {
    if (source == null) return null;

    // Handle the deprecated v1 HIGH_OCCUPANCY enum value
    if ("HIGH_OCCUPANCY".equals(source.value())) {
      // Default to PRIVATE as it represents standard passenger carpools in legacy networks
      return org.goplanit.xml.generated.v2.UsedToType.PRIVATE;
    }

    // Direct mapping for matching enum values (PRIVATE, GOODS, PUBLIC, RIDE_SHARE)
    return org.goplanit.xml.generated.v2.UsedToType.fromValue(source.value());
  }
}
