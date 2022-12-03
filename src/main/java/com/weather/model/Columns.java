
package com.weather.model;

import com.google.gson.annotations.Expose;

public class Columns {

    @Expose
    private Address address;
    @Expose
    private Cape cape;
    @Expose
    private Cin cin;
    @Expose
    private Cloudcover cloudcover;
    @Expose
    private Conditions conditions;
    @Expose
    private Datetime datetime;
    @Expose
    private Dew dew;
    @Expose
    private Heatindex heatindex;
    @Expose
    private Humidity humidity;
    @Expose
    private Latitude latitude;
    @Expose
    private Longitude longitude;
    @Expose
    private Maxt maxt;
    @Expose
    private Mint mint;
    @Expose
    private Name name;
    @Expose
    private Pop pop;
    @Expose
    private Precip precip;
    @Expose
    private Preciptype preciptype;
    @Expose
    private ResolvedAddress resolvedAddress;
    @Expose
    private Sealevelpressure sealevelpressure;
    @Expose
    private Severerisk severerisk;
    @Expose
    private Snow snow;
    @Expose
    private Snowdepth snowdepth;
    @Expose
    private Solarenergy solarenergy;
    @Expose
    private Solarradiation solarradiation;
    @Expose
    private Temp temp;
    @Expose
    private Uvindex uvindex;
    @Expose
    private Visibility visibility;
    @Expose
    private Wdir wdir;
    @Expose
    private Wgust wgust;
    @Expose
    private Windchill windchill;
    @Expose
    private Wspd wspd;

    public Address getAddress() {
        return address;
    }

    public Cape getCape() {
        return cape;
    }

    public Cin getCin() {
        return cin;
    }

