
package com.weather.model;

import com.google.gson.annotations.SerializedName;


public class Locations {

    @SerializedName("Washington,DC,USA")
    private WashingtonDCUSA washingtonDCUSA;

    public WashingtonDCUSA getWashingtonDCUSA() {
        return washingtonDCUSA;
    }

    public static class Builder {

        private WashingtonDCUSA washingtonDCUSA;

        public Builder withWashingtonDCUSA(WashingtonDCUSA washingtonDCUSA) {
            this.washingtonDCUSA = washingtonDCUSA;
            return this;
        }

        public Locations build() {
            Locations locations = new Locations();
            locations.washingtonDCUSA = washingtonDCUSA;
            return locations;
        }

    }

}
