package com.ecwid.mailchimp.method.v2_0.user;

import com.ecwid.mailchimp.MailChimpAPIVersion;
import com.ecwid.mailchimp.MailChimpMethod;

/**
 * Retrieve the profile for the login owning the provided API Key
 */
@MailChimpMethod.Method(name = "users/profile", version = MailChimpAPIVersion.v2_0)
public class ProfileMethod extends MailChimpMethod<ProfileResult> {
	private static final long serialVersionUID = 7151170736092326214L;
}