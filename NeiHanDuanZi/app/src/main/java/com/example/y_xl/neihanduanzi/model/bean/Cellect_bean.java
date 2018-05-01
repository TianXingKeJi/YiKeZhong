package com.example.y_xl.neihanduanzi.model.bean;

import java.util.List;

/**
 * Created by 三年 on 2018/4/23.
 */

public class Cellect_bean {

    /**
     * msg : 获取收藏列表成功
     * code : 0
     * data : [{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524218619739nv.png","createTime":"2018-04-20T18:03:39","favoriteNum":1,"latitude":"27.997723","localUri":null,"longitude":"109.568099","playNum":0,"praiseNum":0,"uid":13563,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524287428536nv.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524218619739baby.mp4","wid":343,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524217132468nv.png","createTime":"2018-04-20T17:38:52","favoriteNum":1,"latitude":"27.997723","localUri":null,"longitude":"109.568099","playNum":0,"praiseNum":0,"uid":13563,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524287428536nv.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524217132468baby.mp4","wid":342,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1524216792610nv.png","createTime":"2018-04-20T17:33:12","favoriteNum":1,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":13563,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524287428536nv.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524216792610baby.mp4","wid":341,"workDesc":"这个视屏非常好看！"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15242137196491-1.jpg","createTime":"2018-04-20T16:41:59","favoriteNum":1,"latitude":"2","localUri":null,"longitude":"2","playNum":0,"praiseNum":0,"uid":13498,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1524213719649优酷录屏2018-4-20-16-35-11.flv","wid":340,"workDesc":"好好"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1523966613495nicai","createTime":"2018-04-17T20:03:33","favoriteNum":2,"latitude":"0.0","localUri":null,"longitude":"0.0","playNum":0,"praiseNum":0,"uid":10856,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1522500738029test.png","nickname":null,"praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1523966613495recording-1142357950.mp4","wid":339,"workDesc":"哈哈"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1523946239913c.png","createTime":"2018-04-17T14:23:59","favoriteNum":3,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":1,"uid":12457,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524461429162gaga_icon.jpg","nickname":"你林超级帅","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1523946239913cccccc.mp4","wid":338,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/15236772758462018-04-12_14-22-38.png","createTime":"2018-04-14T11:41:15","favoriteNum":1,"latitude":"36.343921","localUri":null,"longitude":"110.258893","playNum":2,"praiseNum":1,"uid":12400,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/15236793605801523679359410.png","nickname":"日出东方","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1523677275846recording1988159117.mp4","wid":334,"workDesc":"666"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1523866272236b.png","createTime":"2018-04-16T16:11:12","favoriteNum":1,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":3,"praiseNum":0,"uid":12457,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524461429162gaga_icon.jpg","nickname":"你林超级帅","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1523866272236aaaaa.mp4","wid":335,"workDesc":"666"},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1523866922611d.png","createTime":"2018-04-16T16:22:02","favoriteNum":2,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":1,"praiseNum":0,"uid":12457,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524461429162gaga_icon.jpg","nickname":"你林超级帅","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1523866922611978ffdbe051f8b6caf7e1cdb19be6bc1.mp4","wid":336,"workDesc":null},{"commentNum":0,"comments":[],"cover":"https://www.zhaoapi.cn/images/quarter/1523927121516IMG_2007.JPEG","createTime":"2018-04-17T09:05:21","favoriteNum":2,"latitude":"39.95","localUri":null,"longitude":"116.30","playNum":0,"praiseNum":0,"uid":12457,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524461429162gaga_icon.jpg","nickname":"你林超级帅","praiseNum":"null"},"videoUrl":"https://www.zhaoapi.cn/images/quarter/1523927121516cccccc.mp4","wid":337,"workDesc":null}]
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
         * cover : https://www.zhaoapi.cn/images/quarter/1524218619739nv.png
         * createTime : 2018-04-20T18:03:39
         * favoriteNum : 1
         * latitude : 27.997723
         * localUri : null
         * longitude : 109.568099
         * playNum : 0
         * praiseNum : 0
         * uid : 13563
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1524287428536nv.png","nickname":null,"praiseNum":"null"}
         * videoUrl : https://www.zhaoapi.cn/images/quarter/1524218619739baby.mp4
         * wid : 343
         * workDesc : 这个视屏非常好看！
         */

        private int commentNum;
        private String cover;
        private String createTime;
        private int favoriteNum;
        private String latitude;
        private String localUri;
        private String longitude;
        private int playNum;
        private int praiseNum;
        private int uid;
        private UserBean user;
        private String videoUrl;
        private int wid;
        private String workDesc;
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

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getLocalUri() {
            return localUri;
        }

        public void setLocalUri(String localUri) {
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

        public String getWorkDesc() {
            return workDesc;
        }

        public void setWorkDesc(String workDesc) {
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
             * icon : https://www.zhaoapi.cn/images/1524287428536nv.png
             * nickname : null
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private String icon;
            private Object nickname;
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

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }

            public Object getNickname() {
                return nickname;
            }

            public void setNickname(Object nickname) {
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
