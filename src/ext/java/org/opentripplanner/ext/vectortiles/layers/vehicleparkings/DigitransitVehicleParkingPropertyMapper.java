package org.opentripplanner.ext.vectortiles.layers.vehicleparkings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import org.opentripplanner.ext.vectortiles.I18NStringMapper;
import org.opentripplanner.ext.vectortiles.KeyValue;
import org.opentripplanner.ext.vectortiles.PropertyMapper;
import org.opentripplanner.routing.vehicle_parking.VehicleParking;

public class DigitransitVehicleParkingPropertyMapper extends PropertyMapper<VehicleParking> {

  private final I18NStringMapper i18NStringMapper;

  private DigitransitVehicleParkingPropertyMapper(Locale locale) {
    this.i18NStringMapper = new I18NStringMapper(locale);
  }

  protected static DigitransitVehicleParkingPropertyMapper create(Locale locale) {
    return new DigitransitVehicleParkingPropertyMapper(locale);
  }

  @Override
  protected Collection<KeyValue> map(VehicleParking vehicleParking) {
    return new ArrayList<KeyValue>(
      List.of(
        new KeyValue("id", vehicleParking.getId().toString()),
        new KeyValue("bicyclePlaces", vehicleParking.hasBicyclePlaces()),
        new KeyValue("anyCarPlaces", vehicleParking.hasAnyCarPlaces()),
        new KeyValue("carPlaces", vehicleParking.hasCarPlaces()),
        new KeyValue(
          "wheelchairAccessibleCarPlaces",
          vehicleParking.hasWheelchairAccessibleCarPlaces()
        ),
        new KeyValue("name", i18NStringMapper.mapToApi(vehicleParking.getName()))
      )
    );
  }
}
