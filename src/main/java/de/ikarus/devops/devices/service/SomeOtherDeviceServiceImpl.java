package de.ikarus.devops.devices.service;

import de.ikarus.devops.devices.model.Device;
import de.ikarus.devops.devices.repository.DeviceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
@Service("custom")
public class SomeOtherDeviceServiceImpl implements DeviceService {
  @Autowired
  private DeviceRepository repository;

  @Override
  public List<Device> findAll() {

    System.out.println("I am a custom Device Service Impl");

    List<Device> cities = (List<Device>) repository.findAll();

    return cities;
  }

  @Override
  public String greet(String name) {
    System.out.println("I am the default Device Service Impl");
    return String.format("Hello %s from a custom Device Service Impl", name);
  }
}
