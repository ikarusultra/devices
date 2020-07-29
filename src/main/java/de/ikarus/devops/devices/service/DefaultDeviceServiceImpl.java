package de.ikarus.devops.devices.service;

import de.ikarus.devops.devices.model.Device;
import de.ikarus.devops.devices.repository.DeviceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
@Service
public class DefaultDeviceServiceImpl implements DeviceService {
  @Autowired
  private DeviceRepository repository;

  @Override
  public List<Device> findAll() {

    List<Device> cities = (List<Device>) repository.findAll();

    return cities;
  }
}
