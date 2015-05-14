package com.example.coba;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;




import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
	public static HttpClient client = new DefaultHttpClient();
	String[] nama;
	String[] subnama;
	String[] gambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        /*
        // get data
        String url = "http://192.168.100.7/belajarphp/android/get.php";
		List<NameValuePair> myPair = new ArrayList<NameValuePair>();
	
		Bridge move = new Bridge(false);
		move.setMyPair(myPair);
		try {
			move.setResponse(move.execute(url).get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			move.setData(move.getResponse());
			nama = new String[move.getData().length()];
			subnama = new String[move.getData().length()];
			gambar = new String[move.getData().length()];
		
			for (int i = 0; i < move.getData().length(); i++) {
				JSONObject myData;
				try {
					myData = move.getData().getJSONObject(i);
					nama[i] = myData.getString("nama");
					subnama[i] = myData.getString("subnama");
					gambar[i] = myData.getString("gambar");
					Toast.makeText(getBaseContext(),nama[i]+"  "+subnama[i],
							Toast.LENGTH_LONG).show();
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
       */
			
       // sent

			 String url = "http://192.168.100.7/belajarphp/android/set.php";

				List<NameValuePair> myPair = new ArrayList<NameValuePair>();
				myPair.add(new BasicNameValuePair("nama","ee2"));
				myPair.add(new BasicNameValuePair("subnama","ee2"));
				myPair.add(new BasicNameValuePair("gambar","ee2"));
				
				
				
				
				Bridge move = new Bridge(false);
				
				move.setMyPair(myPair);
				try {
					move.setResponse(move.execute(url).get());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Toast.makeText(getBaseContext(),
						""+move.getResponse(), Toast.LENGTH_LONG)
						.show();
					
        
				
        
    	     

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
