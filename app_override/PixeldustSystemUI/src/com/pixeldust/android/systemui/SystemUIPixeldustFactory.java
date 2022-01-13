package com.pixeldust.android.systemui;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;

import com.android.systemui.SystemUIFactory;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.screenshot.ScreenshotNotificationSmartActionsProvider;

import com.pixeldust.android.systemui.backgesture.CustomBackGestureTfClassifierProvider;
import com.pixeldust.android.systemui.dagger.DaggerGlobalRootComponentPixeldust;
import com.pixeldust.android.systemui.dagger.GlobalRootComponentPixeldust;
import com.pixeldust.android.systemui.dagger.SysUIComponentPixeldust;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public class SystemUIPixeldustFactory extends SystemUIFactory {
    @Override
    protected GlobalRootComponent buildGlobalRootComponent(Context context) {
        return DaggerGlobalRootComponentPixeldust.builder()
                .context(context)
                .build();
    }

    @Override
    public CustomBackGestureTfClassifierProvider createBackGestureTfClassifierProvider(AssetManager am, String modelName) {
        return new CustomBackGestureTfClassifierProvider(am, modelName);
    }

    @Override
    public void init(Context context, boolean fromTest) throws ExecutionException, InterruptedException {
        super.init(context, fromTest);
        if (shouldInitializeComponents()) {
            ((SysUIComponentPixeldust) getSysUIComponent()).createKeyguardSmartspaceController();
        }
    }
}
