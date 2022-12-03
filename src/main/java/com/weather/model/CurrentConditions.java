
package com.weather.model;

import com.google.gson.annotations.Expose;


public class CurrentConditions {

    @Expose
    private Double cloudcover;
    @Expose
    private String datetime;
    @Expose
    private Double dew;
    @Expose
    private Heatindex heatindex;
    @Expose
    private Double humidity;
    @Expose
    private String icon;
    @Expose
    private Double moonphase;
    @Expose
    private Long precip;
    @Expose
    private Double sealevelpressure;
    @Expose
    private Snowdepth snowdepth;
    @Expose
    private String stations;
    @Expose
    private String sunrise;
    @Expose
    private String sunset;
    @Expose
    private Double temp;
    @Expose
    private Double visibility;
    @Expose
    private Long wdir;
    @Expose
    private Wgust wgust;
    @Expose
    private Windchill windchill;
    @Expose
    private Double wspd;

    public Double getCloudcover() {
        return cloudcover;
    }

    public String getDatetime() {
        return datetime;
    }

    public Double getDew() {
        return dew;
    }

    public Heatindex getHeatindex() {
        return heatindex;
    }

    public Double getHumidity() {
        return humidity;
    }

    public String getIcon() {
        return icon;
    }

    public Double getMoonphase() {
        return moonphase;
    }

    public Long getPrecip() {
        return precip;
    }

    public Double getSealevelpressure() {
        return sealevelpressure;
    }

    public Snowdepth getSnowdepth() {
        return snowdepth;
    }

    public String getStations() {
        return stations;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getVisibility() {
        return visibility;
    }

    public Long getWdir() {
        return wdir;
    }

    public Wgust getWgust() {
        return wgust;
    }

    public Windchill getWindchill() {
        return windchill;
    }

    public Double getWspd() {
        return wspd;
    }

    public static class Builder {

        private Double cloudcover;
        private String datetime;
        private Double dew;
        private Heatindex heatindex;
        private Double humidity;
        private String icon;
        private Double moonphase;
        private Long precip;
        private Double sealevelpressure;
        private Snowdepth snowdepth;
        private String stations;
        private String sunrise;
        private String sunset;
        private Double temp;
        private Double visibility;
        private Long wdir;
        private Wgust wgust;
        private Windchill windchill;
        private Double wspd;

        public Builder withCloudcover(Double cloudcover) {
            this.cloudcover = cloudcover;
            return this;
        }

        public Builder withDatetime(String datetime) {
            this.datetime = datetime;
            return this;
        }

        public Builder withDew(Double dew) {
            this.dew = dew;
            return this;
        }

        public Builder withHeatindex(Heatindex heatindex) {
            this.heatindex = heatindex;
            return this;
        }

        public Builder withHumidity(Double humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder withIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public Builder withMoonphase(Double moonphase) {
            this.moonphase = moonphase;
            return this;
        }

        public Builder withPrecip(Long precip) {
            this.precip = precip;
            return this;
        }

        public Builder withSealevelpressure(Double sealevelpressure) {
            this.sealevelpressure = sealevelpressure;
            return this;
        }

        public Builder withSnowdepth(Snowdepth snowdepth) {
            this.snowdepth = snowdepth;
            return this;
        }

        public Builder withStations(String stations) {
            this.stations = stations;
            return this;
        }

        public Builder withSunrise(String sunrise) {
            this.sunrise = sunrise;
            return this;
        }

        public Builder withSunset(String sunset) {
            this.sunset = sunset;
            return this;
        }

        public Builder withTemp(Double temp) {
            this.temp = temp;
            return this;
        }

        public Builder withVisibility(Double visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder withWdir(Long wdir) {
            this.wdir = wdir;
            return this;
        }

        public Builder withWgust(Wgust wgust) {
            this.wgust = wgust;
            return this;
        }

        public Builder withWindchill(Windchill windchill) {
            this.windchill = windchill;
            return this;
        }

        public Builder withWspd(Double wspd) {
            this.wspd = wspd;
            return this;
        }

        public CurrentConditions build() {
            CurrentConditions currentConditions = new CurrentConditions();
            currentConditions.cloudcover = cloudcover;
            currentConditions.datetime = datetime;
            currentConditions.dew = dew;
            currentConditions.heatindex = heatindex;
            currentConditions.humidity = humidity;
            currentConditions.icon = icon;
            currentConditions.moonphase = moonphase;
            currentConditions.precip = precip;
            currentConditions.sealevelpressure = sealevelpressure;
            currentConditions.snowdepth = snowdepth;
            currentConditions.stations = stations;
            currentConditions.sunrise = sunrise;
            currentConditions.sunset = sunset;
            currentConditions.temp = temp;
            currentConditions.visibility = visibility;
            currentConditions.wdir = wdir;
            currentConditions.wgust = wgust;
            currentConditions.windchill = windchill;
            currentConditions.wspd = wspd;
            return currentConditions;
        }

    }

}
