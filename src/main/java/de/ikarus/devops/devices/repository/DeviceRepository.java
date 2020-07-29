package de.ikarus.devops.devices.repository;

import de.ikarus.devops.devices.model.Device;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */
@Repository
public interface DeviceRepository extends CrudRepository<Device, Long> {

}
