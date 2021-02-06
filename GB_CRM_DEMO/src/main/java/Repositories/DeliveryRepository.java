package Repositories;

import Entity.Address;

import java.util.ArrayList;
import java.util.List;

public class DeliveryRepository {
    List<Address> addresses = new ArrayList<>();

    public List<Address> getAvailableAddresses() {
        return addresses;
    }

    public List<String> getAvailableStreets() {
        List<String> streets = new ArrayList<>();
        for (Address address : addresses) {
            streets.add(address.getStreet());
        }
        return streets;
    }
}
