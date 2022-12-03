
package com.weather.model;

import com.google.gson.annotations.Expose;

public class Visibility {

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

        public Visibility build() {
            Visibility visibility = new Visibility();
            visibility.id = id;
            visibility.name = name;
            visibility.type = type;
            visibility.unit = unit;
            return visibility;
        }

    }

}
