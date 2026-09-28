package n;

import J.C0275l;
import J.C0285q;

/* renamed from: n.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912u extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f8855i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f8856j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ A0.h f8857k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y2.a f8858l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0912u(boolean z3, String str, A0.h hVar, y2.a aVar) {
        super(3);
        this.f8855i = z3;
        this.f8856j = str;
        this.f8857k = hVar;
        this.f8858l = aVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        r.l lVar;
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.U(-756081143);
        T t3 = (T) c0285q.l(androidx.compose.foundation.d.f6584a);
        if (t3 instanceof C0883B) {
            c0285q.U(617140216);
            c0285q.r(false);
            lVar = null;
        } else {
            c0285q.U(617248189);
            Object K3 = c0285q.K();
            if (K3 == C0275l.f4150a) {
                K3 = B1.t.o(c0285q);
            }
            lVar = (r.l) K3;
            c0285q.r(false);
        }
        r.l lVar2 = lVar;
        V.o c3 = androidx.compose.foundation.a.c(V.l.f5857b, lVar2, t3, this.f8855i, this.f8856j, this.f8857k, this.f8858l);
        c0285q.r(false);
        return c3;
    }
}
