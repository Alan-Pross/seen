package com.a8plus1.seen.Bean;


public class NetData {
    public static final String urlLogin = "http://39.107.103.203:8080/Seen/LoginServlet";//登录》》ID 密码《《成功失败
    public static final String urlSignup = "http://39.107.103.203:8080/Seen/RegisterServlet";//注册》》ID 密码《《成功失败

    public static final String urlIcon = "http://39.107.103.203:8080/Seen/IconServlet";//头像上传》》ID String《《成功
    public static final String urlGetIcon = "http://39.107.103.203:8080/Seen/IconServlet";//头像获取》》ID《《String

    public static final String urlInfo = "http://39.107.103.203:8080/Seen/InformationServlet";//上传个人信息》》ID 昵称 签名《《成功
    public static final String urlGetInfo = "http://39.107.103.203:8080/Seen/GetInformationServlet";//获取个人信息》》ID《《昵称 签名

    public static final String urlNote = "http://39.107.103.203:8080/Seen/TieServlet";//发一个帖子》》ID 标题 内容 图片 发帖时间《《成功
    public static final String urlGetNote = "http://39.107.103.203:8080/Seen/GetTieServlet";//获取一个帖子》》帖子号《《发帖人ID 昵称 标题 内容 图片123 发帖时间 点赞量 已阅量
    public static final String urlReply = "http://39.107.103.203:8080/Seen/CommentServlet";//评论一个帖子》》ID 内容 评论时间《《成功
    //public static final String urlGetReply = "http://39.107.103.203:8080/Seen/AnswerServlet";//查看一个帖子的评论》》帖子号《《ID 昵称 内容 评论时间 <list>

    public static final String urlToHNote="http://39.107.103.203:8080/Seen/SortTieServlet";//时间帖子列表》》1时间/2热度《《帖子号 <list>
    public static final String urlFindNote="http://39.107.103.203:8080/Seen/SearchTieServlet";//查询帖子列表》》关键字《《帖子号 <list>
    public static final String urlOnesNote="http://39.107.103.203:8080/Seen/HistoryTieServlet";//个人帖子列表》》ID《《帖子号 <list>

    public static final String urlThumbUp="http://39.107.103.203:8080/Seen/PlusServlet";//点赞》》帖子号 +1/-1《《无
    public static final String urlReadNote="http://39.107.103.203:8080/Seen/SeenServlet";//已阅》》帖子号 +1/-1《《无
}