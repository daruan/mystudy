-- ----------------------------
-- 创建部门表
-- ----------------------------
DROP TABLE IF EXISTS t_user;
DROP TABLE IF EXISTS t_salary_detail;
DROP TABLE IF EXISTS t_employee;
DROP TABLE IF EXISTS t_department;
CREATE TABLE t_department(
	id varchar(32) NOT NULL PRIMARY KEY comment '部门ID',
  name varchar(32) DEFAULT NULL comment '部门名字',
  depno varchar(32) DEFAULT NULL comment '部门编号',
  createtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP comment '记录更新时间',
  build_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP comment '部门成立时间',
  pid varchar(32) DEFAULT NULL comment '上级部门ID'
);

-- ----------------------------
-- 创建员工表
-- ----------------------------
CREATE TABLE t_employee (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '员工ID',
  chinese_name varchar(32) DEFAULT NULL COMMENT '中文名',
  english_name varchar(32) DEFAULT NULL COMMENT '英文名',
  joined_date timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入职日期',
  salary decimal(18,2) DEFAULT '0.00' COMMENT '工资',
  position_level int DEFAULT '1' COMMENT '职位级别',
  department_id varchar(32) DEFAULT NULL COMMENT '所属部门',
  deltag char(1) DEFAULT NULL COMMENT '离职标签 0:未离职 1:离职',
  leave_date timestamp COMMENT '离职日期',
  KEY FK_emp_department (department_id),
  CONSTRAINT FK_emp_department FOREIGN KEY (department_id) REFERENCES t_department (id)
);


-- ----------------------------
-- 创建用户表
-- ----------------------------
CREATE TABLE t_user (
  id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username varchar(20) NOT NULL,
  password varchar(255) NOT NULL,
  emp_id int DEFAULT NULL,
  KEY FK_user_emp(emp_id),
  CONSTRAINT FK_user_emp FOREIGN KEY (emp_id) REFERENCES t_employee (id)
);



-- ----------------------------
-- 创建员工工资明细
-- ----------------------------
CREATE TABLE t_salary_detail (
  id varchar(32) NOT NULL PRIMARY KEY COMMENT '工资id',
  total_salary decimal(10,0) DEFAULT NULL COMMENT '总工资',
  social_salary decimal(10,0) DEFAULT NULL COMMENT '社保',
  house_salary decimal(10,0) DEFAULT NULL COMMENT '公积金',
  tax decimal(10,0) DEFAULT NULL COMMENT '税',
  basic_salary decimal(10,0) DEFAULT NULL COMMENT '基本工资',
  reward_money decimal(10,0) DEFAULT NULL COMMENT '奖金',
  punish_money decimal(10,0) DEFAULT NULL COMMENT '罚金',
  help_money decimal(10,0) DEFAULT NULL COMMENT '补贴',
  actual_money decimal(10,0) DEFAULT NULL COMMENT '实发工资',
  emp_id int NOT NULL COMMENT '员工ID',
  salary_date timestamp NOT NULL COMMENT '发工资日期',
  KEY FK_salary_emp (emp_id),
  CONSTRAINT FK_salary_emp FOREIGN KEY (emp_id) REFERENCES t_employee (id)
);


-- ----------------------------
-- 创建学生表
-- ----------------------------
DROP TABLE IF EXISTS t_student;
CREATE TABLE t_student(
  id varchar(32) NOT NULL PRIMARY KEY,
  chinese_name varchar(20) DEFAULT NULL,
  english_name varchar(20) DEFAULT NULL,
  id_number varchar(50) DEFAULT NULL COMMENT '身份证号',
  gender char(2) DEFAULT NULL COMMENT '性别',
  phone varchar(11) DEFAULT NULL COMMENT '手机号',
  address varchar(255) DEFAULT NULL COMMENT '身份证地址',
  registered_address varchar(255) DEFAULT NULL COMMENT '现住地址',
  second_contact_name varchar(20) DEFAULT NULL COMMENT '第二联系人名字',
  second_contact_phone varchar(11) DEFAULT NULL COMMENT '第二联系人电话',
  degree varchar(10) DEFAULT NULL COMMENT '学历',
  username varchar(20) DEFAULT NULL COMMENT '学生系统登录用户名',
  password varchar(255) DEFAULT NULL COMMENT '学生系统登录密码'
);

-- ----------------------------
-- 创建开班课程表
-- ----------------------------
DROP TABLE IF EXISTS t_course;
CREATE TABLE t_course (
  id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
  course_name varchar(32) DEFAULT NULL,
  course_time varchar(32) DEFAULT NULL,
  course_price decimal(10,0) DEFAULT NULL COMMENT '课程价格',
  course_address varchar(255) DEFAULT NULL COMMENT '上课地址',
  teacher_name varchar(32) DEFAULT NULL,
  expected_startdate timestamp NOT NULL COMMENT '开班日期',
  expected_enddate timestamp NOT NULL COMMENT '结束日期'
);


-- ----------------------------
-- 创建推荐人客户表
-- ----------------------------


-- ----------------------------
-- 创建学生报名课程表
-- ----------------------------


-- ----------------------------
-- 创建佣金结算表课程表
-- ----------------------------


-- ----------------------------
-- 创建课程视频教程表
-- ----------------------------


-- ----------------------------
-- 创建定单表
-- ----------------------------