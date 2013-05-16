package com.drikvy.xmppclient;

import android.app.Application;
import android.graphics.Bitmap;

public class ClientApplication extends Application {

	private String userFacebookId;
	private String userFacebookName;
	private Bitmap userFacebookPict;
	//private String userFacebookPictLink;
	//private String userImageUrl;
	
	public String getUserFacebookId() {
		return userFacebookId;
	}
	
	public void setUserFacebookId(String facebookId) {
		this.userFacebookId = facebookId;
	}
	
	public String getUserFacebookName() {
		return userFacebookName;
	}
	
	public void setUserFacebookName(String facebookName) {
		this.userFacebookName = facebookName;
	}

	public Bitmap getUserFacebookPict() {
		return userFacebookPict;
	}

	public void setUserFacebookPict(Bitmap userFacebookPict) {
		this.userFacebookPict = userFacebookPict;
	}
/*
	public String getUserFacebookPictLink() {
		return userFacebookPictLink;
	}

	public void setUserFacebookPictLink(String userFacebookPictLink) {
		this.userFacebookPictLink = userFacebookPictLink;
	}

	public String getUserImageUrl() {
		return userImageUrl;
	}

	public void setUserImageUrl(String userImageUrl) {
		this.userImageUrl = userImageUrl;
	}
*/
}
