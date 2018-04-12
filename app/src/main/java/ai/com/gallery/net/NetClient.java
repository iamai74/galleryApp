package ai.com.gallery.net;

import android.content.Context;

import ai.com.gallery.R;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetClient {
    private Retrofit retrofit;

    public NetClient(Context context) {
        retrofit = new Retrofit.Builder()
                .baseUrl(context.getResources().getString(R.string.base_api_url))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getNetClient() {
        return retrofit;
    }
}
