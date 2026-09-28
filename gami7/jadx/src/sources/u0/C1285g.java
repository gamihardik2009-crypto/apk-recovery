package u0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1285g implements InterfaceC1283f {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f11050a;

    public C1285g(Context context) {
        Object systemService = context.getSystemService("accessibility");
        z2.h.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f11050a = (AccessibilityManager) systemService;
    }
}
