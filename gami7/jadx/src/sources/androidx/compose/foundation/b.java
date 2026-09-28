package androidx.compose.foundation;

import A0.h;
import B1.t;
import J.C0275l;
import J.C0285q;
import V.o;
import n.T;
import r.l;
import y2.f;
import z2.i;

/* loaded from: classes.dex */
public final class b extends i implements f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f6579i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6580j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f6581k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f6582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.a f6583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(T t3, boolean z3, String str, h hVar, y2.a aVar) {
        super(3);
        this.f6579i = t3;
        this.f6580j = z3;
        this.f6581k = str;
        this.f6582l = hVar;
        this.f6583m = aVar;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.U(-1525724089);
        Object K3 = c0285q.K();
        if (K3 == C0275l.f4150a) {
            K3 = t.o(c0285q);
        }
        l lVar = (l) K3;
        o k3 = d.a(V.l.f5857b, lVar, this.f6579i).k(new ClickableElement(lVar, null, this.f6580j, this.f6581k, this.f6582l, this.f6583m));
        c0285q.r(false);
        return k3;
    }
}
