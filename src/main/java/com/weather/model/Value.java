
package com.weather.model;

import com.google.gson.annotations.Expose;


public class Value {

    @Expose
    private Double cape;
    @Expose
    private Double cin;
    @Expose
    private Double cloudcover;
    @Expose
    private String conditions;
    @Expose
    private Long datetime;
    @Expose
    private String datetimeStr;
    @Expose
    private Long dew;
    @Expose
    private Heatindex heatindex;
    @Expose
    private Double humidity;
    @Expose
    private Double maxt;
    @Expose
    private Double mint;
    @Expose
    private Long pop;
    @Expose
    private Double precip;
    @Expose
    private String preciptype;
    @Expose
    private Double sealevelpressure;
    @Expose
    private Long severerisk;
    @Expose
    private Long snow;
    @Expose
    private Long snowdepth;
    @Expose
    private Double solarenergy;
    @Expose
    private Double solarradiation;
    @Expose
    private Double temp;
    @Expose
    private Double uvindex;
    @Expose
    private Double visibility;
    @Expose
    private Long wdir;
    @Expose
    private Double wgust;
    @Expose
    private Windchill windchill;
    @Expose
    private Double wspd;

    public Double getCape() {
        return cape;
    }

    public Double getCin() {
        return cin;
    }

    public Double getCloudcover() {
        return cloudcover;
    }

    public String getConditions() {
        return conditions;
    }

    public Long getDatetime() {
        return datetime;
    }

    public String getDatetimeStr() {
        return datetimeStr;
    }

    public Long getDew() {
        return dew;
    }

    public Heatindex getHeatindex() {
        return heatindex;
    }

    public Double getHumidity() {
        return humidity;
    }

    public Double getMaxt() {
        return maxt;
    }

    public Double getMint() {
        return mint;
    }

    public Long getPop() {
        return pop;
    }

    public Double getPrecip() {
        return precip;
    }

    public String getPreciptype() {
        return preciptype;
    }

    public Double getSealevelpressure() {
        return sealevelpressure;
    }

    public Long getSevererisk() {
        return severerisk;
    }

    public Long getSnow() {
        return snow;
    }

    public Long getSnowdepth() {
        return snowdepth;
    }

    public Double getSolarenergy() {
        return solarenergy;
    }

    public Double getSolarradiation() {
        return solarradiation;
    }

    public Double getTemp() {
        return temp;
    }

    public Double getUvindex() {
        return uvindex;
    }

    public Double getVisibility() {
        return visibility;
    }

    public Long getWdir() {
        return wdir;
    }

    public Double getWgust() {
        return wgust;
    }

    public Windchill getWindchill() {
        return windchill;
    }

    public Double getWspd() {
        return wspd;
    }

    public static class Builder {

        private Double cape;
        private Double cin;
        private Double cloudcover;
        private String conditions;
        private Long datetime;
        private String datetimeStr;
        private Long dew;
        private Heatindex heatindex;
        private Double humidity;
        private Double maxt;
        private Double mint;
        private Long pop;
        private Double precip;
        private String preciptype;
        private Double sealevelpressure;
        private Long severerisk;
        private Long snow;
        private Long snowdepth;
        private Double solarenergy;
        private Double solarradiation;
        private Double temp;
        private Double uvindex;
        private Double visibility;
        private Long wdir;
        private Double wgust;
        private Windchill windchill;
        private Double wspd;

        public Builder withCape(Double cape) {
            this.cape = cape;
            return this;
        }

        public Builder withCin(Double cin) {
            this.cin = cin;
            return this;
        }

        public Builder withCloudcover(Double cloudcover) {
            this.cloudcover = cloudcover;
            return this;
        }

        public Builder withConditions(String conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder withDatetime(Long datetime) {
            this.datetime = datetime;
            return this;
        }

        public Builder withDatetimeStr(String datetimeStr) {
            this.datetimeStr = datetimeStr;
            return this;
        }

        public Builder withDew(Long dew) {
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

        public Builder withMaxt(Double maxt) {
            this.maxt = maxt;
            return this;
        }

        public Builder withMint(Double mint) {
            this.mint = mint;
            return this;
        }

        public Builder withPop(Long pop) {
            this.pop = pop;
            return this;
        }

        public Builder withPrecip(Double precip) {
            this.precip = precip;
            return this;
        }

        public Builder withPreciptype(String preciptype) {
            this.preciptype = preciptype;
            return this;
        }

        public Builder withSealevelpressure(Double sealevelpressure) {
            this.sealevelpressure = sealevelpressure;
            return this;
        }

        public Builder withSevererisk(Long severerisk) {
            this.severerisk = severerisk;
            return this;
        }

        public Builder withSnow(Long snow) {
            this.snow = snow;
            return this;
        }

        public Builder withSnowdepth(Long snowdepth) {
            this.snowdepth = snowdepth;
            return this;
        }

        public Builder withSolarenergy(Double solarenergy) {
            this.solarenergy = solarenergy;
            return this;
        }

        public Builder withSolarradiation(Double solarradiation) {
            this.solarradiation = solarradiation;
            return this;
        }

        public Builder withTemp(Double temp) {
            this.temp = temp;
            return this;
        }

        public Builder withUvindex(Double uvindex) {
            this.uvindex = uvindex;
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

        public Builder withWgust(Double wgust) {
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

        public Value build() {
            Value value = new Value();
            value.cape = cape;
            value.cin = cin;
            value.cloudcover = cloudcover;
            value.conditions = conditions;
            value.datetime = datetime;
            value.datetimeStr = datetimeStr;
            value.dew = dew;
            value.heatindex = heatindex;
            value.humidity = humidity;
            value.maxt = maxt;
            value.mint = mint;
            value.pop = pop;
            value.precip = precip;
            value.preciptype = preciptype;
            value.sealevelpressure = sealevelpressure;
            value.severerisk = severerisk;
            value.snow = snow;
            value.snowdepth = snowdepth;
            value.solarenergy = solarenergy;
            value.solarradiation = solarradiation;
            value.temp = temp;
            value.uvindex = uvindex;
            value.visibility = visibility;
            value.wdir = wdir;
            value.wgust = wgust;
            value.windchill = windchill;
            value.wspd = wspd;
            return value;
        }

    }

}
