package s;

import m2.C0880v;
import r0.AbstractC1102P;
import r0.AbstractC1103Q;
import r0.InterfaceC1096J;

/* loaded from: classes.dex */
public final class d0 extends z2.i implements y2.c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f10128i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10129j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC1103Q f10130k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f10131l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1096J f10132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, int i2, AbstractC1103Q abstractC1103Q, int i3, InterfaceC1096J interfaceC1096J) {
        super(1);
        this.f10128i = e0Var;
        this.f10129j = i2;
        this.f10130k = abstractC1103Q;
        this.f10131l = i3;
        this.f10132m = interfaceC1096J;
    }

    @Override // y2.c
    public final Object l(Object obj) {
        y2.e eVar = this.f10128i.f10142w;
        AbstractC1103Q abstractC1103Q = this.f10130k;
        AbstractC1102P.e((AbstractC1102P) obj, abstractC1103Q, ((O0.h) eVar.j(new O0.j(l0.c.e(this.f10129j - abstractC1103Q.f9834h, this.f10131l - abstractC1103Q.f9835i)), this.f10132m.getLayoutDirection())).f5141a);
        return C0880v.f8657a;
    }
}
