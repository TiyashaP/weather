
package com.weather.model;

import com.google.gson.annotations.Expose;


public class Solarradiation {

    @Expose
    private String id;
    @Expose
    private String name;
    @Expose
    private Long type;
    @Expose
    private Object unit;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getType() {
        return type;
    }

    public Object getUnit() {
        return unit;
    }

    public static class Builder {

        private String id;
        private String name;
        private Long type;
        private Object unit;

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

        public Builder withUnit(Object unit) {
            this.unit = unit;
            return this;
        }

        public Solarradiation build() {
            Solarradiation solarradiation = new Solarradiation();
            solarradiation.id = id;
            solarradiation.name = name;
            solarradiation.type = type;
            solarradiation.unit = unit;
            return solarradiation;
        }

    }

}
