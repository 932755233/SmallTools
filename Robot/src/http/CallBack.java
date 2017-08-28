package http;

public interface CallBack {

    void doSucceed(String result);
    void doFailure(String message);
}
