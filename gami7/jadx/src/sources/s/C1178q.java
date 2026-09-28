package s;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1093G;
import r0.InterfaceC1096J;

/* renamed from: s.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1178q extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f10169i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1093G f10170j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f10171k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10172l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f10173m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f10174n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1178q(AbstractC1103Q abstractC1103Q, InterfaceC1093G interfaceC1093G, InterfaceC1096J interfaceC1096J, int i2, int i3, r rVar) {
        super(1);
        this.f10169i = abstractC1103Q;
        this.f10170j = interfaceC1093G;
        this.f10171k = interfaceC1096J;
        this.f10172l = i2;
        this.f10173m = i3;
        this.f10174n = rVar;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        O0.k layoutDirection = this.f10171k.getLayoutDirection();
        V.c cVar = this.f10174n.f10175a;
        AbstractC1177p.b((AbstractC1102P) obj, this.f10169i, this.f10170j, layoutDirection, this.f10172l, this.f10173m, cVar);
        return C0880v.f8657a;
    }
}
