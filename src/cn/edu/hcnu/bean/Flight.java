package cn.edu.hcnu.bean;

import cn.edu.hcnu.bean.Customer;

import java.util.Set;

public class Flight {

    private String id;
    private String FlightId;
    private String planeType;//飞机型号
    private int currentSeatsNum; //当前座位数
    private String departureAirPort;//出发机场
    private String destinationAirPort;//到达机场
    private String departureDate;//出发日期

    @Override
    public String toString() {
        return "Flight{" +
                " 航班Id='" + FlightId + '\'' +
                ", 飞机机型='" + planeType + '\'' +
                ", 当前座位数='" + currentSeatsNum + '\'' +
                ", 出发机场='" + departureAirPort + '\'' +
                ", 到达机场='" + destinationAirPort + '\'' +
                ", 出发时间='" + departureDate + '\'' +
                '}';
    }

    public Flight(String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureDate) {
        FlightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureDate = departureDate;
    }

    public Flight(String id, String flightId, String planeType, int currentSeatsNum, String departureAirPort, String destinationAirPort, String departureDate) {
        this.id=id;
        this.FlightId = flightId;
        this.planeType = planeType;
        this.currentSeatsNum = currentSeatsNum;
        this.departureAirPort = departureAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureDate = departureDate;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirPort() {
        return departureAirPort;
    }

    public void setDepartureAirPort(String departureAirPort) {
        this.departureAirPort = departureAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureData) {
        this.departureDate = departureData;
    }

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String flightId) {
        FlightId = flightId;
    }

}
