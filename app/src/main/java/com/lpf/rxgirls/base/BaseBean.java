package com.lpf.rxgirls.base;

/**
 * Created by Administrator on 2016/4/6.
 */
public class BaseBean<T> {


    /**
     * status : true
     * total : 0
     * tngou : []
     */

    private boolean status;
    private int total;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
