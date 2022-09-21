package com.example.test3;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;

public class RegisterRequest extends StringRequest{
    final static private String URL = "http://minid0329.ivyro.net/public_html/register.php";
    private HashMap<String,String> map;

    public RegisterRequest(String userID, String userPW, String userName, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPW", userPW);
        map.put("userName", userName);

    }
    @Override
    protected HashMap<String, String> getParams() throws AuthFailureError {
        return map;
    }

    public RegisterRequest(String url, Response.Listener<String> listener, @Nullable Response.ErrorListener errorListener) {
        super(url, listener, errorListener);
    }
}
