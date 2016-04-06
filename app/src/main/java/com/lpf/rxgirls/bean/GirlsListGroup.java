package com.lpf.rxgirls.bean;

import com.lpf.rxgirls.base.BaseBean;

import java.util.List;

/**
 * Created by Administrator on 2016/4/6.
 */
public class GirlsListGroup extends BaseBean{

    /**
     * count : 6135
     * fcount : 0
     * galleryclass : 3
     * id : 710
     * img : /ext/160321/e57d5816cb72d7486aa6dbf19a7d0c6c.jpg
     * rcount : 0
     * size : 16
     * time : 1458561029000
     * title : 很诱人的美女翘臀诱惑那超波肉丝腿真长
     */

    private List<TngouEntity> tngou;

    public List<TngouEntity> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouEntity> tngou) {
        this.tngou = tngou;
    }

    public static class TngouEntity {
        private int count;
        private int fcount;
        private int galleryclass;
        private int id;
        private String img;
        private int rcount;
        private int size;
        private long time;
        private String title;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getFcount() {
            return fcount;
        }

        public void setFcount(int fcount) {
            this.fcount = fcount;
        }

        public int getGalleryclass() {
            return galleryclass;
        }

        public void setGalleryclass(int galleryclass) {
            this.galleryclass = galleryclass;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public int getRcount() {
            return rcount;
        }

        public void setRcount(int rcount) {
            this.rcount = rcount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
