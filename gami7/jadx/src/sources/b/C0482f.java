package b;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0465n;
import androidx.lifecycle.InterfaceC0470t;

/* renamed from: b.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0482f implements androidx.lifecycle.r {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0499w f6978h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0489m f6979i;

    public /* synthetic */ C0482f(C0499w c0499w, AbstractActivityC0489m abstractActivityC0489m) {
        this.f6978h = c0499w;
        this.f6979i = abstractActivityC0489m;
    }

    @Override // androidx.lifecycle.r
    public final void d(InterfaceC0470t interfaceC0470t, EnumC0465n enumC0465n) {
        C0499w c0499w = this.f6978h;
        z2.h.f(c0499w, "$dispatcher");
        AbstractActivityC0489m abstractActivityC0489m = this.f6979i;
        z2.h.f(abstractActivityC0489m, "this$0");
        if (enumC0465n == EnumC0465n.ON_CREATE) {
            OnBackInvokedDispatcher a3 = C0483g.f6980a.a(abstractActivityC0489m);
            z2.h.f(a3, "invoker");
            c0499w.f7044e = a3;
            c0499w.d(c0499w.f7046g);
        }
    }
}
