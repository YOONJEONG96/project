package com.demo.util;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class AjaxCall {

	@SuppressWarnings("unused")
	private JSONArray jsonParam;
	private JSONObject json;

	@SuppressWarnings("unchecked")
	public JSONArray getJsonParam() {
	System.out.println("durl");
		
		String Id = "";
		String name = "";
	    String access = "";
	    String email = "";
	    String accesstime = "";
	    String state = "";
	    jsonParam = new JSONArray();
	    for(int i=0; i<2; i++) {
	        if(i==0) {
	        	Id = "Root";
	    		name = "루트";
	    	    access = "최고관리자";
	    	    email = "root@naver.com";
	    	    accesstime = "2021-05-10 17:33:00";
	    	    state = "on";
	        }else {
	        	Id = "Pie";
	    		name = "파이";
	    	    access = "최고관리자";
	    	    email = "pie@naver.com";
	    	    accesstime = "2021-05-10 17:33:00";
	    	    state = "on";
	        }
	        json = new JSONObject();
			json.put("mId",Id);
			json.put("mName", name);
			json.put("access", access);
			json.put("email", email);
			json.put("접속시간", accesstime);
			json.put("접속상태", state);
			
			jsonParam.put(json);   
	    }
	    
	    ArrayList<JSONObject> arrayJson = new ArrayList<JSONObject>();
	    
	    for (int k = 0; k < jsonParam.length(); k++) {
	        JSONObject tempJson = jsonParam.getJSONObject(k);
	        arrayJson.add(tempJson);
	    }
	    
	    JSONObject[] jsons = new JSONObject[arrayJson.size()];
	    arrayJson.toArray(jsons);
	    
	    System.out.println(jsons);
	    
		return jsonParam;
	}

	public void setJsonParam(JSONArray jsonParam) {
		this.jsonParam = jsonParam;
	}

	
}
