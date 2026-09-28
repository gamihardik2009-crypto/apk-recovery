package androidx.compose.foundation.selection;

import A0.h;
import B1.t;
import G.e;
import J.C0275l;
import J.C0285q;
import V.o;
import androidx.compose.foundation.d;
import n.T;
import r.l;
import y2.f;
import z2.i;

/* loaded from: classes.dex */
public final class c extends i implements f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ T f6692i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ B0.a f6693j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f6694k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f6695l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y2.a f6696m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, B0.a aVar, boolean z3, h hVar, y2.a aVar2) {
        super(3);
        this.f6692i = eVar;
        this.f6693j = aVar;
        this.f6694k = z3;
        this.f6695l = hVar;
        this.f6696m = aVar2;
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
        o k3 = d.a(V.l.f5857b, lVar, this.f6692i).k(new TriStateToggleableElement(this.f6693j, lVar, null, this.f6694k, this.f6695l, this.f6696m));
        c0285q.r(false);
        return k3;
    }
}
