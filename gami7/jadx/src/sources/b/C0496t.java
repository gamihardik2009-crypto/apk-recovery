package b;

import android.window.OnBackInvokedCallback;

/* renamed from: b.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0496t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0496t f7033a = new C0496t();

    public final OnBackInvokedCallback a(y2.c cVar, y2.c cVar2, y2.a aVar, y2.a aVar2) {
        z2.h.f(cVar, "onBackStarted");
        z2.h.f(cVar2, "onBackProgressed");
        z2.h.f(aVar, "onBackInvoked");
        z2.h.f(aVar2, "onBackCancelled");
        return new C0495s(cVar, cVar2, aVar, aVar2);
    }
}
