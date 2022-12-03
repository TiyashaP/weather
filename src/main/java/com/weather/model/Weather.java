
package com.weather.model;

import com.google.gson.annotations.Expose;


public class Weather {

    @Expose
    private Columns columns;
    @Expose
    private Locations locations;
    @Expose
    private Object messages;
    @Expose
    private Long queryCost;
    @Expose
    private Long remainingCost;

    public Columns getColumns() {
        return columns;
    }

    public Locations getLocations() {
        return locations;
    }

    public Object getMessages() {
        return messages;
    }

    public Long getQueryCost() {
        return queryCost;
    }

    public Long getRemainingCost() {
        return remainingCost;
    }

    public static class Builder {

        private Columns columns;
        private Locations locations;
        private Object messages;
        private Long queryCost;
        private Long remainingCost;

        public Builder withColumns(Columns columns) {
            this.columns = columns;
            return this;
        }

        public Builder withLocations(Locations locations) {
            this.locations = locations;
            return this;
        }

        public Builder withMessages(Object messages) {
            this.messages = messages;
            return this;
        }

        public Builder withQueryCost(Long queryCost) {
            this.queryCost = queryCost;
            return this;
        }

        public Builder withRemainingCost(Long remainingCost) {
            this.remainingCost = remainingCost;
            return this;
        }

        public Weather build() {
            Weather weather = new Weather();
            weather.columns = columns;
            weather.locations = locations;
            weather.messages = messages;
            weather.queryCost = queryCost;
            weather.remainingCost = remainingCost;
            return weather;
        }

    }

}
