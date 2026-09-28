package androidx.lifecycle;

import B1.RunnableC0015e;
import android.os.Handler;

/* loaded from: classes.dex */
public final class D implements InterfaceC0470t {

    /* renamed from: p, reason: collision with root package name */
    public static final D f6808p = new D();

    /* renamed from: h, reason: collision with root package name */
    public int f6809h;

    /* renamed from: i, reason: collision with root package name */
    public int f6810i;

    /* renamed from: l, reason: collision with root package name */
    public Handler f6813l;

    /* renamed from: j, reason: collision with root package name */
    public boolean f6811j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6812k = true;

    /* renamed from: m, reason: collision with root package name */
    public final C0472v f6814m = new C0472v(this);

    /* renamed from: n, reason: collision with root package name */
    public final RunnableC0015e f6815n = new RunnableC0015e(6, this);

    /* renamed from: o, reason: collision with root package name */
    public final B.F f6816o = new B.F(12, this);

    public final void a() {
        int i2 = this.f6810i + 1;
        this.f6810i = i2;
        if (i2 == 1) {
            if (this.f6811j) {
                this.f6814m.d(EnumC0465n.ON_RESUME);
                this.f6811j = false;
            } else {
                Handler handler = this.f6813l;
                z2.h.c(handler);
                handler.removeCallbacks(this.f6815n);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0470t
    public final C0472v e() {
        return this.f6814m;
    }
}
