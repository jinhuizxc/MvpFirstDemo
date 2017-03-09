package com.example.jh.mvpfirstdemo.model;

/**
 * 作者：jinhui on 2017/3/9
 * 邮箱：1004260403@qq.com
 *
 * {"weatherinfo":{"city":"五指山",
 * "cityid":"101310222",
 * "temp":"26",
 * "WD":"东南风",
 * "WS":"2级",
 * "SD":"67%",
 * "WSE":"2",
 * "time":"10:00",
 * "isRadar":"0",
 * "Radar":"",
 * "njd":"6800",
 * "qy":"974"}}
 */

public class MainModel {

    private WeatherinfoBean weatherinfo;

    public WeatherinfoBean getWeatherinfoBean(){
        return weatherinfo;
    }
    public void setWeatherinfoBean(WeatherinfoBean weatherinfo){
        this.weatherinfo = weatherinfo;
    }

    //定义天气信息的bean
    public static class WeatherinfoBean{
        private String city;
        private String cityId;
        private String temp;
        //风向
        private String WD;
        //风力
        private String WS;
        private String SD;
        //
        private String WSE;
        private String time;
        //雷达
        private String isRadar;
        private String Radar;
        private String njd;
        private String qy;

        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }

        public String getCityId() {
            return cityId;
        }
        public void setCityId(String cityId) {
            this.cityId = cityId;
        }

        public String getTemp() {
            return temp;
        }
        public void setTemp(String temp) {
            this.temp = temp;
        }

        public String getWD() {
            return WD;
        }
        public void setWD(String WD) {
            this.WD = WD;
        }

        public String getWS() {
            return WS;
        }
        public void setWS(String WS) {
            this.WS = WS;
        }

        public String getSD() {
            return SD;
        }
        public void setSD(String SD) {
            this.SD = SD;
        }

        public String getWSE() {
            return WSE;
        }
        public void setWSE(String WSE) {
            this.WSE = WSE;
        }

        public String getTime() {
            return time;
        }
        public void setTime(String time) {
            this.time = time;
        }

        public String getIsRadar() {
            return isRadar;
        }
        public void setIsRadar(String isRadar) {
            this.isRadar = isRadar;
        }

        public String getRadar() {
            return Radar;
        }
        public void setRadar(String radar) {
            Radar = radar;
        }

        public String getNjd() {
            return njd;
        }
        public void setNjd(String njd) {
            this.njd = njd;
        }

        public String getQy() {
            return qy;
        }
        public void setQy(String qy) {
            this.qy = qy;
        }
    }
}
