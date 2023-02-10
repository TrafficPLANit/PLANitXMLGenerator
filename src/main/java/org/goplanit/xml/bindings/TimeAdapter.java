package org.goplanit.xml.bindings;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Objects;

/**
 * Replace default way xs:time is dealt with via XMLGregorianCalendar to this adapter (see global.xjb), so we replace it with
 * the mroe useful LocalTime of Java 8+, {@see https://gist.github.com/ylupol/1cf059b5fea59df7d8625f687001b756}
 *
 * @author markr
 */
public class TimeAdapter extends XmlAdapter<String, LocalTime> {

  @Override
  public LocalTime unmarshal(String v) {
    if (Objects.nonNull(v)) {
      try {
        return LocalTime.parse(v);
      } catch (DateTimeParseException e) {
        throw new RuntimeException("Failed to parse time: " + v, e);
      }
    }
    return null;
  }

  @Override
  public String marshal(LocalTime v) {
    if (Objects.nonNull(v)) {
      return v.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }
    return null;
  }
}
