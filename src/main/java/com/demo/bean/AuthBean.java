package com.demo.bean;

public class AuthBean {
		
		public AuthBean(){}
		
		private String sCode;
		private String mId;
		private String mPw;
		
		public String getsCode() {
			return sCode;
		}
		public void setsCode(String sCode) {
			this.sCode = sCode;
		}

		public String getmId() {
			return mId;
		}

		public void setmId(String mId) {
			this.mId = mId;
		}

		public String getmPw() {
			return mPw;
		}

		public void setmPw(String mPw) {
			this.mPw = mPw;
		}

}
