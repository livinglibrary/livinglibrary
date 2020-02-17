/*
Navicat MySQL Data Transfer

Source Server         : guohongming
Source Server Version : 80015
Source Host           : localhost:3306
Source Database       : livinglibrary

Target Server Type    : MYSQL
Target Server Version : 80015
File Encoding         : 65001

Date: 2020-02-17 10:07:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for resume_comment
-- ----------------------------
DROP TABLE IF EXISTS `resume_comment`;
CREATE TABLE `resume_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `resume_list_id` int(11) DEFAULT NULL COMMENT '简历清单id',
  `content` varchar(50) DEFAULT NULL,
  `show` tinyint(4) DEFAULT NULL,
  `stu_name` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='简历评论表';

-- ----------------------------
-- Records of resume_comment
-- ----------------------------
INSERT INTO `resume_comment` VALUES ('1', '16046114', '1', '评论测试1', '1', '郭红明');
INSERT INTO `resume_comment` VALUES ('2', '16046124', '2', '评论测试2', '1', '张三');


DROP TABLE IF EXISTS `resume_detail`;
CREATE TABLE `resume_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `list_id` int(11) DEFAULT NULL COMMENT '简历清单表id',
  `content` text COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='简历明细表';

-- ----------------------------
-- Records of resume_detail
-- ----------------------------
INSERT INTO `resume_detail` VALUES ('1', '1', '<p style=\"margin: 10px auto;\">content-type 指请求消息头的中请求消息数据的格式<br/><br/>有三种用法<br/><br/>第一种：设置在request header的参数中<br/><br/>js中可以在发送请求前在请求消息头中设置content-type<br/>var xhr = window.XMLHttpRequest ? new window.XMLHttpRequest() : new ActiveXObject(&#39;Microsoft.XMLHTTP&#39;);<br/>xhr.open(method, url, true);<br/>xhr.onreadystatechange = function () {};<br/>xhr.setRequestHeader(&#39;Content-Type&#39;, &#39;application/x-www-form-urlencoded&#39;);<br/>xhr.send(params);<br/><br/>第二种：设置在发送请求页面的header中<br/>&lt;header&gt;<br/>&nbsp; &lt;meta content=&quot;text/html&quot; charset=&quot;utf-8&quot;/&gt;<br/>&lt;/header&gt;<br/>第三种：设置在form表单提交的enctype参数中<br/>&lt;form enctype=&quot;multipart/form-data&quot;&gt;&lt;/form&gt;<br/><br/>格式 Content-Type: type/subtype;parameter;<br/>例如 Content-Type: text/html;charset:utf-8;<br/>&nbsp;<br/>type:text,或者application,或者*<br/>&nbsp;&nbsp;&nbsp;&nbsp; text-------主类型是文本类型<br/>&nbsp;&nbsp;&nbsp;&nbsp; application----主类型是应用<br/>&nbsp;&nbsp;&nbsp;&nbsp; *--------------所有类型都适用<br/>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp; &nbsp;<br/>subtype:子类型<br/>&nbsp;&nbsp; &nbsp;*---------------所有类型都适用<br/>&nbsp;&nbsp;&nbsp; html------------子类型为html格式<br/>&nbsp;&nbsp;&nbsp; xml-------------子类型为xml<br/>&nbsp;&nbsp;&nbsp; png-------------子类型为png格式<br/>&nbsp;&nbsp; &nbsp;<br/>parameter：参数，常用的是编码方式参数charset:utf-8<br/><br/>type/subtype 即是互联网媒体类型，也叫作MIME-Type<br/><br/>常见的媒体类型<br/><br/>主类型是text的<br/><br/>&nbsp;&nbsp;&nbsp; text/html ： HTML格式<br/>&nbsp;&nbsp;&nbsp; text/plain ：纯文本格式&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<br/>&nbsp;&nbsp;&nbsp; text/xml ：&nbsp; XML格式<br/>&nbsp;&nbsp;&nbsp; image/png： png图片格式<br/>&nbsp;&nbsp; &nbsp;<br/>主类型是application的<br/><br/>&nbsp;&nbsp;&nbsp; application/xhtml+xml ：XHTML格式<br/>&nbsp;&nbsp;&nbsp; application/xml&nbsp;&nbsp;&nbsp;&nbsp; ： XML数据格式<br/>&nbsp;&nbsp;&nbsp; application/json&nbsp;&nbsp;&nbsp; ： JSON数据格式<br/>&nbsp;&nbsp;&nbsp; application/octet-stream ： 二进制流数据（如常见的文件下载）<br/><br/>特殊的用于上传文件时的mime-type<br/>&nbsp;&nbsp;&nbsp; multipart/form-data ： 需要在表单中进行文件上传时，就需要使用该格式<br/>&nbsp;&nbsp; &nbsp;application/x-www-form-urlencoded: 表单提交默认的mime-type,设置在enctype参数中，表单数据将会以k1=v1&amp;k1=v1&amp;k1=v1的形式发送到服务器<br/>&nbsp;&nbsp; &nbsp;<br/>mime-type的设置与文件类型，文件后缀名密切相关，如tomcat中的web.xml文件中就有详尽的mime-mappping设置<br/>详细的mime-type列表：http://www.w3school.com.cn/media/media_mimeref.asp</p><p>标签:&nbsp;<a href=\"http://www.cnblogs.com/carolddz/tag/web%E5%89%8D%E7%AB%AF/\" style=\"color: rgb(159, 130, 72); text-decoration-line: none;\">web前端</a>,&nbsp;<a href=\"http://www.cnblogs.com/carolddz/tag/http%E8%AF%B7%E6%B1%82/\" style=\"color: rgb(159, 130, 72); text-decoration-line: none;\">http请求</a>,&nbsp;<a href=\"http://www.cnblogs.com/carolddz/tag/%E5%AA%92%E4%BD%93%E7%B1%BB%E5%9E%8B/\" style=\"color: rgb(159, 130, 72); text-decoration-line: none;\">媒体类型</a>,&nbsp;<a href=\"http://www.cnblogs.com/carolddz/tag/content-type/\" style=\"color: rgb(159, 130, 72); text-decoration-line: none;\">content-type</a></p><p><br/></p>');
INSERT INTO `resume_detail` VALUES ('2', '2', '<p><strong>环境：idea 2016.3.4， jdk 1.8， mysql 5.6， spring-boot 1.5.2</strong>&nbsp;<br><strong>背景：首先建立 entity 映射数据库（非专业 java 不知道这怎么说）</strong></p><pre><code>@Entity\r\n@Table(name = \"user\")\r\npublic class User {\r\n    @Id\r\n    @GeneratedValue(strategy = GenerationType.AUTO)\r\n    private Long id;\r\n    private String userName;    // 账号\r\n    private String password;    // 密码\r\n    // getter setter 方法略过\r\n}</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li></ul></pre><p>然后建立与之对应的 model</p><pre><code>public class UserModel implements Serializable {\r\n    // 一些属性\r\n}</code><ul><li>1</li><li>2</li><li>3</li></ul></pre><p>这里我们分情况讨论</p><h3 id=\"首先第一种情况查询的字段与表中的字段全部对应就是查表里所有的字段但是使用-model-作为接收对象\"><a name=\"t1\"></a>首先第一种情况：查询的字段与表中的字段全部对应（就是查表里所有的字段，但是使用 Model 作为接收对象）</h3><p>这种情况比较简单，调用 Repository 提供的方法，返回一个 entity , 然后将 entity 的属性复制到 model 中。像这样</p><pre><code>UserModel user = new UserModel();\r\nUser userEntity = new User();\r\n// 一个工具类，具体使用方法请百度\r\nBeanUtils.copyProperties(user, userEntity);</code><ul><li>1</li><li>2</li><li>3</li><li>4</li></ul></pre><h3 id=\"第二种情况只查询指定的几个字段\"><a name=\"t2\"></a>第二种情况：只查询指定的几个字段</h3><p>现在我有张表，有字段如下：</p><pre><code>@Entity\r\n@Table(name = \"user_info\")\r\npublic class UserInfo {\r\n    @Id\r\n    @GeneratedValue(strategy = GenerationType.AUTO)\r\n    private Long id;\r\n    private String name = \"用户\";     // 昵称\r\n    private String signature;         // 个性签名\r\n    private String gender = \"未知\";   // 性别\r\n    private String description;       // 个人说明\r\n    private String avatar;            // 头像\r\n    private Long role;                // 权限\r\n    private Boolean disable;          // 是否冻结\r\n    private Date createTime;          // 创建时间\r\n    private Boolean isDelete;         // 是否删除\r\n    private Long userId;              // 用户 Id\r\n    // ...\r\n}</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li><li>11</li><li>12</li><li>13</li><li>14</li><li>15</li><li>16</li><li>17</li><li>18</li></ul></pre><p>但是我只需要查询指定的几个字段，然后转换成 JSON，返回给前台，咋办呢？</p><h4 id=\"第一种方法使用-model-查询时转化\">第一种方法：使用 model 查询时转化</h4><p>首先建立一个 model ，写上自己想要查询的字段，然后写上构造函数，这步很重要，因为spring jpa 转化时会调用这个构造方法</p><pre><code>public class MyModel implements Serializable {\r\n\r\n    private String userName;\r\n    private String name;\r\n    private String gender;\r\n    private String description;\r\n\r\n    public MyModel() {};\r\n\r\n    public MyModel(String userName, String name, String gender, String description) {\r\n        this.userName = userName;\r\n        this.name = name;\r\n        this.gender = gender;\r\n        this.description = description;\r\n    }\r\n}</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li><li>11</li><li>12</li><li>13</li><li>14</li><li>15</li><li>16</li></ul></pre><p>然后在 dao 类中写查询方法</p><pre><code>@Query(value = \"select new pers.zhuch.model.MyModel(u.userName, ui.name, ui.gender, ui.description) from UserInfo ui, User u where u.id = ui.userId\")\r\npublic List&lt;MyModel&gt; getAllRecord();</code><ul><li>1</li><li>2</li></ul></pre><p>直接在查询语句中 new model 框架底层会调用它，然后返回这个对象（这里我写了完整的类路径，不写的时候它报错说找不到类型什么的）</p><p>然后就可以获得只有指定字段的 model 了。然后就把它转成 JSON 格式就 O 了。</p><h4 id=\"第二种方法在service-里边转换成-json\">第二种方法：在service 里边转换成 JSON</h4><p>原理其实和第一种方法差不多，只是处理结果的方式不太一样，只是这种方法我们就不在 hql 中 new Model 了，直接写查询方法</p><pre><code>@Query(value = \"select new map(u.userName, ui.name, ui.gender, ui.description) from UserInfo ui, User u where u.id = ui.userId\")\r\npublic List&lt;Map&lt;String, Object&gt;&gt; getCustomField();</code><ul><li>1</li><li>2</li></ul></pre><p>直接new map（这里得是小写，不知道大写有木有问题，反正没试，编译器提示是要小写的）&nbsp;<br>然后返回的结果是这样的</p><pre><code>[\r\n    {\r\n        \"0\": \"admin\", \r\n        \"1\": \"你猜\", \r\n        \"2\": \"男\", \r\n        \"3\": \"一段描述\"\r\n    }, {\r\n        \"0\": \"abc\", \r\n        \"1\": \"你猜人家\", \r\n        \"2\": \"女\", \r\n        \"3\": \"没事先挂了\"\r\n    }\r\n]</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li><li>11</li><li>12</li><li>13</li></ul></pre><p>然后在 service 层里直接封装成 JSON 对象，返回</p><pre><code>List&lt;JsonObject&gt; list = new ArrayList();\r\nfor(Map map : result) {\r\n    JsonObject j = new JsonObject();\r\n    j.addProperty(attrName, val);\r\n    ...\r\n    list.add(j);\r\n}\r\ngson.toJson(list);</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li></ul></pre><p>还有一种返回结果，这样写：</p><pre><code>@Query(value = \"select u.userName, ui.name, ui.gender, ui.description from UserInfo ui, User u where u.id = ui.userId\")\r\npublic List&lt;Object&gt; getCustomField();</code><ul><li>1</li><li>2</li></ul></pre><p>返回结果是这样的格式：</p><pre><code>[\r\n    [\r\n        \"admin\", \r\n        \"你猜\", \r\n        \"男\", \r\n        \"一段描述\"\r\n    ], [\r\n        \"abc\", \r\n        \"你猜人家\", \r\n        \"女\", \r\n        \"没事先挂了\"\r\n    ]\r\n]</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li><li>11</li><li>12</li><li>13</li></ul></pre><p>返回的是数组，也一样可以通过上面的方法转成 json ，这里我的程序中出现了一点点 BUG，就是空值的字段不会在数组中，不知道为什么。</p><p>这种方法必须明确的知道查询了哪些字段，灵活性比较差，虽然它解决了手头的问题。还有就是版本的不同，有可能会出现丢失空字段的情况，我个人特别的不喜欢这样的方法，万一我实体几十个字段，写着写着忘了写到哪了，就 over 了</p><h4 id=\"第三种方法返回一个便于转换成-json-格式的-list\">第三种方法：返回一个便于转换成 json 格式的 list</h4><p>其实和上面很相似，都是 dao 层返回一个 List &lt; Map &lt; String, Object &gt;&gt;，但是上面的结果集返回的 Map 的 key 只是列的下标，这种方式稍微理想一点点，就是 Map 的 key 就是查询的列名。但是这种方式需要实现自定义 Repository( 这里不详细介绍，请自行百度 )，并且只是 jpa 集成 hibenate 的时候可以使用。</p><pre><code>public List getCustomEntity() {\r\n    String sql = \"select t.id, t.name, t.gender, t.is_delete, t.create_time, t.description from t_entity t\";\r\n    Query query = em.createNativeQuery(sql);\r\n    // Query 接口是 spring-data-jpa 的接口，而 SQLQuery 接口是 hibenate 的接口，这里的做法就是先转成 hibenate 的查询接口对象，然后设置结果转换器\r\n    query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);\r\n    return query.getResultList();\r\n}</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li></ul></pre><p>这种方法返回的就是比较标准的 JSON 格式的 java 对象了，只需要用 jackson 或者 Gson 转一下就是标准的 json 了</p><pre><code>[\r\n    {\r\n        attr: val,\r\n        ...\r\n    },\r\n    {\r\n        attr: val,\r\n        ...\r\n    },\r\n]</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li></ul></pre><p>这种方式其实已经比较理想了，因为直接就能返回到前台，但是有时候，结果不是一条 sql 能够解决的，得两条或者以上的 sql 来解决一个复杂的查询需求，这个过程中，结果比较需要转换成 pojo，以便于组装操作。</p><h4 id=\"第四种方案dao-中直接转成-pojo-返回\">第四种方案：dao 中直接转成 pojo 返回</h4><p>这个方案还是依赖于 hibenate，有点操蛋，但是更明确一些。</p><pre><code>public List getCustomEntity() {\r\n    String sql = \"select t.id, t.name, t.gender, t.is_delete as isEnable, t.create_time as createTime, t.description from t_entity t\";\r\n    Query query = em.createNativeQuery(sql);\r\n    query.unwrap(SQLQuery.class)\r\n    // 这里是设置字段的数据类型，有几点注意，首先这里的字段名要和目标实体的字段名相同，然后 sql 语句中的名称（别名）得与实体的相同\r\n            .addScalar(\"id\", StandardBasicTypes.LONG)\r\n            .addScalar(\"name\", StandardBasicTypes.STRING)\r\n            .addScalar(\"gender\", StandardBasicTypes.STRING)\r\n            .addScalar(\"isEnable\", StandardBasicTypes.BOOLEAN)\r\n            .addScalar(\"createTime\", StandardBasicTypes.STRING)\r\n            .addScalar(\"description\", StandardBasicTypes.STRING)\r\n            .setResultTransformer(Transformers.aliasToBean(EntityModel.class));\r\n    return query.getResultList();\r\n}</code><ul><li>1</li><li>2</li><li>3</li><li>4</li><li>5</li><li>6</li><li>7</li><li>8</li><li>9</li><li>10</li><li>11</li><li>12</li><li>13</li><li>14</li></ul></pre><p>这次返回的就是 List 了。这里要注意的是 StandardBasicTypes这个常量类，在一些旧版本中，是 Hibenate 类，具体哪个包我不知道，我这个版本中是换成了前面的那个常量类</p>');

DROP TABLE IF EXISTS `resume_list`;
CREATE TABLE `resume_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL COMMENT '学号',
  `menu_id` int(11) DEFAULT NULL COMMENT '简历的所属菜单',
  `title` varchar(100) DEFAULT NULL COMMENT '标题',
  `text` varchar(255) DEFAULT NULL COMMENT '简介',
  `img` varchar(30) DEFAULT NULL COMMENT '图片地址',
  `order_num` int(11) DEFAULT NULL COMMENT '预约人数',
  `open` tinyint(4) DEFAULT NULL COMMENT '是否已通过管理员审核',
  `limit_num` int(11) DEFAULT NULL COMMENT '限制人数',
  `data` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='简历清单';

-- ----------------------------
-- Records of resume_list
-- ----------------------------
INSERT INTO `resume_list` VALUES ('1', '16046114', '7', '中国书法博大精深', '书法，是中国及深受中国文化影响过的周边国家和地区特有的一种文字美的艺术表现形式。包括汉字书法、蒙古文书法、阿拉伯书法和英文书法等。其“中国书法”，是中国汉字特有的一种传统艺术。从广义讲，书法是指文字符号的书写法则。换言之，书法是指按照文字特点及其含义，以其书体笔法、结构和章法书写，使之成为富有美感的艺术作品。汉字书法为汉族独创的表现艺术，被誉为：无言的诗，无行的舞；无图的画，无声的乐等。', '/img/4.png', '12', '1', '100', '2020-02-14');
INSERT INTO `resume_list` VALUES ('2', '16046119', '9', '中医历史渊源', '中医（Traditional Chinese Medicine），一般指以中国汉族劳动人民创造的传统医学为主的医学，所以也称汉医。是研究人体生理、病理以及疾病的诊断和防治等的一门学科。中医诞生于原始社会，春秋战国时期中医理论已基本形成，之后历代均有总结发展。除此之外对汉字文化圈国家影响深远，如日本汉方医学，韩国韩医学，朝鲜高丽医学、越南东医学等都是以中医为基础发展起来的。', '/img/3.png', '22', '1', '100', '2020-02-13');


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for resume_menu
-- ----------------------------
DROP TABLE IF EXISTS `resume_menu`;
CREATE TABLE `resume_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL COMMENT '菜单名称',
  `pid` int(11) DEFAULT NULL COMMENT '父目录',
  `open` tinyint(4) DEFAULT NULL COMMENT '菜单是否开放，1开放0关闭',
  `title` int(11) DEFAULT NULL COMMENT '标题与选项区分，0代表为标题，其它数字代表选项，值为该选项的标题id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COMMENT='简历菜单表';

-- ----------------------------
-- Records of resume_menu
-- ----------------------------
INSERT INTO `resume_menu` VALUES ('1', '0', '0', '0', '0');
INSERT INTO `resume_menu` VALUES ('2', '形式政策', '0', '1', '0');
INSERT INTO `resume_menu` VALUES ('3', '传统文化', '2', '1', '0');
INSERT INTO `resume_menu` VALUES ('4', '政治理论', '1', '1', '2');
INSERT INTO `resume_menu` VALUES ('5', '国家政策', '2', '1', '2');
INSERT INTO `resume_menu` VALUES ('6', '国学', '1', '1', '3');
INSERT INTO `resume_menu` VALUES ('7', '书法', '2', '1', '3');
INSERT INTO `resume_menu` VALUES ('8', '美感培养', '3', '1', '0');
INSERT INTO `resume_menu` VALUES ('9', '中医', '3', '1', '3');
INSERT INTO `resume_menu` VALUES ('10', '美容', '1', '1', '8');
INSERT INTO `resume_menu` VALUES ('11', '礼仪', '2', '1', '8');
INSERT INTO `resume_menu` VALUES ('12', '茶艺', '3', '1', '8');
