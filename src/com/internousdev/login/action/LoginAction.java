/**
 *
 */
package com.internousdev.login.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.dto.LoginDTO;
import com.internousdev.login.dao.LoginDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
//継承と思われるがよくわからない。セッションもよくわからない。
public class LoginAction extends ActionSupport implements SessionAware{

	//パッケージ内のみ干渉可能な文字型変数usernameとpasswordを定義。Mapはわからない。
	private String username;
	private String password;
	private Map<String,Object> session;

	//javaのメインメソッドと同じくここから始まる文字型変数retにERRORを代入。インスタンス化はいまいちわからない。daoにdtoを代入？
	public String execute(){
		String ret=ERROR;
		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();
		dto=dao.select(username,password);
//usernameがdtoのUsernameと等しく、passwordがdtoのPasswordと等しいなら
		if(username.equals(dto.getUsername())){
			if(password.equals(dto.getPassword())){
//セッションがわからず、retにSUCCESを代入する
				session.put("username","taro");
				System.out.println((String)session.get("username"));
				session.put("password","123");
				System.out.println((String)session.get("password"));
				session.put("phone","5566");
				System.out.println((String)session.get("phone"));
				ret=SUCCESS;
			}
		}//retを返す？セッターゲッターどこで動く？
		return ret;


	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
