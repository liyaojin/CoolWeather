package com.coolweather.app.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeacherOpenhelper extends SQLiteOpenHelper {

	/**
	 * Province 省 建表语句
	 */
	public static final String CREATE_PROVINCE = "create table province ("
			+ "id integer primary key autoincrement," + "province_name text,"
			+ "province_code text)";
	/**
	 * City 市 建表语句
	 */
	public static final String CREATE_CITY = "create table city ("
			+ "id integer primary key autoincrement," + "city_name text,"
			+ "city_code text," + "province_id integer)";
	/**
	 * County 区 建表语句
	 */
	public static final String CREATE_COUNTY = "create table county("
			+ "id integer primary key autoincrement," + "county_name text,"
			+ "county_code text," + "city_id integer)";

	public CoolWeacherOpenhelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version);

	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_PROVINCE);//创建province表
		db.execSQL(CREATE_CITY);
		db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
