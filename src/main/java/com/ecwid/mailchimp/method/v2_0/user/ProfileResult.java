package com.ecwid.mailchimp.method.v2_0.user;

import com.ecwid.mailchimp.MailChimpObject;

public class ProfileResult extends MailChimpObject {
	private static final long serialVersionUID = 937240946906491441L;

	@Field
	public Integer id;

	@Field
	public String username;
	
	@Field
	public String name;

	@Field
	public String email;

	@Field
	public String role;

	@Field
	public String avatar;

	@Field
	public Integer global_user_id;

	@Field
	public String dc_unique_id;

	@Field
	public String account_name;
}