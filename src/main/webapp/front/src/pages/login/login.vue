<template>
<div>
	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20220913/4d4b75b14ce1475ba144ea8af6b1c05f.png)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"flex-end"}'>
		<el-form ref="loginForm" :model="loginForm" :style='{"padding":"40px 20px 20px","boxShadow":"0 0px 0px rgba(64, 158, 255, .8)","margin":"0","borderColor":"#4733B8","flexDirection":"column","display":"flex","justifyContent":"center","borderRadius":"50px 0 0 50px","background":"#F5F5FF","borderWidth":"0 0 0 10px","width":"500px","borderStyle":"solid","height":"100vh"}' :rules="rules">
			<div v-if="false" :style='{"margin":"0 0 10px 0","color":"rgba(64, 158, 255, 1)","textAlign":"center","width":"100%","lineHeight":"44px","fontSize":"20px","textShadow":"4px 4px 2px rgba(64, 158, 255, .5)"}'>USER / LOGIN</div>
			<div v-if="true" :style='{"width":"100%","margin":"0 0 10px 0","lineHeight":"44px","fontSize":"20px","color":"#4733B8","textAlign":"center"}'>中国篮球人才管理系统登录</div>
			<el-form-item class="list-item" :style='{"width":"70%","margin":"0 auto 20px"}' prop="username">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>账号：</div>
				<input :style='{"border":"0px solid rgba(64, 158, 255, 1)","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","color":"#000","borderRadius":"8px","background":"#D8D8D8","width":"100%","fontSize":"14px","height":"44px"}' v-model="loginForm.username" placeholder="请输入账户">
			</el-form-item>
			<el-form-item class="list-item" :style='{"width":"70%","margin":"0 auto 20px"}' prop="password">
				<div v-if="false" :style='{"width":"64px","lineHeight":"44px","fontSize":"14px","color":"rgba(64, 158, 255, 1)"}'>密码：</div>
				<input :style='{"border":"0px solid rgba(64, 158, 255, 1)","padding":"0 10px","boxShadow":"0 0 0px rgba(64, 158, 255, .5)","color":"#000","borderRadius":"8px","background":"#D8D8D8","width":"100%","fontSize":"14px","height":"44px"}' v-model="loginForm.password" placeholder="请输入密码" type="password">
			</el-form-item>
			<el-form-item class="list-code" v-if="true" :style='{"width":"70%","margin":"0px auto 20px"}'>
				<div v-if="true" :style='{"width":"0","verticalAlign":"middle","lineHeight":"44px","fontSize":"0","color":"rgba(64, 158, 255, 1)","display":"inline-block"}'>验证码：</div>
				<input :style='{"border":"0px solid rgba(64, 158, 255, 1)","padding":"0 10px","verticalAlign":"middle","outline":"none","color":"#000","borderRadius":"8px 0 0 8px","background":"#D8D8D8","display":"inline-block","width":"calc(100% - 80px)","fontSize":"14px","height":"44px"}' v-model="loginForm.code" placeholder="请输入验证码" id="code" type="text">
				<div :style='{"cursor":"pointer","verticalAlign":"middle","borderColor":"rgba(64, 158, 255, 1)","borderRadius":"0 8px 8px 0","textAlign":"center","borderWidth":"0","background":"#f5f5f5","display":"inline-block","width":"80px","borderStyle":"solid","height":"44px"}' class="nums" id="nums" @click="randomString()">
					<span :style="{color:item.color,transform:item.rotate,fontSize:item.size,padding: '0 3px',display:'inline-block'}" v-for="(item, index) in codes" :key="index">{{ item.num }}</span>
				</div>
			</el-form-item>
			<el-form-item v-if="roles.length>1" class="list-type" :style='{"width":"80%","margin":"20px auto"}' prop="role">
				<el-radio v-model="loginForm.tableName" :label="item.tableName" v-for="(item, index) in roles" :key="index" @change.native="getCurrentRow(item)">{{item.roleName}}</el-radio>
			</el-form-item>
			<el-form-item :style='{"width":"90%","margin":"20px auto","alignItems":"center","flexDirection":"column","display":"flex"}'>
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 5px 10px","outline":"none","color":"#fff","borderRadius":"35px","background":"#4733B8","display":"block","width":"100%","fontSize":"18px","height":"60px"}' @click="submitForm('loginForm')">登录</el-button>
				<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0 auto","outline":"none","color":"#fff","borderRadius":"35px","background":"#4733B8","display":"block","width":"50%","fontSize":"18px","height":"50px"}' @click="resetForm('loginForm')">重置</el-button>
			</el-form-item>
			<div :style='{"width":"80%","margin":"20px auto","flexWrap":"wrap","display":"flex"}'>
			<router-link :style='{"cursor":"pointer","border":"1px solid #fff","padding":"6px 0","margin":"0 0 4px","color":"#000","textAlign":"center","background":"#EFECEC","borderWidth":"0 1px 0 0","width":"calc(50% - 2px)","fontSize":"14px","textDecoration":"none"}' :to="{path: '/register', query: {role: item.tableName,pageFlag:'register'}}" v-if="item.hasFrontRegister=='是'" v-for="(item, index) in roles" :key="index">注册{{item.roleName.replace('注册','')}}</router-link>
			</div>
		</el-form>
    </div>
