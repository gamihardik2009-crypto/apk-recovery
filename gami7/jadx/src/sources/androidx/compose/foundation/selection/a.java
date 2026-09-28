package androidx.compose.foundation.selection;

import A0.h;
import B1.t;
import J.C0275l;
import J.C0285q;
import V.o;
import androidx.compose.foundation.d;
import n.T;
import r.l;
import y2.f;
import z2.i;

/* loaded from: classes.dex */
public final class a extends i implements f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f6687i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f6688j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f6689k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f6690l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.a f6691m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(T t3, boolean z3, boolean z4, h hVar, y2.a aVar) {
        super(3);
        this.f6687i = t3;
        this.f6688j = z3;
        this.f6689k = z4;
        this.f6690l = hVar;
        this.f6691m = aVar;
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
        o k3 = d.a(V.l.f5857b, lVar, this.f6687i).k(new SelectableElement(this.f6688j, lVar, null, this.f6689k, this.f6690l, this.f6691m));
        c0285q.r(false);
        return k3;
    }
}
