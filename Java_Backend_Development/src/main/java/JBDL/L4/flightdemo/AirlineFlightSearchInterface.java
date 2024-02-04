package JBDL.L4.flightdemo;

import java.util.List;

public interface AirlineFlightSearchInterface {
    List<FlightData> getFlightBySrcDes(String src, String des);
}
