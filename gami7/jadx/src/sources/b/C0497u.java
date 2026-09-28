package b;

import a0.C0428e;
import androidx.lifecycle.C0472v;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;

/* renamed from: b.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0497u implements androidx.lifecycle.r, InterfaceC0479c {

    /* renamed from: h, reason: collision with root package name */
    public final C0472v f7034h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0491o f7035i;

    /* renamed from: j, reason: collision with root package name */
    public C0498v f7036j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0499w f7037k;

    public C0497u(C0499w c0499w, C0472v c0472v, AbstractC0491o abstractC0491o) {
        z2.h.f(abstractC0491o, "onBackPressedCallback");
        this.f7037k = c0499w;
        this.f7034h = c0472v;
        this.f7035i = abstractC0491o;
        c0472v.a(this);
    }

    @Override // b.InterfaceC0479c
    public final void cancel() {
        this.f7034h.f(this);
        AbstractC0491o abstractC0491o = this.f7035i;
        abstractC0491o.getClass();
        abstractC0491o.f7022b.remove(this);
        C0498v c0498v = this.f7036j;
        if (c0498v != null) {
            c0498v.cancel();
        }
        this.f7036j = null;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        if (enumC0465n != EnumC0465n.ON_START) {
            if (enumC0465n != EnumC0465n.ON_STOP) {
                if (enumC0465n == EnumC0465n.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                C0498v c0498v = this.f7036j;
                if (c0498v != null) {
                    c0498v.cancel();
                    return;
                }
                return;
            }
        }
        C0499w c0499w = this.f7037k;
        c0499w.getClass();
        AbstractC0491o abstractC0491o = this.f7035i;
        z2.h.f(abstractC0491o, "onBackPressedCallback");
        c0499w.f7041b.f(abstractC0491o);
        C0498v c0498v2 = new C0498v(c0499w, abstractC0491o);
        abstractC0491o.f7022b.add(c0498v2);
        c0499w.e();
        abstractC0491o.f7023c = new C0428e(0, c0499w, C0499w.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3);
        this.f7036j = c0498v2;
    }
}
