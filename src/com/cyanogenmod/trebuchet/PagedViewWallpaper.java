/*
 * Copyright (C) 2010 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cyanogenmod.trebuchet;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


/**
 * 2012-8-31 hhl
 * PagedViewWallpaper.java
 * Trebuchet
 * TODO: editstate bottom layout choice wallpaper display item view
 */
public class PagedViewWallpaper extends ImageView {
	
	//private TextView mTextView; //used for the parent is linearlayout
	
    public PagedViewWallpaper(Context context) {
        this(context, null);
    }

    public PagedViewWallpaper(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PagedViewWallpaper(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        //mTextView = (TextView)this.findViewById(R.id.editstate_tabhost_tabcontent_wallpaper_id);
    }

    public void applyFromShenduPrograme(ShenduPrograme info,HolographicOutlineHelper holoOutlineHelper) {
        int bgResId = 0;
        /*if(mTextView==null){
        	mTextView = (TextView)this.findViewById(R.id.editstate_tabhost_tabcontent_wallpaper_id);
        }*/
        if(info.getChoice()==ShenduPrograme.CHOICE_WALLPAPER_LAUNCHER){
        	bgResId = R.drawable.editstate_tabhost_tabcontent_wallpaper_bg;
        	setImageResource(info.getResSmallId());
        	//mTextView.setBackgroundResource(info.getResSmallId());
        }else if(info.getChoice()==ShenduPrograme.CHOICE_WALLPAPER_CURRENT){
        	bgResId = R.drawable.editstate_tabhost_tabcontent_wallpaper_bg;
        	setImageDrawable(info.getResDrawable());
        	//mTextView.setBackgroundDrawable(info.getResDrawable());
        }else if(info.getChoice()==ShenduPrograme.CHOICE_WALLPAPER_MORE){
        	bgResId = info.getResSmallId();
        }
        setBackgroundResource(bgResId);
        setTag(info);
    }

}