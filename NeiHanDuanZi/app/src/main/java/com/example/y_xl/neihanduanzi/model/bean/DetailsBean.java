package com.example.y_xl.neihanduanzi.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

public class DetailsBean {
    /**
     * msg : 获取作品列表成功
     * code : 0
     * data : [{"commentNum":null,"cover":"https://www.zhaoapi.cn/images/quarter/1524398178253C6C0BA66FD360E53D4A79E4B8D60F0EA.jpg","createTime":"2018-04-22T19:56:18","favoriteNum":null,"latitude":"39.8","localUri":null,"longitude":"36.1","playNum":0,"praiseNum":null,"uid":11555,"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524398178253aaa.mp4","wid":360,"workDesc":"/sdcard/Movies/ec88d83f-d6ba-4ec9-bf9b-d1fc3ff7c958.mp4"},{"commentNum":null,"cover":"https://www.zhaoapi.cn/images/quarter/1524398418935pic.jpg","createTime":"2018-04-22T20:00:18","favoriteNum":null,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":null,"uid":11555,"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524398418935shi.mp4","wid":361,"workDesc":null},{"commentNum":null,"cover":"https://www.zhaoapi.cn/images/quarter/1524398657740pic.jpg","createTime":"2018-04-22T20:04:17","favoriteNum":null,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":null,"uid":11555,"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524398657740shi.mp4","wid":362,"workDesc":null},{"commentNum":null,"cover":"https://www.zhaoapi.cn/images/quarter/1524403095441tupian.png","createTime":"2018-04-22T21:18:15","favoriteNum":null,"latitude":null,"localUri":null,"longitude":"36.1","playNum":1,"praiseNum":null,"uid":11555,"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524403095441aaa.mp4","wid":367,"workDesc":null}]
     */

    private String msg;
    private String code;
    private List<DataBean> data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * commentNum : null
         * cover : https://www.zhaoapi.cn/images/quarter/1524398178253C6C0BA66FD360E53D4A79E4B8D60F0EA.jpg
         * createTime : 2018-04-22T19:56:18
         * favoriteNum : null
         * latitude : 39.8
         * localUri : null
         * longitude : 36.1
         * playNum : 0
         * praiseNum : null
         * uid : 11555
         * videoUrl : https://www.zhaoapi.cn/images/quarter/1524398178253aaa.mp4
         * wid : 360
         * workDesc : /sdcard/Movies/ec88d83f-d6ba-4ec9-bf9b-d1fc3ff7c958.mp4
         */

        private Object commentNum;
        private String cover;
        private String createTime;
        private Object favoriteNum;
        private String latitude;
        private Object localUri;
        private String longitude;
        private int playNum;
        private Object praiseNum;
        private int uid;
        private String videoUrl;
        private int wid;
        private String workDesc;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public Object getFavoriteNum() {
            return favoriteNum;
        }

        public void setFavoriteNum(Object favoriteNum) {
            this.favoriteNum = favoriteNum;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public Object getLocalUri() {
            return localUri;
        }

        public void setLocalUri(Object localUri) {
            this.localUri = localUri;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public int getPlayNum() {
            return playNum;
        }

        public void setPlayNum(int playNum) {
            this.playNum = playNum;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public int getWid() {
            return wid;
        }

        public void setWid(int wid) {
            this.wid = wid;
        }

        public String getWorkDesc() {
            return workDesc;
        }

        public void setWorkDesc(String workDesc) {
            this.workDesc = workDesc;
        }
    }
}