    public Cloudcover getCloudcover() {
        return cloudcover;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public Datetime getDatetime() {
        return datetime;
    }

    public Dew getDew() {
        return dew;
    }

    public Heatindex getHeatindex() {
        return heatindex;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public Latitude getLatitude() {
        return latitude;
    }

    public Longitude getLongitude() {
        return longitude;
    }

    public Maxt getMaxt() {
        return maxt;
    }

    public Mint getMint() {
        return mint;
    }

    public Name getName() {
        return name;
    }

    public Pop getPop() {
        return pop;
    }

    public Precip getPrecip() {
        return precip;
    }

    public Preciptype getPreciptype() {
        return preciptype;
    }

    public ResolvedAddress getResolvedAddress() {
        return resolvedAddress;
    }

    public Sealevelpressure getSealevelpressure() {
        return sealevelpressure;
    }

    public Severerisk getSevererisk() {
        return severerisk;
    }

    public Snow getSnow() {
        return snow;
    }

    public Snowdepth getSnowdepth() {
        return snowdepth;
    }

    public Solarenergy getSolarenergy() {
        return solarenergy;
    }

    public Solarradiation getSolarradiation() {
        return solarradiation;
    }

    public Temp getTemp() {
        return temp;
    }

    public Uvindex getUvindex() {
        return uvindex;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public Wdir getWdir() {
        return wdir;
    }

    public Wgust getWgust() {
        return wgust;
    }

    public Windchill getWindchill() {
        return windchill;
    }

    public Wspd getWspd() {
        return wspd;
    }

    public static class Builder {

        private Address address;
        private Cape cape;
        private Cin cin;
        private Cloudcover cloudcover;
        private Conditions conditions;
        private Datetime datetime;
        private Dew dew;
        private Heatindex heatindex;
        private Humidity humidity;
        private Latitude latitude;
        private Longitude longitude;
        private Maxt maxt;
        private Mint mint;
        private Name name;
        private Pop pop;
        private Precip precip;
        private Preciptype preciptype;
        private ResolvedAddress resolvedAddress;
        private Sealevelpressure sealevelpressure;
        private Severerisk severerisk;
        private Snow snow;
        private Snowdepth snowdepth;
        private Solarenergy solarenergy;
        private Solarradiation solarradiation;
        private Temp temp;
        private Uvindex uvindex;
        private Visibility visibility;
        private Wdir wdir;
        private Wgust wgust;
        private Windchill windchill;
        private Wspd wspd;

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder withCape(Cape cape) {
            this.cape = cape;
            return this;
        }

        public Builder withCin(Cin cin) {
            this.cin = cin;
            return this;
        }

        public Builder withCloudcover(Cloudcover cloudcover) {
            this.cloudcover = cloudcover;
            return this;
        }

        public Builder withConditions(Conditions conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder withDatetime(Datetime datetime) {
            this.datetime = datetime;
            return this;
        }

        public Builder withDew(Dew dew) {
            this.dew = dew;
            return this;
        }

        public Builder withHeatindex(Heatindex heatindex) {
            this.heatindex = heatindex;
            return this;
        }

        public Builder withHumidity(Humidity humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder withLatitude(Latitude latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder withLongitude(Longitude longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder withMaxt(Maxt maxt) {
            this.maxt = maxt;
            return this;
        }

        public Builder withMint(Mint mint) {
            this.mint = mint;
            return this;
        }

        public Builder withName(Name name) {
            this.name = name;
            return this;
        }

        public Builder withPop(Pop pop) {
            this.pop = pop;
            return this;
        }

        public Builder withPrecip(Precip precip) {
            this.precip = precip;
            return this;
        }

        public Builder withPreciptype(Preciptype preciptype) {
            this.preciptype = preciptype;
            return this;
        }

        public Builder withResolvedAddress(ResolvedAddress resolvedAddress) {
            this.resolvedAddress = resolvedAddress;
            return this;
        }

        public Builder withSealevelpressure(Sealevelpressure sealevelpressure) {
            this.sealevelpressure = sealevelpressure;
            return this;
        }

        public Builder withSevererisk(Severerisk severerisk) {
            this.severerisk = severerisk;
            return this;
        }

        public Builder withSnow(Snow snow) {
            this.snow = snow;
            return this;
        }

        public Builder withSnowdepth(Snowdepth snowdepth) {
            this.snowdepth = snowdepth;
            return this;
        }

        public Builder withSolarenergy(Solarenergy solarenergy) {
            this.solarenergy = solarenergy;
            return this;
        }

        public Builder withSolarradiation(Solarradiation solarradiation) {
            this.solarradiation = solarradiation;
            return this;
        }

        public Builder withTemp(Temp temp) {
            this.temp = temp;
            return this;
        }

        public Builder withUvindex(Uvindex uvindex) {
            this.uvindex = uvindex;
            return this;
        }

        public Builder withVisibility(Visibility visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder withWdir(Wdir wdir) {
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

        public Builder withWspd(Wspd wspd) {
            this.wspd = wspd;
            return this;
        }

        public Columns build() {
            Columns columns = new Columns();
            columns.address = address;
            columns.cape = cape;
            columns.cin = cin;
            columns.cloudcover = cloudcover;
            columns.conditions = conditions;
            columns.datetime = datetime;
            columns.dew = dew;
            columns.heatindex = heatindex;
            columns.humidity = humidity;
            columns.latitude = latitude;
            columns.longitude = longitude;
            columns.maxt = maxt;
            columns.mint = mint;
            columns.name = name;
            columns.pop = pop;
            columns.precip = precip;
            columns.preciptype = preciptype;
            columns.resolvedAddress = resolvedAddress;
            columns.sealevelpressure = sealevelpressure;
            columns.severerisk = severerisk;
            columns.snow = snow;
            columns.snowdepth = snowdepth;
            columns.solarenergy = solarenergy;
            columns.solarradiation = solarradiation;
            columns.temp = temp;
            columns.uvindex = uvindex;
            columns.visibility = visibility;
            columns.wdir = wdir;
            columns.wgust = wgust;
            columns.windchill = windchill;
            columns.wspd = wspd;
            return columns;
        }

    }

}
