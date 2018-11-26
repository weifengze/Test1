package shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.mgt.SecurityManager;

public class shiroTest {

	public static void main(String[] args) {
		// 获取securityManger工厂，此处使用ini配置文件初始化securitymager
		IniSecurityManagerFactory factory = new IniSecurityManagerFactory("classpath:shiro.ini");
		// 创建安全管理器
		SecurityManager securityManager = factory.createInstance();
		// 将安全管理器配置到当前环境中
		SecurityUtils.setSecurityManager(securityManager);
		// 获取当前的subject
		Subject subject = SecurityUtils.getSubject();
		// 设置令牌
		UsernamePasswordToken token = new UsernamePasswordToken("lisi", "123");
		// 执行校验
		subject.login(token);
		// 是否认证通过
		boolean b = subject.isAuthenticated();
		if (b) {
			System.out.println("认证通过");
		} else {
			System.out.println("认证失败");
		}
	}

}
