package com.ingeniousafrica.supperparckvoiture.test;


import com.ingeniousafrica.supperparckvoiture.activities.ClientActivity;

import android.test.ActivityInstrumentationTestCase2;

import android.widget.TextView;

@SuppressWarnings("rawtypes")
public class SupperTest extends ActivityInstrumentationTestCase2 {
	
	
	
	@SuppressWarnings("unchecked")
	public SupperTest() {
		super("com.ingeniousafrica.supperparckvoiture.activities", ClientActivity.class);
	}

	ClientActivity mActivity;
    TextView mView;
    String resourceString;


	@Override
	protected void setUp() throws Exception {
		
		super.setUp();
		
		mActivity = (ClientActivity) this.getActivity();
	    mView = (TextView) mActivity.findViewById(com.ingeniousafrica.supperparckvoiture.R.id.activity_client_title_id);
	    resourceString = mActivity.getString(com.ingeniousafrica.supperparckvoiture.R.string.activity_client_title);
	}
	
	//tester si l'objet n'est pas null
	public void testPreConditions() {
	      assertNotNull(mView);
	}
	
	//tester pour voir si text de notre vue correspond exactement à ce qui est affiché
	public void testText() {
	      assertEquals(resourceString,(String)mView.getText().toString());
	}
	
	

}
