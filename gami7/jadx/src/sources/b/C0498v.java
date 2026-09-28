package b;

import n2.C0958j;

/* renamed from: b.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0498v implements InterfaceC0479c {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0491o f7038h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0499w f7039i;

    public C0498v(C0499w c0499w, AbstractC0491o abstractC0491o) {
        z2.h.f(abstractC0491o, "onBackPressedCallback");
        this.f7039i = c0499w;
        this.f7038h = abstractC0491o;
    }

    @Override // b.InterfaceC0479c
    public final void cancel() {
        C0499w c0499w = this.f7039i;
        C0958j c0958j = c0499w.f7041b;
        AbstractC0491o abstractC0491o = this.f7038h;
        c0958j.remove(abstractC0491o);
        if (z2.h.a(c0499w.f7042c, abstractC0491o)) {
            abstractC0491o.a();
            c0499w.f7042c = null;
        }
        abstractC0491o.getClass();
        abstractC0491o.f7022b.remove(this);
        y2.a aVar = abstractC0491o.f7023c;
        if (aVar != null) {
            aVar.c();
        }
        abstractC0491o.f7023c = null;
    }
}