</div>
</template>

<script>


export default {
	//数据集合
	data() {
		return {
			roleMenus: [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除","查看评论"],"menu":"球员","menuJump":"列表","tableName":"qiuyuan"}],"menu":"球员管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["新增","查看","修改","删除"],"menu":"赛程信息","menuJump":"列表","tableName":"saichengxinxi"}],"menu":"赛程信息管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除","查看评论"],"menu":"国家队","menuJump":"列表","tableName":"guojiadui"}],"menu":"国家队管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论"],"menu":"新闻资讯","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除"],"menu":"新闻分类","menuJump":"列表","tableName":"xinwenfenlei"}],"menu":"新闻分类管理"},{"child":[{"appFrontIcon":"cuIcon-message","buttons":["查看","修改","回复","删除"],"menu":"在线留言","tableName":"messages"}],"menu":"在线留言"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"球员列表","menuJump":"列表","tableName":"qiuyuan"}],"menu":"球员模块"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看"],"menu":"赛程信息列表","menuJump":"列表","tableName":"saichengxinxi"}],"menu":"赛程信息模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"国家队列表","menuJump":"列表","tableName":"guojiadui"}],"menu":"国家队模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看"],"menu":"球员列表","menuJump":"列表","tableName":"qiuyuan"}],"menu":"球员模块"},{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["查看"],"menu":"赛程信息列表","menuJump":"列表","tableName":"saichengxinxi"}],"menu":"赛程信息模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"国家队列表","menuJump":"列表","tableName":"guojiadui"}],"menu":"国家队模块"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["查看"],"menu":"新闻资讯列表","menuJump":"列表","tableName":"xinwenzixun"}],"menu":"新闻资讯模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}],
			loginForm: {
				username: '',
				password: '',
				tableName: '',
				code: '',
			},
			role: '',
            roles: [],
			rules: {
				username: [
					{ required: true, message: '请输入账户', trigger: 'blur' }
				],
				password: [
					{ required: true, message: '请输入密码', trigger: 'blur' }
				]
			},
			codes: [{
				num: 1,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 2,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 3,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}, {
				num: 4,
				color: '#000',
				rotate: '10deg',
				size: '16px'
			}]
		}
	},
	created() {
        for(let item in this.roleMenus) {
            if(this.roleMenus[item].hasFrontLogin=='是') {
                this.roles.push(this.roleMenus[item]);
            }
        }
		this.randomString();
	},
	mounted() {
	},
    //方法集合
    methods: {
		randomString() {
			var len = 4;
			var chars = [
			  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			  'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
			  'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G',
			  'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
			  'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2',
			  '3', '4', '5', '6', '7', '8', '9'
			]
			var colors = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
			var sizes = ['14', '15', '16', '17', '18']
			
			var output = []
			for (var i = 0; i < len; i++) {
			  // 随机验证码
			  var key = Math.floor(Math.random() * chars.length)
			  this.codes[i].num = chars[key]
			  // 随机验证码颜色
			  var code = '#'
			  for (var j = 0; j < 6; j++) {
			    var key = Math.floor(Math.random() * colors.length)
			    code += colors[key]
			  }
			  this.codes[i].color = code
			  // 随机验证码方向
			  var rotate = Math.floor(Math.random() * 45)
			  var plus = Math.floor(Math.random() * 2)
			  if (plus == 1) rotate = '-' + rotate
			  this.codes[i].rotate = 'rotate(' + rotate + 'deg)'
			  // 随机验证码字体大小
			  var size = Math.floor(Math.random() * sizes.length)
			  this.codes[i].size = sizes[size] + 'px'
			}
		},
      getCurrentRow(row) {
        this.role = row.roleName;
      },
      submitForm(formName) {
        if (this.roles.length!=1) {
            if (!this.role) {
                this.$message.error("请选择登录用户类型");
                return false;
            }
        } else {
            this.role = this.roles[0].roleName;
            this.loginForm.tableName = this.roles[0].tableName;
        }
        let code = ''
        for(let i in this.codes) {
            code += this.codes[i].num
        }
        if (!this.loginForm.code) {
            this.$message.error("请输入验证码");
            return;
        }
        if (this.loginForm.code.toLowerCase() != code.toLowerCase()) {
            this.$message.error("验证码输入有误");
            return;
        }
        this.$refs[formName].validate((valid) => {
          if (valid) {
            this.$http.get(`${this.loginForm.tableName}/login`, {params: this.loginForm}).then(res => {
              if (res.data.code === 0) {
                localStorage.setItem('Token', res.data.token);
                localStorage.setItem('UserTableName', this.loginForm.tableName);
                localStorage.setItem('username', this.loginForm.username);
                localStorage.setItem('adminName', this.loginForm.username);
                localStorage.setItem('sessionTable', this.loginForm.tableName);
                localStorage.setItem('role', this.role);
                localStorage.setItem('keyPath', this.$config.indexNav.length+2);
                this.$router.push('/index/center');
                this.$message({
                  message: '登录成功',
                  type: 'success',
                  duration: 1500,
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20220913/4d4b75b14ce1475ba144ea8af6b1c05f.png);
		
		.el-form-item {
		  & /deep/ .el-form-item__content {
		    width: 100%;
		  }
		}
		
		.list-item /deep/ .el-input .el-input__inner {
			border: 0px solid rgba(64, 158, 255, 1);
			border-radius: 8px;
			padding: 0 10px;
			box-shadow: 0 0 0px rgba(64, 158, 255, .5);
			color: #000;
			background: #D8D8D8;
			width: 100%;
			font-size: 14px;
			height: 44px;
		}
		
		.list-code /deep/ .el-input .el-input__inner {
			border: 0px solid rgba(64, 158, 255, 1);
			border-radius: 8px 0 0 8px;
			padding: 0 10px;
			outline: none;
			color: #000;
			background: #D8D8D8;
			display: inline-block;
			vertical-align: middle;
			width: calc(100% - 80px);
			font-size: 14px;
			height: 44px;
		}
		
		.list-type /deep/ .el-radio__input .el-radio__inner {
			background: rgba(53, 53, 53, 0);
			border-color: #666666;
		}
		.list-type /deep/ .el-radio__input.is-checked .el-radio__inner {
			background: #4733B8;
			border-color: #4733B8;
		}
		.list-type /deep/ .el-radio__label {
			color: #666666;
			font-size: 14px;
		}
		.list-type /deep/ .el-radio__input.is-checked+.el-radio__label {
			color: #4733B8;
			font-size: 14px;
		}
	}
</style>
