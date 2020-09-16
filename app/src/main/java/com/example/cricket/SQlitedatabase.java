package com.example.cricket;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SQlitedatabase extends SQLiteOpenHelper {

    private static final  String DATABASE_NAME= "User.db";
    private static final String TABLE_NAME= "User_details";
    private static final String ID = "_id";
    private static final String NAME = "Name";
    private static final String EMAIL = "Email";
    private static final String PASSWORD = "Password";
    private static final int VERSION_NUMBER= 1;
    private static final String CREATE_TABLE ="CREATE TABLE "+TABLE_NAME+"("+ID+" PRIMARY KEY AUTOINCREMENT,"+NAME+" VARCHAR(100),"+EMAIL+" VARCHAR(100),"+PASSWORD+" VARCHAR(50)); ";
    private static final String DROP_TABLE= "DROP TABLE IF EXISTS "+TABLE_NAME;
    private Context context;
    public SQlitedatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
       this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

try {
    sqLiteDatabase.execSQL(CREATE_TABLE);
    Toast.makeText(context, "Oncreate is called",Toast.LENGTH_LONG);
} catch (SQLException e) {
    Toast.makeText(context, "Exception :"+e,Toast.LENGTH_LONG);
}
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
      try{
          Toast.makeText(context, "Oncreate is called",Toast.LENGTH_LONG);
          sqLiteDatabase.execSQL(DROP_TABLE);
          onCreate(sqLiteDatabase);
      }catch(Exception e){
          Toast.makeText(context, "Exception :"+e,Toast.LENGTH_LONG);
      }
    }

     public long insertData(String name, String email, String password ){

       SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
         ContentValues contentValues= new ContentValues();
         contentValues.put(NAME,name);
         contentValues.put(EMAIL,email);
         contentValues.put(PASSWORD,password);
         long rowid=  sqLiteDatabase.insert(TABLE_NAME,null,contentValues);
         return rowid;
    }
    }

