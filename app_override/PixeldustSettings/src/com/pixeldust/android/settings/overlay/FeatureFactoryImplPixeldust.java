package com.pixeldust.android.settings.overlay;

import android.content.Context;

import com.android.settings.overlay.FeatureFactoryImpl;
import com.android.settings.fuelgauge.PowerUsageFeatureProvider;
import com.google.android.settings.fuelgauge.PowerUsageFeatureProviderGoogleImpl;

public final class FeatureFactoryImplPixeldust extends FeatureFactoryImpl {

    private PowerUsageFeatureProvider mPowerUsageFeatureProvider;

    @Override
    public PowerUsageFeatureProvider getPowerUsageFeatureProvider(Context context) {
        if (mPowerUsageFeatureProvider == null) {
            mPowerUsageFeatureProvider = new PowerUsageFeatureProviderGoogleImpl(
                    context.getApplicationContext());
        }
        return mPowerUsageFeatureProvider;
    }
}
