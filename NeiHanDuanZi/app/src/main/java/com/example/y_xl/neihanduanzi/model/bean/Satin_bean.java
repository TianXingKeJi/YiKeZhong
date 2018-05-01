package com.example.y_xl.neihanduanzi.model.bean;

import java.util.List;

/**
 * Created by xm7 on 2018/4/18.
 */

public class Satin_bean {

    /**
     * msg : 获取段子列表成功
     * code : 0
     * data : [{"commentNum":null,"content":"一刻钟","createTime":"2018-04-17T19:41:04","imgUrls":null,"jid":1978,"praiseNum":null,"shareNum":null,"uid":1286,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523675918516crop_photo.jpg","nickname":"大头","praiseNum":"null"}},{"commentNum":null,"content":"希望你永远 明朗坦荡钟情豁达 有得有失有坚持 能笑能哭能尽欢","createTime":"2018-04-17T18:42:47","imgUrls":null,"jid":1977,"praiseNum":null,"shareNum":null,"uid":12898,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"希望你永远 明朗坦荡钟情豁达 有得有失有坚持 能笑能哭能尽欢","createTime":"2018-04-17T18:41:02","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523961662917asg.jpg","jid":1976,"praiseNum":null,"shareNum":null,"uid":12898,"user":{"age":null,"fans":"null","follow":false,"icon":null,"nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"好好学习天天向上,以后你也是老板,,,什么鬼","createTime":"2018-04-16T17:52:00","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523872320068abc.jpg|https://www.zhaoapi.cn/images/quarter/1523872320084abcd.jpg","jid":1975,"praiseNum":null,"shareNum":null,"uid":10811,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523975187612gaga_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"好好学习天天向上,以后你也是老板","createTime":"2018-04-16T17:49:06","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523872146225abc.jpg","jid":1974,"praiseNum":null,"shareNum":null,"uid":10811,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523975187612gaga_icon.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"天气晴朗 毛毛很多","createTime":"2018-04-16T16:36:41","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523867801486ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523867801486ic_launcher_round.png","jid":1973,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523871892243abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"天气晴朗 毛毛很多","createTime":"2018-04-16T15:57:39","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523865459377ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523865459377ic_launcher_round.png","jid":1972,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523871892243abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"天气晴朗 毛毛很多","createTime":"2018-04-16T15:56:04","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523865364064ic_launcher.png","jid":1971,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523871892243abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"今天天气不错 心情挺好的,,,只是好多毛毛在飞,,啊飞","createTime":"2018-04-16T14:36:32","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523860592613ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523860592613ic_launcher_round.png","jid":1970,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523871892243abc.jpg","nickname":null,"praiseNum":"null"}},{"commentNum":null,"content":"今天天气不错 心情挺好的,,,只是好多毛毛在飞","createTime":"2018-04-16T14:35:07","imgUrls":"https://www.zhaoapi.cn/images/quarter/1523860507942ic_launcher.png|https://www.zhaoapi.cn/images/quarter/1523860507942ic_launcher.png","jid":1969,"praiseNum":null,"shareNum":null,"uid":3004,"user":{"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523871892243abc.jpg","nickname":null,"praiseNum":"null"}}]
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
         * content : 一刻钟
         * createTime : 2018-04-17T19:41:04
         * imgUrls : null
         * jid : 1978
         * praiseNum : null
         * shareNum : null
         * uid : 1286
         * user : {"age":null,"fans":"null","follow":false,"icon":"https://www.zhaoapi.cn/images/1523675918516crop_photo.jpg","nickname":"大头","praiseNum":"null"}
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
             * icon : https://www.zhaoapi.cn/images/1523675918516crop_photo.jpg
             * nickname : 大头
             * praiseNum : null
             */

            private Object age;
            private String fans;
            private boolean follow;
            private String icon;
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

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
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
