package com.example.y_xl.neihanduanzi.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/4/22 0022.
 */

public class VideoBeann {
    /**
     * msg : 获取作品列表成功
     * code : 0
     * data : [{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524403095441tupian.png","createTime":"2018-04-22T21:18:15","favoriteNum":0,"latitude":null,"localUri":null,"longitude":"36.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524403095441aaa.mp4","wid":367,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524402703425nv.png","createTime":"2018-04-22T21:11:43","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524402703425baby.mp4","wid":366,"workDesc":"我是一组成员_范冰冰！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524402688980nv.png","createTime":"2018-04-22T21:11:28","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524402688980baby.mp4","wid":365,"workDesc":"我是一组成员_范冰冰！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524402358555nv.png","createTime":"2018-04-22T21:05:58","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524402358555baby.mp4","wid":364,"workDesc":"我是一组成员_范冰冰！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524401892413nv.png","createTime":"2018-04-22T20:58:12","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13315,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524401892413baby.mp4","wid":363,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524398657740pic.jpg","createTime":"2018-04-22T20:04:17","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524398657740shi.mp4","wid":362,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524398418935pic.jpg","createTime":"2018-04-22T20:00:18","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524398418935shi.mp4","wid":361,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524398178253C6C0BA66FD360E53D4A79E4B8D60F0EA.jpg","createTime":"2018-04-22T19:56:18","favoriteNum":0,"latitude":"39.8","localUri":null,"longitude":"36.1","playNum":0,"praiseNum":0,"uid":11555,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524398178253aaa.mp4","wid":360,"workDesc":"/sdcard/Movies/ec88d83f-d6ba-4ec9-bf9b-d1fc3ff7c958.mp4"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524394275977nv.png","createTime":"2018-04-22T18:51:15","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":3026,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524033488755test.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524394275977recording105906781.mp4","wid":359,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524393900523nv.png","createTime":"2018-04-22T18:45:00","favoriteNum":0,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":3026,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524033488755test.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524393900523recording-1045239487.mp4","wid":358,"workDesc":"这个视屏非常好看！"}]
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
         * commentNum : 0
         * comments : []
         * cover : https://www.zhaoapi.cn/images/quarter/1524403095441tupian.png
         * createTime : 2018-04-22T21:18:15
         * favoriteNum : 0
         * latitude : null
         * localUri : null
         * longitude : 36.1
         * playNum : 0
         * praiseNum : 0
         * uid : 11555
         * user : {"age":null,"fans":"null","follow":false,"icon":null,"nickname":"你吃饱了没","praiseNum":"null"}
         * videoUrl : https://www.zhaoapi.cn/images/quarter/1524403095441aaa.mp4
         * wid : 367
         * workDesc : null
         */

        private int commentNum;
        private String cover;
        private String createTime;
        private int favoriteNum;
        private Object latitude;
        private Object localUri;
        private String longitude;
        private int playNum;
        private int praiseNum;
        private int uid;
        private UserBean user;
        private String videoUrl;
        private int wid;
        private Object workDesc;
        private List<?> comments;

        public int getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(int commentNum) {
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

        public int getFavoriteNum() {
            return favoriteNum;
        }

        public void setFavoriteNum(int favoriteNum) {
            this.favoriteNum = favoriteNum;
        }

        public Object getLatitude() {
            return latitude;
        }

        public void setLatitude(Object latitude) {
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

        public int getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(int praiseNum) {
            this.praiseNum = praiseNum;
        }

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
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

        public Object getWorkDesc() {
            return workDesc;
        }

        public void setWorkDesc(Object workDesc) {
            this.workDesc = workDesc;
        }

        public List<?> getComments() {
            return comments;
        }

        public void setComments(List<?> comments) {
            this.comments = comments;
        }

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : null
             * nickname : 你吃饱了没
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private Object icon;
            private String nickname;
            private String praiseNum;

            public Object getAge() {
                return age;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public boolean isFollow() {
                return follow;
            }

            public void setFollow(boolean follow) {
                this.follow = follow;
            }

            public Object getIcon() {
                return icon;
            }

            public void setIcon(Object icon) {
                this.icon = icon;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getPraiseNum() {
                return praiseNum;
            }

            public void setPraiseNum(String praiseNum) {
                this.praiseNum = praiseNum;
            }
        }
    }
}
