package com.example.mvc.Entity;


public class Language {
	int lId;
	String[] langName;

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String[] getLangName() {
		return langName;
	}

	public void setLangName(String[] langName) {
		this.langName = langName;
	}

	public Language(int lId, String[] langName) {
		super();
		this.lId = lId;
		this.langName = langName;
	}

	@Override
	public String toString() {
		return "Language [lId=" + lId + ", langName=" + langName + "]";
	}

}