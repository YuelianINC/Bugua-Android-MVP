package com.bugua.mvp.lib;

/**
 * Created by woookliu on 4/19/16.
 * View interface in MVP
 */
public interface IBuguaView<T extends IBuguaPresenter> {

    void setPresenter(T presenter);
}
