package cn.edu.hcnu.bill.mpl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;
import cn.edu.hcnu.dao.impl.FlightDaoIml;

import java.sql.SQLException;
import java.util.Set;

public class FlightServicempl implements IFlightService{
    IFlightDao iFlightDao;
    public FlightServicempl(){
        iFlightDao=new FlightDaoIml();
    }
    @Override
    public void insertFlight(Flight flight) throws SQLException {
    iFlightDao.insertFlight(flight);
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
        return  iFlightDao.getAllFlights();
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Flight getFlightByDepartureAirPort(String departureAirPort) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
