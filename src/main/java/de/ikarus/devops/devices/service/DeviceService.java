package de.ikarus.devops.devices.service;

import de.ikarus.devops.devices.model.Device;
import java.util.List;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
public interface DeviceService {
  List<Device> findAll();

  String greet(String name);
}
