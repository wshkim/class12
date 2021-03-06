package com.hanbit.app.week161105.movie;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by 1027 on 2016-11-26.
 */

public class MovieDAO extends SQLiteOpenHelper {
    public MovieDAO(Context context) {
        super(context, "", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) { }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) { }
    public void add(MovieDTO param){
        String sql = "INSERT INTO table() VALUES();";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
    }
    public int count(){
        String sql = "SELECT COUNT(*) FROM table;";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        return 0;
    }
    public MovieDTO findOne(String key){
        String sql = "SELECT * FROM table WHERE column = 'key';";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        return null;}
    public ArrayList<MovieDTO> findBy(MovieDTO param){
        String sql = "SELECT * FROM table WHERE column = 'search word';";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        return null;}
    public ArrayList<MovieDTO> list(){
        String sql = "SELECT * FROM table;";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        return null;}
    public void update(MovieDTO param){
        String sql = "UPDATE table SET column1 = 'value',column2 = 'value'WHERE column = 'key';";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
    }
    public void delete(String key){
        String sql = "DELETE FROM table WHERE column = 'key';";
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(sql);
    }
}
