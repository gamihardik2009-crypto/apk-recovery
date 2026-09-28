package c;

import C1.y;
import D.S;
import H.I3;
import J2.InterfaceC0328z;
import M2.C0340d;
import M2.C0355t;
import m2.C0880v;
import q2.InterfaceC1073d;
import r2.EnumC1145a;
import s2.AbstractC1204i;
import z2.o;

/* renamed from: c.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557g extends AbstractC1204i implements y2.e {

    /* renamed from: l, reason: collision with root package name */
    public o f7168l;

    /* renamed from: m, reason: collision with root package name */
    public int f7169m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y2.e f7170n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ S f7171o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0557g(y2.e eVar, S s3, InterfaceC1073d interfaceC1073d) {
        super(2, interfaceC1073d);
        this.f7170n = eVar;
        this.f7171o = s3;
    }

    @Override // y2.e
    public final Object j(Object obj, Object obj2) {
        return ((C0557g) m((InterfaceC0328z) obj, (InterfaceC1073d) obj2)).p(C0880v.f8657a);
    }

    @Override // s2.AbstractC1196a
    public final InterfaceC1073d m(Object obj, InterfaceC1073d interfaceC1073d) {
        return new C0557g(this.f7170n, this.f7171o, interfaceC1073d);
    }

    @Override // s2.AbstractC1196a
    public final Object p(Object obj) {
        o oVar;
        EnumC1145a enumC1145a = EnumC1145a.f10026h;
        int i2 = this.f7169m;
        boolean z3 = true;
        if (i2 == 0) {
            y.J(obj);
            o oVar2 = new o();
            C0355t c0355t = new C0355t(new C0340d((L2.g) this.f7171o.f763c, z3), new I3(oVar2, null, 1));
            this.f7168l = oVar2;
            this.f7169m = 1;
            if (this.f7170n.j(c0355t, this) == enumC1145a) {
                return enumC1145a;
            }
            oVar = oVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.f7168l;
            y.J(obj);
        }
        if (oVar.f11905h) {
            return C0880v.f8657a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }
}
