package com.heleno.helenosapp.utils;

import android.support.v7.app.ActionBarActivity;


public abstract class BaseActivity extends ActionBarActivity{

	public abstract void recuperarID();	
	public abstract void formatarFonte();
	
	public void configurarActivity(){
		recuperarID();
		formatarFonte();
	}
	
	public void esconderActionBar(){
		getSupportActionBar().hide();
	}
	
	public void tituloActionBar(String title){
		getSupportActionBar().setTitle(title);
	}
	
}
