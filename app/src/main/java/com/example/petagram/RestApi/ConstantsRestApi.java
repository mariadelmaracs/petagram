package com.example.petagram.RestApi;

public final class ConstantsRestApi {

    public static final String VERSION = "/v8.0/";
    public static final String ROOT_URL = "https://graph.facebook.com" + VERSION;
    public static final String ACCESS_TOKEN = "EAAFduHpqnq4BAGxYFk3AbgKbWu6vFMwLT9OSJBL1qeUwFA5DTY8dPflj1q7DAQya6ve8W8zxdNgbgQAmknWnthZCShgpRn5bRaYNQFrgBjcTNYLPZC0gsjvqQjN9kI5qI1auXK8BratKjMZAouR0f1vPZB96Jp0Fu3bdxDnvZAgZDZD";
    public static final String KEY_ACCESS_TOKEN = "&access_token=";
    public static final String USER_ID = "17841441832864867";
    public static final String KEY_USER_MEDIA = "/media?fields=id,caption,media_type,media_url,owner,username,like_count";
    public static final String URL_USER_MEDIA = USER_ID + KEY_USER_MEDIA + KEY_ACCESS_TOKEN + ACCESS_TOKEN;
}
