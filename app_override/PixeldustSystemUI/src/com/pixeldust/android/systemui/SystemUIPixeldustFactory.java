package com.pixeldust.android.systemui;

import android.content.Context;

import com.pixeldust.android.systemui.dagger.DaggerGlobalRootComponentPixeldust;
import com.pixeldust.android.systemui.dagger.GlobalRootComponentPixeldust;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;

public class SystemUIPixeldustFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentPixeldust.builder()
                .context(context)
                .build();
    }
}
