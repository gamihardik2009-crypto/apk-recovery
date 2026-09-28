package z0;

import A0.t;
import B1.C;
import C1.y;
import m2.C0880v;
import n2.AbstractC0946A;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;

/* loaded from: classes.dex */
public final class e extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public boolean f11868l;

    /* renamed from: m, reason: collision with root package name */
    public int f11869m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ float f11870n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f f11871o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f11871o = fVar;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((e) m(Float.valueOf(((Number) obj).floatValue()), (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        e eVar = new e(this.f11871o, interfaceC1073d);
        eVar.f11870n = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        boolean z3;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f11869m;
        if (i2 == 0) {
            y.J(obj);
            float f3 = this.f11870n;
            f fVar = this.f11871o;
            y2.e eVar = (y2.e) C.T(fVar.f11872a.f72d, A0.j.f39e);
            if (eVar == null) {
                AbstractC0946A.s("Required value was null.");
                throw null;
            }
            boolean z4 = ((A0.i) fVar.f11872a.f72d.b(t.f110p)).f33c;
            if (z4) {
                f3 = -f3;
            }
            b0.c cVar = new b0.c(K1.f.e(0.0f, f3));
            this.f11868l = z4;
            this.f11869m = 1;
            obj = eVar.j(cVar, this);
            if (obj == enumC1145a) {
                return enumC1145a;
            }
            z3 = z4;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = this.f11868l;
            y.J(obj);
        }
        float e3 = b0.c.e(((b0.c) obj).f7058a);
        if (z3) {
            e3 = -e3;
        }
        return new Float(e3);
    }
}
