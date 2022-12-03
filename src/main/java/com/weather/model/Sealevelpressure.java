
package com.weather.model;

import com.google.gson.annotations.Expose;


public class Sealevelpressure {

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private Long type;
    @Expose
    private String unit;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getType() {
        return type;
    }

    public String getUnit() {
        return unit;
    }

    public static class Builder {

        private String id;
        private String name;
        private Long type;
        private String unit;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withType(Long type) {
            this.type = type;
            return this;
        }

        public Builder withUnit(String unit) {
            this.unit = unit;
            return this;
        }

        public Sealevelpressure build() {
            Sealevelpressure sealevelpressure = new Sealevelpressure();
            sealevelpressure.id = id;
            sealevelpressure.name = name;
            sealevelpressure.type = type;
            sealevelpressure.unit = unit;
            return sealevelpressure;
        }

    }

}
