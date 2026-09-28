package z;

import J.C0275l;
import J.C0285q;
import J.W0;
import u0.AbstractC1296l0;

/* renamed from: z.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1408H extends z2.i implements y2.f {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11515i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f11516j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0.K f11517k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408H(int i2, int i3, C0.K k3) {
        super(3);
        this.f11515i = i2;
        this.f11516j = i3;
        this.f11517k = k3;
    }

    @Override // y2.f
    public final Object i(Object obj, Object obj2, Object obj3) {
        C0285q c0285q = (C0285q) obj2;
        ((Number) obj3).intValue();
        c0285q.U(408240218);
        int i2 = this.f11515i;
        int i3 = this.f11516j;
        N.y(i2, i3);
        V.l lVar = V.l.f5857b;
        if (i2 == 1 && i3 == Integer.MAX_VALUE) {
            c0285q.r(false);
            return lVar;
        }
        O0.b bVar = (O0.b) c0285q.l(AbstractC1296l0.f11087f);
        H0.d dVar = (H0.d) c0285q.l(AbstractC1296l0.f11090i);
        O0.k kVar = (O0.k) c0285q.l(AbstractC1296l0.f11093l);
        C0.K k3 = this.f11517k;
        boolean g3 = c0285q.g(k3) | c0285q.g(kVar);
        Object K3 = c0285q.K();
        J.W w2 = C0275l.f4150a;
        if (g3 || K3 == w2) {
            K3 = B2.a.C(k3, kVar);
            c0285q.e0(K3);
        }
        C0.K k4 = (C0.K) K3;
        boolean g4 = c0285q.g(dVar) | c0285q.g(k4);
        Object K4 = c0285q.K();
        if (g4 || K4 == w2) {
            C0.C c3 = k4.f475a;
            H0.q qVar = c3.f432f;
            H0.k kVar2 = c3.f429c;
            if (kVar2 == null) {
                kVar2 = H0.k.f3401j;
            }
            H0.i iVar = c3.f430d;
            int i4 = iVar != null ? iVar.f3398a : 0;
            H0.j jVar = c3.f431e;
            K4 = ((H0.e) dVar).b(qVar, kVar2, i4, jVar != null ? jVar.f3399a : 1);
            c0285q.e0(K4);
        }
        W0 w02 = (W0) K4;
        boolean g5 = c0285q.g(w02.getValue()) | c0285q.g(bVar) | c0285q.g(dVar) | c0285q.g(k3) | c0285q.g(kVar);
        Object K5 = c0285q.K();
        if (g5 || K5 == w2) {
            K5 = Integer.valueOf((int) (d0.a(k4, bVar, dVar, d0.f11642a, 1) & 4294967295L));
            c0285q.e0(K5);
        }
        int intValue = ((Number) K5).intValue();
        boolean g6 = c0285q.g(w02.getValue()) | c0285q.g(bVar) | c0285q.g(dVar) | c0285q.g(k3) | c0285q.g(kVar);
        Object K6 = c0285q.K();
        if (g6 || K6 == w2) {
            StringBuilder sb = new StringBuilder();
            String str = d0.f11642a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            K6 = Integer.valueOf((int) (d0.a(k4, bVar, dVar, sb.toString(), 2) & 4294967295L));
            c0285q.e0(K6);
        }
        int intValue2 = ((Number) K6).intValue() - intValue;
        Integer valueOf = i2 == 1 ? null : Integer.valueOf(((i2 - 1) * intValue2) + intValue);
        Integer valueOf2 = i3 != Integer.MAX_VALUE ? Integer.valueOf(((i3 - 1) * intValue2) + intValue) : null;
        V.o c4 = androidx.compose.foundation.layout.c.c(lVar, valueOf != null ? bVar.o0(valueOf.intValue()) : Float.NaN, valueOf2 != null ? bVar.o0(valueOf2.intValue()) : Float.NaN);
        c0285q.r(false);
        return c4;
    }
}
