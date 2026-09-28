package t0;

import m2.C0880v;
import r0.AbstractC1102P;
import u0.C1314v;

/* renamed from: t0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240I extends z2.i implements y2.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ L f10418i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f10419j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f10420k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240I(L l3, f0 f0Var, long j3) {
        super(0);
        this.f10418i = l3;
        this.f10419j = f0Var;
        this.f10420k = j3;
    }

    @Override // y2.a
    public final Object c() {
        O R02;
        L l3 = this.f10418i;
        AbstractC1102P abstractC1102P = null;
        if (AbstractC1248f.r(l3.f10464a)) {
            Z z3 = l3.a().f10549v;
            if (z3 != null) {
                abstractC1102P = z3.f10488p;
            }
        } else {
            Z z4 = l3.a().f10549v;
            if (z4 != null && (R02 = z4.R0()) != null) {
                abstractC1102P = R02.f10488p;
            }
        }
        if (abstractC1102P == null) {
            abstractC1102P = ((C1314v) this.f10419j).getPlacementScope();
        }
        O R03 = l3.a().R0();
        z2.h.c(R03);
        AbstractC1102P.e(abstractC1102P, R03, this.f10420k);
        return C0880v.f8657a;
    }
}
