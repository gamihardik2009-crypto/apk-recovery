package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0473w extends Service implements InterfaceC0470t {

    /* renamed from: h, reason: collision with root package name */
    public final Q1.r f6916h = new Q1.r(this);

    @Override // androidx.lifecycle.InterfaceC0470t
    public final C0472v e() {
        return (C0472v) this.f6916h.f5322b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        z2.h.f(intent, "intent");
        this.f6916h.e(EnumC0465n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f6916h.e(EnumC0465n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0465n enumC0465n = EnumC0465n.ON_STOP;
        Q1.r rVar = this.f6916h;
        rVar.e(enumC0465n);
        rVar.e(EnumC0465n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i2) {
        this.f6916h.e(EnumC0465n.ON_START);
        super.onStart(intent, i2);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
