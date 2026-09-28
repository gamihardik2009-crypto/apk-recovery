package l;

import C0.C0018a;
import D.e0;
import H.R3;
import J.C0274k0;
import J.C0275l;
import J.C0285q;
import m.p0;
import m2.C0880v;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797f extends z2.i implements y2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p0 f8204i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f8205j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y2.c f8206k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0805n f8207l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T.r f8208m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.g f8209n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797f(p0 p0Var, Object obj, y2.c cVar, C0805n c0805n, T.r rVar, y2.g gVar) {
        super(2);
        this.f8204i = p0Var;
        this.f8205j = obj;
        this.f8206k = cVar;
        this.f8207l = c0805n;
        this.f8208m = rVar;
        this.f8209n = gVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        C0285q c0285q = (C0285q) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0285q.A()) {
            c0285q.P();
        } else {
            Object K3 = c0285q.K();
            Object obj3 = C0275l.f4150a;
            y2.c cVar = this.f8206k;
            C0805n c0805n = this.f8207l;
            if (K3 == obj3) {
                K3 = (C0811u) cVar.l(c0805n);
                c0285q.e0(K3);
            }
            C0811u c0811u = (C0811u) K3;
            p0 p0Var = this.f8204i;
            Object c3 = p0Var.f().c();
            Object obj4 = this.f8205j;
            boolean h2 = c0285q.h(z2.h.a(c3, obj4));
            Object K4 = c0285q.K();
            if (h2 || K4 == obj3) {
                K4 = z2.h.a(p0Var.f().c(), obj4) ? C0791F.f8129b : ((C0811u) cVar.l(c0805n)).f8243b;
                c0285q.e0(K4);
            }
            C0791F c0791f = (C0791F) K4;
            Object K5 = c0285q.K();
            C0274k0 c0274k0 = p0Var.f8550d;
            if (K5 == obj3) {
                K5 = new C0802k(z2.h.a(obj4, c0274k0.getValue()));
                c0285q.e0(K5);
            }
            C0802k c0802k = (C0802k) K5;
            C0790E c0790e = c0811u.f8242a;
            V.l lVar = V.l.f5857b;
            boolean i2 = c0285q.i(c0811u);
            Object K6 = c0285q.K();
            if (i2 || K6 == obj3) {
                K6 = new e0(5, c0811u);
                c0285q.e0(K6);
            }
            V.o b3 = androidx.compose.ui.layout.a.b(lVar, (y2.f) K6);
            c0802k.f8218b.setValue(Boolean.valueOf(z2.h.a(obj4, c0274k0.getValue())));
            V.o k3 = b3.k(c0802k);
            boolean i3 = c0285q.i(obj4);
            Object K7 = c0285q.K();
            if (i3 || K7 == obj3) {
                K7 = new C0796e(0, obj4);
                c0285q.e0(K7);
            }
            y2.c cVar2 = (y2.c) K7;
            boolean g3 = c0285q.g(c0791f);
            Object K8 = c0285q.K();
            if (g3 || K8 == obj3) {
                K8 = new C0018a(10, c0791f);
                c0285q.e0(K8);
            }
            androidx.compose.animation.a.a(this.f8204i, cVar2, k3, c0790e, c0791f, (y2.e) K8, R.b.c(-616195562, new R3(this.f8208m, obj4, c0805n, this.f8209n, 1), c0285q), c0285q, 12582912, 64);
        }
        return C0880v.f8657a;
    }
}
