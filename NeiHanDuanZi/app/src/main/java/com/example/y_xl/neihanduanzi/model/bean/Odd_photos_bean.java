package com.example.y_xl.neihanduanzi.model.bean;

import java.util.List;

/**
 * Created by 三年 on 2018/4/16.
 */

public class Odd_photos_bean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"天气晴朗 毛毛很多","createTime":"2018-04-16T15:57:39","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523865459377ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523865459377ic_launcher_round.png","jid":1972,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523865167236abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"天气晴朗 毛毛很多","createTime":"2018-04-16T15:56:04","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523865364064ic_launcher.png","jid":1971,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523865167236abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"今天天气不错 心情挺好的,,,只是好多毛毛在飞,,啊飞","createTime":"2018-04-16T14:36:32","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523860592613ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523860592613ic_launcher_round.png","jid":1970,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523865167236abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"今天天气不错 心情挺好的,,,只是好多毛毛在飞","createTime":"2018-04-16T14:35:07","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523860507942ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523860507942ic_launcher.png","jid":1969,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523865167236abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"今天天气不错 心情挺好的","createTime":"2018-04-16T14:32:26","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523860346693ic_launcher.png","jid":1968,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523865167236abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"你好","createTime":"2018-04-16T14:07:34","imgUrls":null,"jid":1967,"praiseNum":null,"shareNum":null,"uid":1570,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":"笑呵呵","praiseNum":"null"}},{"commentNum":null,"content":" 不要发了","createTime":"2018-04-15T19:04:18","imgUrls":null,"jid":1966,"praiseNum":null,"shareNum":null,"uid":10856,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1522500738029test.png","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"图片123123","createTime":"2018-04-15T15:22:43","imgUrls":"https://www.zhaoapi.cn/images/quarter/15237769638604bc9e58c9ac68e0ab1325368601350df.jpg|https://www.zhaoapi.cn/images/quarter/15237769638604bc9e58c9ac68e0ab1325368601350df.jpg|https://www.zhaoapi.cn/images/quarter/15237769638604bc9e58c9ac68e0ab1325368601350df.jpg","jid":1965,"praiseNum":null,"shareNum":null,"uid":13158,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523805435934touxiang.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"图片123123","createTime":"2018-04-15T15:22:35","imgUrls":"https://www.zhaoapi.cn/images/quarter/15237769556414bc9e58c9ac68e0ab1325368601350df.jpg|https://www.zhaoapi.cn/images/quarter/15237769556414bc9e58c9ac68e0ab1325368601350df.jpg|https://www.zhaoapi.cn/images/quarter/15237769556414bc9e58c9ac68e0ab1325368601350df.jpg","jid":1964,"praiseNum":null,"shareNum":null,"uid":13158,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523805435934touxiang.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"图片123123","createTime":"2018-04-15T15:22:32","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523776952641head_icon.jpg|https://www.zhaoapi.cn/images/quarter/1523776952641head_icon.jpg|https://www.zhaoapi.cn/images/quarter/1523776952641head_icon.jpg","jid":1963,"praiseNum":null,"shareNum":null,"uid":13158,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523805435934touxiang.jpg","nickname":null,"praiseNum":"null"}}]
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
         * content : 天气晴朗 毛毛很多
         * createTime : 2018-04-16T15:57:39
         * imgUrls : https://www.zhaoapi.cn/images/quarter/1523865459377ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523865459377ic_launcher_round.png
         * jid : 1972
         * praiseNum : null
         * shareNum : null
         * uid : 3004
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523865167236abc.jpg","nickname":null,"praiseNum":"null"}
         */

        private Object commentNum;
        private String content;
        private String createTime;
        private String imgUrls;
        private int jid;
        private Object praiseNum;
        private Object shareNum;
        private int uid;
        private UserBean user;

        public Object getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(Object commentNum) {
            this.commentNum = commentNum;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getImgUrls() {
            return imgUrls;
        }

        public void setImgUrls(String imgUrls) {
            this.imgUrls = imgUrls;
        }

        public int getJid() {
            return jid;
        }

        public void setJid(int jid) {
            this.jid = jid;
        }

        public Object getPraiseNum() {
            return praiseNum;
        }

        public void setPraiseNum(Object praiseNum) {
            this.praiseNum = praiseNum;
        }

        public Object getShareNum() {
            return shareNum;
        }

        public void setShareNum(Object shareNum) {
            this.shareNum = shareNum;
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

        public static class UserBean {
            /**
             * age : null
             * fans : null
             * follow : false
             * icon : https://www.zhaoapi.cn/images/1523865167236abc.jpg
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
