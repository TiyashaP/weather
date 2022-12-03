
package com.weather.model;

import com.google.gson.annotations.Expose;

import java.util.List;


public class WashingtonDCUSA {

    @Expose
    private String address;
    @Expose
    private Object alerts;
    @Expose
    private CurrentConditions currentConditions;
    @Expose
    private Long distance;
    @Expose
    private String id;
    @Expose
    private Long index;
    @Expose
    private Double latitude;
    @Expose
    private Double longitude;
    @Expose
    private String name;
    @Expose
    private Object stationContributions;
    @Expose
    private Long time;
    @Expose
    private String tz;
    @Expose
    private List<Value> values;

    public String getAddress() {
        return address;
    }

    public Object getAlerts() {
        return alerts;
    }

    public CurrentConditions getCurrentConditions() {
        return currentConditions;
    }

    public Long getDistance() {
        return distance;
    }

    public String getId() {
        return id;
    }

    public Long getIndex() {
        return index;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    public Object getStationContributions() {
        return stationContributions;
    }

    public Long getTime() {
        return time;
    }

    public String getTz() {
        return tz;
    }

    public List<Value> getValues() {
        return values;
    }

    public static class Builder {

        private String address;
        private Object alerts;
        private CurrentConditions currentConditions;
        private Long distance;
        private String id;
        private Long index;
        private Double latitude;
        private Double longitude;
        private String name;
        private Object stationContributions;
        private Long time;
        private String tz;
        private List<Value> values;

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withAlerts(Object alerts) {
            this.alerts = alerts;
            return this;
        }

        public Builder withCurrentConditions(CurrentConditions currentConditions) {
            this.currentConditions = currentConditions;
            return this;
        }

        public Builder withDistance(Long distance) {
            this.distance = distance;
            return this;
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withIndex(Long index) {
            this.index = index;
            return this;
        }

        public Builder withLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder withLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withStationContributions(Object stationContributions) {
            this.stationContributions = stationContributions;
            return this;
        }

        public Builder withTime(Long time) {
            this.time = time;
            return this;
        }

        public Builder withTz(String tz) {
            this.tz = tz;
            return this;
        }

        public Builder withValues(List<Value> values) {
            this.values = values;
            return this;
        }

        public WashingtonDCUSA build() {
            WashingtonDCUSA washingtonDCUSA = new WashingtonDCUSA();
            washingtonDCUSA.address = address;
            washingtonDCUSA.alerts = alerts;
            washingtonDCUSA.currentConditions = currentConditions;
            washingtonDCUSA.distance = distance;
            washingtonDCUSA.id = id;
            washingtonDCUSA.index = index;
            washingtonDCUSA.latitude = latitude;
            washingtonDCUSA.longitude = longitude;
            washingtonDCUSA.name = name;
            washingtonDCUSA.stationContributions = stationContributions;
            washingtonDCUSA.time = time;
            washingtonDCUSA.tz = tz;
            washingtonDCUSA.values = values;
            return washingtonDCUSA;
        }

    }

}
