package com.smartclient.client.widgets;

import com.smartclient.annotation.OverridePoint;


public class Widget {

    public void nonOverridePointMethod() {
        
    }

    @OverridePoint
    public void overridePointMethod() {
    }

}
