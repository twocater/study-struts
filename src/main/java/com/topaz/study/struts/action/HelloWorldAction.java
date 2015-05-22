/*
 * To change this license header, choose License Headers i
n Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.topaz.study.struts.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author cpaladin
 */
public class HelloWorldAction extends ActionSupport {

    private User user;

    
    public User getUser() {
		return user;
	}
    
    public void setUser(User user) {
		this.user = user;
	}
    
    @Override
    public String execute() throws Exception {
        System.out.println(user.getAccount() + user.getPassword() + user.getSubmitFlag());
        return "toWelcome";
    }
    
    @Override
    public void validate() {
    	if (user.getAccount() == null || user.getAccount().trim().isEmpty()) {
    		this.addFieldError("account", this.getText("accountError"));
    		System.out.println("valicate fail.");
    	}
    }

   
    
    public static void main(String[] args) {
		HelloWorldAction action = new HelloWorldAction();
		action.setUser(new User());
		try {
			action.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
